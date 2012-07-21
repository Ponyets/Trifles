/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This file was generated.
 *  with google-apis-code-generator 1.1.1 (build: 2012-07-19 20:57:34 UTC)
 *  on 2012-07-20 at 11:38:53 UTC 
 */

package com.appspot.api.services.peopleendpoint;


import com.google.api.client.googleapis.services.GoogleClient;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpMethod;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.json.JsonHttpRequest;
import com.google.api.client.http.json.JsonHttpRequestInitializer;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.JsonObjectParser;
import com.google.common.base.Preconditions;

import java.io.IOException;


/**
 * Service definition for Peopleendpoint (v1).
 *
 * <p>
 * 
 * </p>
 *
 * <p>
 * For more information about this service, see the
 * <a href="" target="_blank">API Documentation</a>
 * </p>
 *
 * <p>
 * This service uses {@link JsonHttpRequestInitializer} to initialize global parameters via its
 * {@link Builder}. Sample usage:
 * </p>
 *
 * <pre>
  public class PeopleendpointRequestInitializer implements JsonHttpRequestInitializer {
      public void initialize(JsonHttpRequest request) {
        PeopleendpointRequest peopleendpointRequest = (PeopleendpointRequest)request;
        peopleendpointRequest.setPrettyPrint(true);
        peopleendpointRequest.setKey(ClientCredentials.KEY);
    }
  }
 * </pre>
 *
 * @since 1.3.0
 * @author Google, Inc.
 */
public class Peopleendpoint extends GoogleClient {

  /**
   * The default encoded base path of the service. This is determined when the library is generated
   * and normally should not be changed.
   * @deprecated (scheduled to be removed in 1.8) Use "/" + {@link #DEFAULT_SERVICE_PATH}.
   */
  @Deprecated
  public static final String DEFAULT_BASE_PATH = "/_ah/api/peopleendpoint/v1/";

  /**
   * The default encoded root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_ROOT_URL = "https://myapp.appspot.com/_ah/api/";

  /**
   * The default encoded service path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_SERVICE_PATH = "peopleendpoint/v1/";

  /**
   * The default encoded base URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   */
  public static final String DEFAULT_BASE_URL = DEFAULT_ROOT_URL + DEFAULT_SERVICE_PATH;

  /**
   * Construct a Peopleendpoint instance to connect to the Peopleendpoint service.
   *
   * <p>
   * Use {@link Builder} if you need to specify any of the optional parameters.
   * </p>
   *
   * @param transport The transport to use for requests
   * @param jsonFactory A factory for creating JSON parsers and serializers
   * @deprecated (scheduled to be removed in 1.8) Use
   *             {@link #Peopleendpoint(HttpTransport, JsonFactory, HttpRequestInitializer)}.
   */
  @Deprecated
  public Peopleendpoint(HttpTransport transport, JsonFactory jsonFactory) {
    super(transport, jsonFactory, DEFAULT_BASE_URL);
  }

  /**
   * Construct a Peopleendpoint instance to connect to the Peopleendpoint service.
   *
   * <p>
   * Use {@link Builder} if you need to specify any of the optional parameters.
   * </p>
   *
   * @param transport The transport to use for requests
   * @param jsonFactory A factory for creating JSON parsers and serializers
   * @param httpRequestInitializer The HTTP request initializer or {@code null} for none
   * @since 1.7
   */
  public Peopleendpoint(HttpTransport transport, JsonFactory jsonFactory,
      HttpRequestInitializer httpRequestInitializer) {
    super(transport, jsonFactory, DEFAULT_ROOT_URL, DEFAULT_SERVICE_PATH, httpRequestInitializer);
  }

  /**
   * Construct a Peopleendpoint instance to connect to the Peopleendpoint service.
   *
   * @param transport The transport to use for requests
   * @param jsonHttpRequestInitializer The initializer to use when creating an JSON HTTP request
   * @param httpRequestInitializer The initializer to use when creating an {@link HttpRequest}
   * @param jsonFactory A factory for creating JSON parsers and serializers
   * @param jsonObjectParser JSON parser to use or {@code null} if unused
   * @param baseUrl The base URL of the service on the server
   * @param applicationName The application name to be sent in the User-Agent header of requests
   */
  @Deprecated
  Peopleendpoint(
      HttpTransport transport,
      JsonHttpRequestInitializer jsonHttpRequestInitializer,
      HttpRequestInitializer httpRequestInitializer,
      JsonFactory jsonFactory,
      JsonObjectParser jsonObjectParser,
      String baseUrl,
      String applicationName) {
      super(transport,
          jsonHttpRequestInitializer,
          httpRequestInitializer,
          jsonFactory,
          jsonObjectParser,
          baseUrl,
          applicationName);
  }

  /**
   * Construct a Peopleendpoint instance to connect to the Peopleendpoint service.
   *
   * @param transport The transport to use for requests
   * @param jsonHttpRequestInitializer The initializer to use when creating an JSON HTTP request
   * @param httpRequestInitializer The initializer to use when creating an {@link HttpRequest}
   * @param jsonFactory A factory for creating JSON parsers and serializers
   * @param jsonObjectParser JSON parser to use or {@code null} if unused
   * @param rootUrl The root URL of the service on the server
   * @param servicePath The service path of the service on the server
   * @param applicationName The application name to be sent in the User-Agent header of requests
   */
  Peopleendpoint(
      HttpTransport transport,
      JsonHttpRequestInitializer jsonHttpRequestInitializer,
      HttpRequestInitializer httpRequestInitializer,
      JsonFactory jsonFactory,
      JsonObjectParser jsonObjectParser,
      String rootUrl,
      String servicePath,
      String applicationName) {
      super(transport,
          jsonHttpRequestInitializer,
          httpRequestInitializer,
          jsonFactory,
          jsonObjectParser,
          rootUrl,
          servicePath,
          applicationName);
  }

  @Override
  protected void initialize(JsonHttpRequest jsonHttpRequest) throws IOException {
    super.initialize(jsonHttpRequest);
  }


  /**
   * Returns an instance of a new builder.
   *
   * @param transport The transport to use for requests
   * @param jsonFactory A factory for creating JSON parsers and serializers
   * @deprecated (scheduled to removed in 1.8) Use
   *             {@link Builder#Builder(HttpTransport, JsonFactory, HttpRequestInitializer)}.
   */
   @Deprecated
   public static Builder builder(HttpTransport transport, JsonFactory jsonFactory) {
     return new Builder(transport, jsonFactory, new GenericUrl(DEFAULT_BASE_URL));
   }


  /**
   * Create a request for the method "updatePeople".
   *
   * This request holds the parameters needed by the the peopleendpoint server.  After setting any
   * optional parameters, call the {@link UpdatePeople#execute()} method to invoke the remote
   * operation.
   *
   * @param content the {@link com.appspot.api.services.peopleendpoint.model.People}
   * @return the request
   * @throws IOException if the initialization of the request fails
   */
  public UpdatePeople updatePeople(com.appspot.api.services.peopleendpoint.model.People content) throws IOException {
    UpdatePeople result = new UpdatePeople(content);
    initialize(result);
    return result;
  }


  public class UpdatePeople extends PeopleendpointRequest {

    private static final String REST_PATH = "people";

    /**
     * Internal constructor.  Use the convenience method instead.
     */
    UpdatePeople(com.appspot.api.services.peopleendpoint.model.People content) {
      super(Peopleendpoint.this, HttpMethod.PUT, REST_PATH, content);
      Preconditions.checkNotNull(content);
    }



    /**
     * Sends the "updatePeople" request to the Peopleendpoint server.
     *
     * @return the {@link com.appspot.api.services.peopleendpoint.model.People} response
     * @throws IOException if the request fails
     */
    public com.appspot.api.services.peopleendpoint.model.People execute() throws IOException {
      HttpResponse response = executeUnparsed();
      com.appspot.api.services.peopleendpoint.model.People result = response.parseAs(
          com.appspot.api.services.peopleendpoint.model.People.class);
      result.setResponseHeaders(response.getHeaders());
      return result;
    }

    /**
     * Queues the "updatePeople" request to the Peopleendpoint server into the given batch request.
     *
     * <p>
     * Example usage:
     * </p>
     *
     * <pre>
       request.queue(batchRequest, new JsonBatchCallback&lt;People&gt;() {

         public void onSuccess(People content, GoogleHeaders responseHeaders) {
           log("Success");
         }

         public void onFailure(GoogleJsonError e, GoogleHeaders responseHeaders) {
           log(e.getMessage());
         }
       });
     * </pre>
     *
     * @param batch a single batch of requests
     * @param callback batch callback
     * @since 1.6
     */
    public void queue(com.google.api.client.googleapis.batch.BatchRequest batch,
        com.google.api.client.googleapis.batch.json.JsonBatchCallback<com.appspot.api.services.peopleendpoint.model.People> callback)
        throws IOException {
      batch.queue(buildHttpRequest(), com.appspot.api.services.peopleendpoint.model.People.class,
          com.google.api.client.googleapis.json.GoogleJsonErrorContainer.class, callback);
    }

    /**
     * @since 1.7
     */
    @Override
    public UpdatePeople setFields(String fields) {
      super.setFields(fields);
      return this;
    }



  }

  /**
   * Create a request for the method "listPeople".
   *
   * This request holds the parameters needed by the the peopleendpoint server.  After setting any
   * optional parameters, call the {@link ListPeople#execute()} method to invoke the remote operation.
   *
   * @return the request
   * @throws IOException if the initialization of the request fails
   */
  public ListPeople listPeople() throws IOException {
    ListPeople result = new ListPeople();
    initialize(result);
    return result;
  }


  public class ListPeople extends PeopleendpointRequest {

    private static final String REST_PATH = "people";

    /**
     * Internal constructor.  Use the convenience method instead.
     */
    ListPeople() {
      super(Peopleendpoint.this, HttpMethod.GET, REST_PATH, null);
    }



    /**
     * Sends the "listPeople" request to the Peopleendpoint server.
     *
     * @return the {@link com.appspot.api.services.peopleendpoint.model.Peoples} response
     * @throws IOException if the request fails
     */
    public com.appspot.api.services.peopleendpoint.model.Peoples execute() throws IOException {
      HttpResponse response = executeUnparsed();
      com.appspot.api.services.peopleendpoint.model.Peoples result = response.parseAs(
          com.appspot.api.services.peopleendpoint.model.Peoples.class);
      result.setResponseHeaders(response.getHeaders());
      return result;
    }

    /**
     * Queues the "listPeople" request to the Peopleendpoint server into the given batch request.
     *
     * <p>
     * Example usage:
     * </p>
     *
     * <pre>
       request.queue(batchRequest, new JsonBatchCallback&lt;Peoples&gt;() {

         public void onSuccess(Peoples content, GoogleHeaders responseHeaders) {
           log("Success");
         }

         public void onFailure(GoogleJsonError e, GoogleHeaders responseHeaders) {
           log(e.getMessage());
         }
       });
     * </pre>
     *
     * @param batch a single batch of requests
     * @param callback batch callback
     * @since 1.6
     */
    public void queue(com.google.api.client.googleapis.batch.BatchRequest batch,
        com.google.api.client.googleapis.batch.json.JsonBatchCallback<com.appspot.api.services.peopleendpoint.model.Peoples> callback)
        throws IOException {
      batch.queue(buildHttpRequest(), com.appspot.api.services.peopleendpoint.model.Peoples.class,
          com.google.api.client.googleapis.json.GoogleJsonErrorContainer.class, callback);
    }

    /**
     * @since 1.7
     */
    @Override
    public ListPeople setFields(String fields) {
      super.setFields(fields);
      return this;
    }



  }

  /**
   * Create a request for the method "getPeople".
   *
   * This request holds the parameters needed by the the peopleendpoint server.  After setting any
   * optional parameters, call the {@link GetPeople#execute()} method to invoke the remote operation.
   *
   * @param id
   * @return the request
   * @throws IOException if the initialization of the request fails
   */
  public GetPeople getPeople(String id) throws IOException {
    GetPeople result = new GetPeople(id);
    initialize(result);
    return result;
  }


  public class GetPeople extends PeopleendpointRequest {

    private static final String REST_PATH = "people/{id}";

    /**
     * Internal constructor.  Use the convenience method instead.
     */
    GetPeople(String id) {
      super(Peopleendpoint.this, HttpMethod.GET, REST_PATH, null);
      this.id = Preconditions.checkNotNull(id, "Required parameter id must be specified.");
    }



    /**
     * Sends the "getPeople" request to the Peopleendpoint server.
     *
     * @return the {@link com.appspot.api.services.peopleendpoint.model.People} response
     * @throws IOException if the request fails
     */
    public com.appspot.api.services.peopleendpoint.model.People execute() throws IOException {
      HttpResponse response = executeUnparsed();
      com.appspot.api.services.peopleendpoint.model.People result = response.parseAs(
          com.appspot.api.services.peopleendpoint.model.People.class);
      result.setResponseHeaders(response.getHeaders());
      return result;
    }

    /**
     * Queues the "getPeople" request to the Peopleendpoint server into the given batch request.
     *
     * <p>
     * Example usage:
     * </p>
     *
     * <pre>
       request.queue(batchRequest, new JsonBatchCallback&lt;People&gt;() {

         public void onSuccess(People content, GoogleHeaders responseHeaders) {
           log("Success");
         }

         public void onFailure(GoogleJsonError e, GoogleHeaders responseHeaders) {
           log(e.getMessage());
         }
       });
     * </pre>
     *
     * @param batch a single batch of requests
     * @param callback batch callback
     * @since 1.6
     */
    public void queue(com.google.api.client.googleapis.batch.BatchRequest batch,
        com.google.api.client.googleapis.batch.json.JsonBatchCallback<com.appspot.api.services.peopleendpoint.model.People> callback)
        throws IOException {
      batch.queue(buildHttpRequest(), com.appspot.api.services.peopleendpoint.model.People.class,
          com.google.api.client.googleapis.json.GoogleJsonErrorContainer.class, callback);
    }

    /**
     * @since 1.7
     */
    @Override
    public GetPeople setFields(String fields) {
      super.setFields(fields);
      return this;
    }


    @com.google.api.client.util.Key
    private String id;

    /**

     */
    public String getId() {
      return id;
    }


    public GetPeople setId(String id) {
      this.id = id;
      return this;
    }



  }

  /**
   * Create a request for the method "removePeople".
   *
   * This request holds the parameters needed by the the peopleendpoint server.  After setting any
   * optional parameters, call the {@link RemovePeople#execute()} method to invoke the remote
   * operation.
   *
   * @param id
   * @return the request
   * @throws IOException if the initialization of the request fails
   */
  public RemovePeople removePeople(String id) throws IOException {
    RemovePeople result = new RemovePeople(id);
    initialize(result);
    return result;
  }


  public class RemovePeople extends PeopleendpointRequest {

    private static final String REST_PATH = "people/{id}";

    /**
     * Internal constructor.  Use the convenience method instead.
     */
    RemovePeople(String id) {
      super(Peopleendpoint.this, HttpMethod.DELETE, REST_PATH, null);
      this.id = Preconditions.checkNotNull(id, "Required parameter id must be specified.");
    }



    /**
     * Sends the "removePeople" request to the Peopleendpoint server.
     *
     * @return the {@link com.appspot.api.services.peopleendpoint.model.People} response
     * @throws IOException if the request fails
     */
    public com.appspot.api.services.peopleendpoint.model.People execute() throws IOException {
      HttpResponse response = executeUnparsed();
      com.appspot.api.services.peopleendpoint.model.People result = response.parseAs(
          com.appspot.api.services.peopleendpoint.model.People.class);
      result.setResponseHeaders(response.getHeaders());
      return result;
    }

    /**
     * Queues the "removePeople" request to the Peopleendpoint server into the given batch request.
     *
     * <p>
     * Example usage:
     * </p>
     *
     * <pre>
       request.queue(batchRequest, new JsonBatchCallback&lt;People&gt;() {

         public void onSuccess(People content, GoogleHeaders responseHeaders) {
           log("Success");
         }

         public void onFailure(GoogleJsonError e, GoogleHeaders responseHeaders) {
           log(e.getMessage());
         }
       });
     * </pre>
     *
     * @param batch a single batch of requests
     * @param callback batch callback
     * @since 1.6
     */
    public void queue(com.google.api.client.googleapis.batch.BatchRequest batch,
        com.google.api.client.googleapis.batch.json.JsonBatchCallback<com.appspot.api.services.peopleendpoint.model.People> callback)
        throws IOException {
      batch.queue(buildHttpRequest(), com.appspot.api.services.peopleendpoint.model.People.class,
          com.google.api.client.googleapis.json.GoogleJsonErrorContainer.class, callback);
    }

    /**
     * @since 1.7
     */
    @Override
    public RemovePeople setFields(String fields) {
      super.setFields(fields);
      return this;
    }


    @com.google.api.client.util.Key
    private String id;

    /**

     */
    public String getId() {
      return id;
    }


    public RemovePeople setId(String id) {
      this.id = id;
      return this;
    }



  }

  /**
   * Create a request for the method "insertPeople".
   *
   * This request holds the parameters needed by the the peopleendpoint server.  After setting any
   * optional parameters, call the {@link InsertPeople#execute()} method to invoke the remote
   * operation.
   *
   * @param content the {@link com.appspot.api.services.peopleendpoint.model.People}
   * @return the request
   * @throws IOException if the initialization of the request fails
   */
  public InsertPeople insertPeople(com.appspot.api.services.peopleendpoint.model.People content) throws IOException {
    InsertPeople result = new InsertPeople(content);
    initialize(result);
    return result;
  }


  public class InsertPeople extends PeopleendpointRequest {

    private static final String REST_PATH = "people";

    /**
     * Internal constructor.  Use the convenience method instead.
     */
    InsertPeople(com.appspot.api.services.peopleendpoint.model.People content) {
      super(Peopleendpoint.this, HttpMethod.POST, REST_PATH, content);
      Preconditions.checkNotNull(content);
    }



    /**
     * Sends the "insertPeople" request to the Peopleendpoint server.
     *
     * @return the {@link com.appspot.api.services.peopleendpoint.model.People} response
     * @throws IOException if the request fails
     */
    public com.appspot.api.services.peopleendpoint.model.People execute() throws IOException {
      HttpResponse response = executeUnparsed();
      com.appspot.api.services.peopleendpoint.model.People result = response.parseAs(
          com.appspot.api.services.peopleendpoint.model.People.class);
      result.setResponseHeaders(response.getHeaders());
      return result;
    }

    /**
     * Queues the "insertPeople" request to the Peopleendpoint server into the given batch request.
     *
     * <p>
     * Example usage:
     * </p>
     *
     * <pre>
       request.queue(batchRequest, new JsonBatchCallback&lt;People&gt;() {

         public void onSuccess(People content, GoogleHeaders responseHeaders) {
           log("Success");
         }

         public void onFailure(GoogleJsonError e, GoogleHeaders responseHeaders) {
           log(e.getMessage());
         }
       });
     * </pre>
     *
     * @param batch a single batch of requests
     * @param callback batch callback
     * @since 1.6
     */
    public void queue(com.google.api.client.googleapis.batch.BatchRequest batch,
        com.google.api.client.googleapis.batch.json.JsonBatchCallback<com.appspot.api.services.peopleendpoint.model.People> callback)
        throws IOException {
      batch.queue(buildHttpRequest(), com.appspot.api.services.peopleendpoint.model.People.class,
          com.google.api.client.googleapis.json.GoogleJsonErrorContainer.class, callback);
    }

    /**
     * @since 1.7
     */
    @Override
    public InsertPeople setFields(String fields) {
      super.setFields(fields);
      return this;
    }



  }


  /**
   * Builder for {@link Peopleendpoint}.
   *
   * <p>
   * Implementation is not thread-safe.
   * </p>
   *
   * @since 1.3.0
   */
  public static final class Builder extends GoogleClient.Builder {

    /**
     * Returns an instance of a new builder.
     *
     * @param transport The transport to use for requests
     * @param jsonFactory A factory for creating JSON parsers and serializers
     * @param baseUrl The base URL of the service. Must end with a "/"
     */
    @Deprecated
    Builder(HttpTransport transport, JsonFactory jsonFactory, GenericUrl baseUrl) {
      super(transport, jsonFactory, baseUrl);
    }

    /**
     * Returns an instance of a new builder.
     *
     * @param transport The transport to use for requests
     * @param jsonFactory A factory for creating JSON parsers and serializers
     * @param httpRequestInitializer The HTTP request initializer or {@code null} for none
     * @since 1.7
     */
    public Builder(HttpTransport transport, JsonFactory jsonFactory,
        HttpRequestInitializer httpRequestInitializer) {
      super(transport, jsonFactory, DEFAULT_ROOT_URL, DEFAULT_SERVICE_PATH, httpRequestInitializer);
    }

    /** Builds a new instance of {@link Peopleendpoint}. */
    @SuppressWarnings("deprecation")
    @Override
    public Peopleendpoint build() {
      if (isBaseUrlUsed()) {
        return new Peopleendpoint(
            getTransport(),
            getJsonHttpRequestInitializer(),
            getHttpRequestInitializer(),
            getJsonFactory(),
            getObjectParser(),
            getBaseUrl().build(),
            getApplicationName());
      }
      return new Peopleendpoint(
          getTransport(),
          getJsonHttpRequestInitializer(),
          getHttpRequestInitializer(),
          getJsonFactory(),
          getObjectParser(),
          getRootUrl(),
          getServicePath(),
          getApplicationName());
    }

    @Override
    @Deprecated
    public Builder setBaseUrl(GenericUrl baseUrl) {
      super.setBaseUrl(baseUrl);
      return this;
    }

    @Override
    public Builder setRootUrl(String rootUrl) {
      super.setRootUrl(rootUrl);
      return this;
    }

    @Override
    public Builder setServicePath(String servicePath) {
      super.setServicePath(servicePath);
      return this;
    }

    @Override
    public Builder setJsonHttpRequestInitializer(
        JsonHttpRequestInitializer jsonHttpRequestInitializer) {
      super.setJsonHttpRequestInitializer(jsonHttpRequestInitializer);
      return this;
    }

    @Override
    public Builder setHttpRequestInitializer(HttpRequestInitializer httpRequestInitializer) {
      super.setHttpRequestInitializer(httpRequestInitializer);
      return this;
    }

    @Override
    public Builder setApplicationName(String applicationName) {
      super.setApplicationName(applicationName);
      return this;
    }

    @Override
    public Builder setObjectParser(JsonObjectParser parser) {
      super.setObjectParser(parser);
      return this;
    }
  }
}
