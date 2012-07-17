package com.ponyets.trifles;

import com.ponyets.trifles.EMF;

import com.google.api.server.spi.config.Api;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.Query;

@Api(name = "deviceinfoendpoint")
public class DeviceInfoEndpoint {

  /**
   * This method lists all the entities inserted in datastore.
   * It uses HTTP GET method.
   *
   * @return List of all entities persisted.
   */
  @SuppressWarnings({"cast", "unchecked"})
  public List<DeviceInfo> listDeviceInfo() {
    EntityManager mgr = getEntityManager();
    List<DeviceInfo> result = new ArrayList<DeviceInfo>();
    try{
      Query query = mgr.createQuery("select from DeviceInfo");
      for (Object obj : (List<Object>) query.getResultList()) {
        result.add(((DeviceInfo) obj));
      }
    } finally {
      mgr.close();
    }
    return result;
  }

  /**
   * This method gets the entity having primary key id. It uses HTTP GET method.
   *
   * @param id the primary key of the java bean.
   * @return The entity with primary key id.
   */
  public DeviceInfo getDeviceInfo(@Named("id") String id) {
    EntityManager mgr = getEntityManager();
    DeviceInfo deviceinfo  = null;
    try {
      deviceinfo = mgr.find(DeviceInfo.class, id);
    } finally {
      mgr.close();
    }
    return deviceinfo;
  }

  /**
   * This inserts the entity into App Engine datastore.
   * It uses HTTP POST method.
   *
   * @param deviceinfo the entity to be inserted.
   * @return The inserted entity.
   */
  public DeviceInfo insertDeviceInfo(DeviceInfo deviceinfo) {
    EntityManager mgr = getEntityManager();
    try {
      mgr.persist(deviceinfo);
    } finally {
      mgr.close();
    }
    return deviceinfo;
  }

  /**
   * This method is used for updating a entity.
   * It uses HTTP PUT method.
   *
   * @param deviceinfo the entity to be updated.
   * @return The updated entity.
   */
  public DeviceInfo updateDeviceInfo(DeviceInfo deviceinfo) {
    EntityManager mgr = getEntityManager();
    try {
      mgr.persist(deviceinfo);
    } finally {
      mgr.close();
    }
    return deviceinfo;
  }

  /**
   * This method removes the entity with primary key id.
   * It uses HTTP DELETE method.
   *
   * @param id the primary key of the entity to be deleted.
   * @return The deleted entity.
   */
  public DeviceInfo removeDeviceInfo(@Named("id") String id) {
    EntityManager mgr = getEntityManager();
     DeviceInfo deviceinfo  = null;
    try {
      deviceinfo = mgr.find(DeviceInfo.class, id);
      mgr.remove(deviceinfo);
    } finally {
      mgr.close();
    }
    return deviceinfo;
  }

  private static EntityManager getEntityManager() {
    return EMF.get().createEntityManager();
  }

}
