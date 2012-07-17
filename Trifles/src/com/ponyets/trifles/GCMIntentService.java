package com.ponyets.trifles;

import com.google.android.gcm.GCMBaseIntentService;
import com.google.android.gcm.GCMRegistrar;
import com.google.api.client.extensions.android2.AndroidHttp;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.json.jackson.JacksonFactory;

import java.io.IOException;
import android.content.Context;
import android.content.Intent;
import com.appspot.api.services.deviceinfoendpoint.Deviceinfoendpoint;
import com.appspot.api.services.deviceinfoendpoint.Deviceinfoendpoint.Builder;
import com.appspot.api.services.deviceinfoendpoint.model.DeviceInfo;


/**
 * Receive a push message from the Cloud to Device Messaging (C2DM) service.
 * This class should be modified to include functionality specific to your
 * application. This class must have a no-arg constructor and pass the sender id
 * to the superclass constructor.
 */
public class GCMIntentService extends GCMBaseIntentService {

  private final Deviceinfoendpoint endpoint;
  private static final String PROJECT_ID = "";

  /**
   * Register the device for GCM.
   *
   * @param mContext the activity's context.
   */
  public static void register(Context mContext) {
    GCMRegistrar.checkDevice(mContext);
    GCMRegistrar.checkManifest(mContext);
    GCMRegistrar.register(mContext, PROJECT_ID);
  }

  public GCMIntentService() {
    super(PROJECT_ID);
    Builder endpointBuilder = new Deviceinfoendpoint.Builder(AndroidHttp.newCompatibleTransport(),
        new JacksonFactory(), new HttpRequestInitializer() {
            public void initialize(HttpRequest httpRequest) {
            }
    });
    endpoint = CloudEndpointUtils.updateBuilder(endpointBuilder).build();
  }

  /**
   * Called on registration error. This is called in the context of a Service
   * - no dialog or UI.
   * 
   * @param context the Context
   * @param errorId an error message
   */
  @Override
  public void onError(Context context, String errorId) {
  }

  /**
   * Called when a cloud message has been received.
   */
  @Override
  public void onMessage(Context context, Intent intent) {
    /*
     * Replace this with your application-specific code
     */
    System.out.println("C2DM Message: " + intent.getStringExtra("message"));
  }

  /**
   * Called when a registration token has been received.
   * 
   * @param context the Context
   */
  @Override
  public void onRegistered(Context context, String registration) {
    try {
      endpoint.insertDeviceInfo(new DeviceInfo().setDeviceRegistrationID(registration)).execute();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  /**
   * Called when the device has been unregistered.
   * 
   * @param context the Context
   */
  @Override
  protected void onUnregistered(Context context, String registrationId) {
  }
}
