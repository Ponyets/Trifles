package com.ponyets.trifles;

import com.appspot.api.services.billendpoint.Billendpoint;
import com.appspot.api.services.peopleendpoint.Peopleendpoint;
import com.google.api.client.extensions.android2.AndroidHttp;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.jackson.JacksonFactory;

public class Endpoints {
    private static final HttpTransport HTTP_TRANSPORT = AndroidHttp
            .newCompatibleTransport();
    private static final JsonFactory JSON_FACTORY = new JacksonFactory();

    public static final Peopleendpoint PEOPLE_ENDPOINT = CloudEndpointUtils
            .updateBuilder(
                    new Peopleendpoint.Builder(HTTP_TRANSPORT, JSON_FACTORY,
                            null)).build();
    public static final Billendpoint BILL_ENDPOINT = CloudEndpointUtils
            .updateBuilder(
                    new Billendpoint.Builder(HTTP_TRANSPORT, JSON_FACTORY, null))
            .build();

}
