package com.ponyets.trifles;

import com.ponyets.trifles.EMF;

import com.google.api.server.spi.config.Api;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.Query;

@Api(name = "billendpoint")
public class BillEndpoint {

  /**
   * This method lists all the entities inserted in datastore.
   * It uses HTTP GET method.
   *
   * @return List of all entities persisted.
   */
  @SuppressWarnings({"cast", "unchecked"})
  public List<Bill> listBill() {
    EntityManager mgr = getEntityManager();
    List<Bill> result = new ArrayList<Bill>();
    try{
      Query query = mgr.createQuery("select from Bill");
      for (Object obj : (List<Object>) query.getResultList()) {
        result.add(((Bill) obj));
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
  public Bill getBill(@Named("id") Long id) {
    EntityManager mgr = getEntityManager();
    Bill bill  = null;
    try {
      bill = mgr.find(Bill.class, id);
    } finally {
      mgr.close();
    }
    return bill;
  }

  /**
   * This inserts the entity into App Engine datastore.
   * It uses HTTP POST method.
   *
   * @param bill the entity to be inserted.
   * @return The inserted entity.
   */
  public Bill insertBill(Bill bill) {
    EntityManager mgr = getEntityManager();
    try {
      mgr.persist(bill);
    } finally {
      mgr.close();
    }
    return bill;
  }

  /**
   * This method is used for updating a entity.
   * It uses HTTP PUT method.
   *
   * @param bill the entity to be updated.
   * @return The updated entity.
   */
  public Bill updateBill(Bill bill) {
    EntityManager mgr = getEntityManager();
    try {
      mgr.persist(bill);
    } finally {
      mgr.close();
    }
    return bill;
  }

  /**
   * This method removes the entity with primary key id.
   * It uses HTTP DELETE method.
   *
   * @param id the primary key of the entity to be deleted.
   * @return The deleted entity.
   */
  public Bill removeBill(@Named("id") Long id) {
    EntityManager mgr = getEntityManager();
     Bill bill  = null;
    try {
      bill = mgr.find(Bill.class, id);
      mgr.remove(bill);
    } finally {
      mgr.close();
    }
    return bill;
  }

  private static EntityManager getEntityManager() {
    return EMF.get().createEntityManager();
  }

}
