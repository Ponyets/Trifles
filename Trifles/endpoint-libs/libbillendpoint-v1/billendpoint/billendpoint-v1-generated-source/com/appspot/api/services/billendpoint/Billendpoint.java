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
 *  with google-apis-code-generator 1.1.1 (build: 2012-06-25 20:14:04 UTC)
 *  on 2012-07-17 at 12:40:03 UTC 
 */

package com.appspot.api.services.billendpoint;


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
 * Service definition for Billendpoint (v1).
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
  public class BillendpointRequestInitializer implements JsonHttpRequestInitializer {
      public void initialize(JsonHttpRequest request) {
        BillendpointRequest billendpointRequest = (BillendpointRequest)request;
        billendpointRequest.setPrettyPrint(true);
        billendpointRequest.setKey(ClientCredentials.KEY);
    }
  }
 * </pre>
 *
 * @since 1.3.0
 * @author Google, Inc.
 */
public class Billendpoint extends GoogleClient {

  /**
   * The default encoded base path of the service. This is determined when the library is generated
   * and normally should not be changed.
   * @deprecated (scheduled to be removed in 1.8) Use "/" + {@link #DEFAULT_SERVICE_PATH}.
   */
  @Deprecated
  public static final String DEFAULT_BASE_PATH = "/_ah/api/billendpoint/v1/";

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
  public static final String DEFAULT_SERVICE_PATH = "billendpoint/v1/";

  /**
   * The default encoded base URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   */
  public static final String DEFAULT_BASE_URL = DEFAULT_ROOT_URL + DEFAULT_SERVICE_PATH;

  /**
   * Construct a Billendpoint instance to connect to the Billendpoint service.
   *
   * <p>
   * Use {@link Builder} if you need to specify any of the optional parameters.
   * </p>
   *
   * @param transport The transport to use for requests
   * @param jsonFactory A factory for creating JSON parsers and serializers
   * @deprecated (scheduled to be removed in 1.8) Use
   *             {@link #Billendpoint(HttpTransport, JsonFactory, HttpRequestInitializer)}.
   */
  @Deprecated
  public Billendpoint(HttpTransport transport, JsonFactory jsonFactory) {
    super(transport, jsonFactory, DEFAULT_BASE_URL);
  }

  /**
   * Construct a Billendpoint instance to connect to the Billendpoint service.
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
  public Billendpoint(HttpTransport transport, JsonFactory jsonFactory,
      HttpRequestInitializer httpRequestInitializer) {
    super(transport, jsonFactory, DEFAULT_ROOT_URL, DEFAULT_SERVICE_PATH, httpRequestInitializer);
  }

  /**
   * Construct a Billendpoint instance to connect to the Billendpoint service.
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
  Billendpoint(
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
   * Construct a Billendpoint instance to connect to the Billendpoint service.
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
  Billendpoint(
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
   * Create a request for the method "updateBill".
   *
   * This request holds the parameters needed by the the billendpoint server.  After setting any
   * optional parameters, call the {@link UpdateBill#execute()} method to invoke the remote operation.
   *
   * @param content the {@link com.appspot.api.services.billendpoint.model.Bill}
   * @return the request
   * @throws IOException if the initialization of the request fails
   */
  public UpdateBill updateBill(com.appspot.api.services.billendpoint.model.Bill content) throws IOException {
    UpdateBill result = new UpdateBill(content);
    initialize(result);
    return result;
  }


  public class UpdateBill extends BillendpointRequest {

    private static final String REST_PATH = "bill";

    /**
     * Internal constructor.  Use the convenience method instead.
     */
    UpdateBill(com.appspot.api.services.billendpoint.model.Bill content) {
      super(Billendpoint.this, HttpMethod.PUT, REST_PATH, content);
      Preconditions.checkNotNull(content);
    }



    /**
     * Sends the "updateBill" request to the Billendpoint server.
     *
     * @return the {@link com.appspot.api.services.billendpoint.model.Bill} response
     * @throws IOException if the request fails
     */
    public com.appspot.api.services.billendpoint.model.Bill execute() throws IOException {
      HttpResponse response = executeUnparsed();
      com.appspot.api.services.billendpoint.model.Bill result = response.parseAs(
          com.appspot.api.services.billendpoint.model.Bill.class);
      result.setResponseHeaders(response.getHeaders());
      return result;
    }

    /**
     * Queues the "updateBill" request to the Billendpoint server into the given batch request.
     *
     * <p>
     * Example usage:
     * </p>
     *
     * <pre>
       request.queue(batchRequest, new JsonBatchCallback&lt;Bill&gt;() {

         public void onSuccess(Bill content, GoogleHeaders responseHeaders) {
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
        com.google.api.client.googleapis.batch.json.JsonBatchCallback<com.appspot.api.services.billendpoint.model.Bill> callback)
        throws IOException {
      batch.queue(buildHttpRequest(), com.appspot.api.services.billendpoint.model.Bill.class,
          com.google.api.client.googleapis.json.GoogleJsonErrorContainer.class, callback);
    }

    /**
     * @since 1.7
     */
    @Override
    public UpdateBill setFields(String fields) {
      super.setFields(fields);
      return this;
    }



  }

  /**
   * Create a request for the method "getBill".
   *
   * This request holds the parameters needed by the the billendpoint server.  After setting any
   * optional parameters, call the {@link GetBill#execute()} method to invoke the remote operation.
   *
   * @param id
   * @return the request
   * @throws IOException if the initialization of the request fails
   */
  public GetBill getBill(String id) throws IOException {
    GetBill result = new GetBill(id);
    initialize(result);
    return result;
  }


  public class GetBill extends BillendpointRequest {

    private static final String REST_PATH = "bill/{id}";

    /**
     * Internal constructor.  Use the convenience method instead.
     */
    GetBill(String id) {
      super(Billendpoint.this, HttpMethod.GET, REST_PATH, null);
      this.id = Preconditions.checkNotNull(id, "Required parameter id must be specified.");
    }



    /**
     * Sends the "getBill" request to the Billendpoint server.
     *
     * @return the {@link com.appspot.api.services.billendpoint.model.Bill} response
     * @throws IOException if the request fails
     */
    public com.appspot.api.services.billendpoint.model.Bill execute() throws IOException {
      HttpResponse response = executeUnparsed();
      com.appspot.api.services.billendpoint.model.Bill result = response.parseAs(
          com.appspot.api.services.billendpoint.model.Bill.class);
      result.setResponseHeaders(response.getHeaders());
      return result;
    }

    /**
     * Queues the "getBill" request to the Billendpoint server into the given batch request.
     *
     * <p>
     * Example usage:
     * </p>
     *
     * <pre>
       request.queue(batchRequest, new JsonBatchCallback&lt;Bill&gt;() {

         public void onSuccess(Bill content, GoogleHeaders responseHeaders) {
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
        com.google.api.client.googleapis.batch.json.JsonBatchCallback<com.appspot.api.services.billendpoint.model.Bill> callback)
        throws IOException {
      batch.queue(buildHttpRequest(), com.appspot.api.services.billendpoint.model.Bill.class,
          com.google.api.client.googleapis.json.GoogleJsonErrorContainer.class, callback);
    }

    /**
     * @since 1.7
     */
    @Override
    public GetBill setFields(String fields) {
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


    public GetBill setId(String id) {
      this.id = id;
      return this;
    }



  }

  /**
   * Create a request for the method "removeBill".
   *
   * This request holds the parameters needed by the the billendpoint server.  After setting any
   * optional parameters, call the {@link RemoveBill#execute()} method to invoke the remote operation.
   *
   * @param id
   * @return the request
   * @throws IOException if the initialization of the request fails
   */
  public RemoveBill removeBill(String id) throws IOException {
    RemoveBill result = new RemoveBill(id);
    initialize(result);
    return result;
  }


  public class RemoveBill extends BillendpointRequest {

    private static final String REST_PATH = "bill/{id}";

    /**
     * Internal constructor.  Use the convenience method instead.
     */
    RemoveBill(String id) {
      super(Billendpoint.this, HttpMethod.DELETE, REST_PATH, null);
      this.id = Preconditions.checkNotNull(id, "Required parameter id must be specified.");
    }



    /**
     * Sends the "removeBill" request to the Billendpoint server.
     *
     * @return the {@link com.appspot.api.services.billendpoint.model.Bill} response
     * @throws IOException if the request fails
     */
    public com.appspot.api.services.billendpoint.model.Bill execute() throws IOException {
      HttpResponse response = executeUnparsed();
      com.appspot.api.services.billendpoint.model.Bill result = response.parseAs(
          com.appspot.api.services.billendpoint.model.Bill.class);
      result.setResponseHeaders(response.getHeaders());
      return result;
    }

    /**
     * Queues the "removeBill" request to the Billendpoint server into the given batch request.
     *
     * <p>
     * Example usage:
     * </p>
     *
     * <pre>
       request.queue(batchRequest, new JsonBatchCallback&lt;Bill&gt;() {

         public void onSuccess(Bill content, GoogleHeaders responseHeaders) {
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
        com.google.api.client.googleapis.batch.json.JsonBatchCallback<com.appspot.api.services.billendpoint.model.Bill> callback)
        throws IOException {
      batch.queue(buildHttpRequest(), com.appspot.api.services.billendpoint.model.Bill.class,
          com.google.api.client.googleapis.json.GoogleJsonErrorContainer.class, callback);
    }

    /**
     * @since 1.7
     */
    @Override
    public RemoveBill setFields(String fields) {
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


    public RemoveBill setId(String id) {
      this.id = id;
      return this;
    }



  }

  /**
   * Create a request for the method "insertBill".
   *
   * This request holds the parameters needed by the the billendpoint server.  After setting any
   * optional parameters, call the {@link InsertBill#execute()} method to invoke the remote operation.
   *
   * @param content the {@link com.appspot.api.services.billendpoint.model.Bill}
   * @return the request
   * @throws IOException if the initialization of the request fails
   */
  public InsertBill insertBill(com.appspot.api.services.billendpoint.model.Bill content) throws IOException {
    InsertBill result = new InsertBill(content);
    initialize(result);
    return result;
  }


  public class InsertBill extends BillendpointRequest {

    private static final String REST_PATH = "bill";

    /**
     * Internal constructor.  Use the convenience method instead.
     */
    InsertBill(com.appspot.api.services.billendpoint.model.Bill content) {
      super(Billendpoint.this, HttpMethod.POST, REST_PATH, content);
      Preconditions.checkNotNull(content);
    }



    /**
     * Sends the "insertBill" request to the Billendpoint server.
     *
     * @return the {@link com.appspot.api.services.billendpoint.model.Bill} response
     * @throws IOException if the request fails
     */
    public com.appspot.api.services.billendpoint.model.Bill execute() throws IOException {
      HttpResponse response = executeUnparsed();
      com.appspot.api.services.billendpoint.model.Bill result = response.parseAs(
          com.appspot.api.services.billendpoint.model.Bill.class);
      result.setResponseHeaders(response.getHeaders());
      return result;
    }

    /**
     * Queues the "insertBill" request to the Billendpoint server into the given batch request.
     *
     * <p>
     * Example usage:
     * </p>
     *
     * <pre>
       request.queue(batchRequest, new JsonBatchCallback&lt;Bill&gt;() {

         public void onSuccess(Bill content, GoogleHeaders responseHeaders) {
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
        com.google.api.client.googleapis.batch.json.JsonBatchCallback<com.appspot.api.services.billendpoint.model.Bill> callback)
        throws IOException {
      batch.queue(buildHttpRequest(), com.appspot.api.services.billendpoint.model.Bill.class,
          com.google.api.client.googleapis.json.GoogleJsonErrorContainer.class, callback);
    }

    /**
     * @since 1.7
     */
    @Override
    public InsertBill setFields(String fields) {
      super.setFields(fields);
      return this;
    }



  }

  /**
   * Create a request for the method "listBill".
   *
   * This request holds the parameters needed by the the billendpoint server.  After setting any
   * optional parameters, call the {@link ListBill#execute()} method to invoke the remote operation.
   *
   * @return the request
   * @throws IOException if the initialization of the request fails
   */
  public ListBill listBill() throws IOException {
    ListBill result = new ListBill();
    initialize(result);
    return result;
  }


  public class ListBill extends BillendpointRequest {

    private static final String REST_PATH = "bill";

    /**
     * Internal constructor.  Use the convenience method instead.
     */
    ListBill() {
      super(Billendpoint.this, HttpMethod.GET, REST_PATH, null);
    }



    /**
     * Sends the "listBill" request to the Billendpoint server.
     *
     * @return the {@link com.appspot.api.services.billendpoint.model.Bills} response
     * @throws IOException if the request fails
     */
    public com.appspot.api.services.billendpoint.model.Bills execute() throws IOException {
      HttpResponse response = executeUnparsed();
      com.appspot.api.services.billendpoint.model.Bills result = response.parseAs(
          com.appspot.api.services.billendpoint.model.Bills.class);
      result.setResponseHeaders(response.getHeaders());
      return result;
    }

    /**
     * Queues the "listBill" request to the Billendpoint server into the given batch request.
     *
     * <p>
     * Example usage:
     * </p>
     *
     * <pre>
       request.queue(batchRequest, new JsonBatchCallback&lt;Bills&gt;() {

         public void onSuccess(Bills content, GoogleHeaders responseHeaders) {
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
        com.google.api.client.googleapis.batch.json.JsonBatchCallback<com.appspot.api.services.billendpoint.model.Bills> callback)
        throws IOException {
      batch.queue(buildHttpRequest(), com.appspot.api.services.billendpoint.model.Bills.class,
          com.google.api.client.googleapis.json.GoogleJsonErrorContainer.class, callback);
    }

    /**
     * @since 1.7
     */
    @Override
    public ListBill setFields(String fields) {
      super.setFields(fields);
      return this;
    }



  }


  /**
   * Builder for {@link Billendpoint}.
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

    /** Builds a new instance of {@link Billendpoint}. */
    @SuppressWarnings("deprecation")
    @Override
    public Billendpoint build() {
      if (isBaseUrlUsed()) {
        return new Billendpoint(
            getTransport(),
            getJsonHttpRequestInitializer(),
            getHttpRequestInitializer(),
            getJsonFactory(),
            getObjectParser(),
            getBaseUrl().build(),
            getApplicationName());
      }
      return new Billendpoint(
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
