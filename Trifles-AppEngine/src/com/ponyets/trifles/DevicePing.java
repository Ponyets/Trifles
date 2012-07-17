package com.ponyets.trifles;

import com.google.android.gcm.server.*;

import com.ponyets.trifles.DeviceInfo;

import java.io.IOException;

public class DevicePing {

  private static final String API_KEY = "";
  private static final DeviceInfoEndpoint endpoint = new DeviceInfoEndpoint();

  /**
   * Sends the message using the Sender object to the registered device.
   *
   * @param message the message to be sent in the GCM ping to the device.
   * @param sender the Sender object to be used for ping,
   * @param deviceInfo the registration id of the device.
   * @return Result the result of the ping.
   */
  private static Result doSendViaGcm(String message, Sender sender, DeviceInfo deviceInfo) throws IOException {
    // Trim message if needed.
    if (message.length() > 1000) {
      message = message.substring(0, 1000) + "[...]";
    }
    
    Message msg = new Message.Builder().addData("message", message).build();
    Result result = sender.send(msg, deviceInfo.getDeviceRegistrationID(), 5);
    if (result.getMessageId() != null) {
      String canonicalRegId = result.getCanonicalRegistrationId();
      if (canonicalRegId != null) {
        endpoint.removeDeviceInfo(deviceInfo.getDeviceRegistrationID());
        deviceInfo.setDeviceRegistrationID(canonicalRegId);
        endpoint.insertDeviceInfo(deviceInfo);
      }
    } else {
        String error = result.getErrorCodeName();
        if (error.equals(Constants.ERROR_NOT_REGISTERED)) {
          endpoint.removeDeviceInfo(deviceInfo.getDeviceRegistrationID());
        }
    }

    return result;
  }

  /**
   * Ping all registered devices with the message.
   *
   * @param message the message to be sent in the GCM ping to all
   * registered devices.
   */
  public static void pingAllDevices(String message) throws IOException {
    Sender sender = new Sender(API_KEY);
    for (DeviceInfo deviceInfo : endpoint.listDeviceInfo()) {
      doSendViaGcm(message, sender, deviceInfo);
    }
  }

}
