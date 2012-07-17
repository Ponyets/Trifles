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
 *  on 2012-07-17 at 12:41:55 UTC 
 */

package com.appspot.api.services.peopleendpoint;

import com.google.api.client.http.HttpMethod;
import com.google.api.client.http.json.JsonHttpClient;
import com.google.api.client.http.json.JsonHttpRequest;


/**
 * Generated Peopleendpoint request.
 *
 * @since 1.3.0
 */
public class PeopleendpointRequest extends JsonHttpRequest {

  /**
   * Builds an instance of PeopleendpointRequest.
   *
   * @param client The JSON HTTP client which handles this request
   * @param method HTTP Method type
   * @param uriTemplate URI template
   * @param content A POJO that can be serialized into JSON or {@code null} for none
   */
  public PeopleendpointRequest(
      JsonHttpClient client, HttpMethod method, String uriTemplate, Object content) {
    super(client, method, uriTemplate, content);
  }


  /** Returns response with indentations and line breaks. */
  @com.google.api.client.util.Key
  private Boolean prettyPrint;

  /**
   * Returns response with indentations and line breaks.    [default: true]
   */
  public Boolean getPrettyPrint() {
    return prettyPrint;
  }

  /** Returns response with indentations and line breaks. */
  public PeopleendpointRequest setPrettyPrint(Boolean prettyPrint) {
    this.prettyPrint = prettyPrint;
    return this;
  }

  /** Selector specifying which fields to include in a partial response. */
  @com.google.api.client.util.Key
  private String fields;

  /**
   * Selector specifying which fields to include in a partial response.
   */
  public String getFields() {
    return fields;
  }

  /** Selector specifying which fields to include in a partial response. */
  public PeopleendpointRequest setFields(String fields) {
    this.fields = fields;
    return this;
  }

  /**
 * Available to use for quota purposes for server-side applications. Can be any arbitrary string
 * assigned to a user, but should not exceed 40 characters. Overrides userIp if both are provided.
 */
  @com.google.api.client.util.Key
  private String quotaUser;

  /**
   * Available to use for quota purposes for server-side applications. Can be any arbitrary string
   * assigned to a user, but should not exceed 40 characters. Overrides userIp if both are provided.
   */
  public String getQuotaUser() {
    return quotaUser;
  }

  /**
 * Available to use for quota purposes for server-side applications. Can be any arbitrary string
 * assigned to a user, but should not exceed 40 characters. Overrides userIp if both are provided.
 */
  public PeopleendpointRequest setQuotaUser(String quotaUser) {
    this.quotaUser = quotaUser;
    return this;
  }

  /** OAuth 2.0 token for the current user. */
  @com.google.api.client.util.Key("oauth_token")
  private String oauthToken;

  /**
   * OAuth 2.0 token for the current user.
   */
  public String getOauthToken() {
    return oauthToken;
  }

  /** OAuth 2.0 token for the current user. */
  public PeopleendpointRequest setOauthToken(String oauthToken) {
    this.oauthToken = oauthToken;
    return this;
  }

  /**
 * API key. Your API key identifies your project and provides you with API access, quota, and
 * reports. Required unless you provide an OAuth 2.0 token.
 */
  @com.google.api.client.util.Key
  private String key;

  /**
   * API key. Your API key identifies your project and provides you with API access, quota, and
   * reports. Required unless you provide an OAuth 2.0 token.
   */
  public String getKey() {
    return key;
  }

  /**
 * API key. Your API key identifies your project and provides you with API access, quota, and
 * reports. Required unless you provide an OAuth 2.0 token.
 */
  public PeopleendpointRequest setKey(String key) {
    this.key = key;
    return this;
  }

  /**
 * IP address of the site where the request originates. Use this if you want to enforce per-user
 * limits.
 */
  @com.google.api.client.util.Key
  private String userIp;

  /**
   * IP address of the site where the request originates. Use this if you want to enforce per-user
   * limits.
   */
  public String getUserIp() {
    return userIp;
  }

  /**
 * IP address of the site where the request originates. Use this if you want to enforce per-user
 * limits.
 */
  public PeopleendpointRequest setUserIp(String userIp) {
    this.userIp = userIp;
    return this;
  }

  /** Data format for the response. */
  @com.google.api.client.util.Key
  private String alt;

  /**
   * Data format for the response.    [default: json]
   */
  public String getAlt() {
    return alt;
  }

  /** Data format for the response. */
  public PeopleendpointRequest setAlt(String alt) {
    this.alt = alt;
    return this;
  }
}

