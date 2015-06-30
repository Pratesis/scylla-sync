/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.services;

import com.iface.Api;
import com.squareup.okhttp.OkHttpClient;
import retrofit.RestAdapter;
import retrofit.client.OkClient;

/**
 *
 * @author pratesis
 */
public class RestClient {
    
    private static Api REST_CLIENT;
	  //private static String ROOT = "http://10.0.2.2:8080/sfa-service-webapp/webapi/";
	  
	  private static String ROOT = "http://localhost:9000/";
	  
	  static {
	    setupRestClient();
	  }

	  private RestClient() {}

	  public static Api get() {
	    return REST_CLIENT;
	  }

	  private static void setupRestClient() {
		  RestAdapter.Builder builder = new RestAdapter.Builder()
		     .setEndpoint(ROOT)
		     .setClient(new OkClient(new OkHttpClient()));  
	    RestAdapter restAdapter = builder.build(); 
	    REST_CLIENT = restAdapter.create(Api.class);
	  }
}
