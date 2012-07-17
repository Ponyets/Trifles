package com.ponyets.trifles;

import com.ponyets.trifles.EMF;

import com.google.api.server.spi.config.Api;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.Query;

@Api(name = "peopleendpoint")
public class PeopleEndpoint {

  /**
   * This method lists all the entities inserted in datastore.
   * It uses HTTP GET method.
   *
   * @return List of all entities persisted.
   */
  @SuppressWarnings({"cast", "unchecked"})
  public List<People> listPeople() {
    EntityManager mgr = getEntityManager();
    List<People> result = new ArrayList<People>();
    try{
      Query query = mgr.createQuery("select from People");
      for (Object obj : (List<Object>) query.getResultList()) {
        result.add(((People) obj));
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
  public People getPeople(@Named("id") Long id) {
    EntityManager mgr = getEntityManager();
    People people  = null;
    try {
      people = mgr.find(People.class, id);
    } finally {
      mgr.close();
    }
    return people;
  }

  /**
   * This inserts the entity into App Engine datastore.
   * It uses HTTP POST method.
   *
   * @param people the entity to be inserted.
   * @return The inserted entity.
   */
  public People insertPeople(People people) {
    EntityManager mgr = getEntityManager();
    try {
      mgr.persist(people);
    } finally {
      mgr.close();
    }
    return people;
  }

  /**
   * This method is used for updating a entity.
   * It uses HTTP PUT method.
   *
   * @param people the entity to be updated.
   * @return The updated entity.
   */
  public People updatePeople(People people) {
    EntityManager mgr = getEntityManager();
    try {
      mgr.persist(people);
    } finally {
      mgr.close();
    }
    return people;
  }

  /**
   * This method removes the entity with primary key id.
   * It uses HTTP DELETE method.
   *
   * @param id the primary key of the entity to be deleted.
   * @return The deleted entity.
   */
  public People removePeople(@Named("id") Long id) {
    EntityManager mgr = getEntityManager();
     People people  = null;
    try {
      people = mgr.find(People.class, id);
      mgr.remove(people);
    } finally {
      mgr.close();
    }
    return people;
  }

  private static EntityManager getEntityManager() {
    return EMF.get().createEntityManager();
  }

}
