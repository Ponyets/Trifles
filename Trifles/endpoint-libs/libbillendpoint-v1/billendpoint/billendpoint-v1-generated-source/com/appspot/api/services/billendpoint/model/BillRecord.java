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
 * Warning! This file is generated. Modify at your own risk.
 */

package com.appspot.api.services.billendpoint.model;


import com.appspot.api.services.peopleendpoint.model.People;
import com.google.api.client.http.HttpHeaders;
import com.google.api.client.json.GenericJson;


/**
 * Model definition for BillRecord.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the . For a detailed explanation see:
 * <a href="http://code.google.com/p/google-api-java-client/wiki/Json">http://code.google.com/p/google-api-java-client/wiki/Json</a>
 * </p>
 *
 * @author Google, Inc.
 */
public final class BillRecord extends GenericJson {


  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Double shouldPay;



  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Double pay;



  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private People people;




  /**

   * The value returned may be {@code null}.
   */
  public Double getShouldPay() {
    return shouldPay;
  }

  /**

   * The value set may be {@code null}.
   */
  public BillRecord setShouldPay(Double shouldPay) {
    this.shouldPay = shouldPay;
    return this;
  }

  /**

   * The value returned may be {@code null}.
   */
  public Double getPay() {
    return pay;
  }

  /**

   * The value set may be {@code null}.
   */
  public BillRecord setPay(Double pay) {
    this.pay = pay;
    return this;
  }

  /**

   * The value returned may be {@code null}.
   */
  public People getPeople() {
    return people;
  }

  /**

   * The value set may be {@code null}.
   */
  public BillRecord setPeople(People people) {
    this.people = people;
    return this;
  }


  private HttpHeaders responseHeaders;

  /**
   * Sets the HTTP headers returned with the server response, or <code>null</code>.
   *
   * This member should only be non-null if this object was the top level element of a response. For
   * example, a request that returns a single {@link BillRecord} would include the response headers,
   * while a request which returns an array of {@link BillRecord}, would have a non-null response
   * header in the enclosing object only.
   */
  public void setResponseHeaders(HttpHeaders responseHeaders) {
    this.responseHeaders = responseHeaders;
  }

  /**
   * Returns the HTTP headers that were returned with the server response, or
   * <code>null</code>.
   */
  public HttpHeaders getResponseHeaders() {
    return responseHeaders;
  }


}
