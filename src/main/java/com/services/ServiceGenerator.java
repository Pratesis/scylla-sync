/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.services;

import com.squareup.okhttp.OkHttpClient;
import retrofit.RestAdapter;
import retrofit.client.OkClient;

/**
 *
 * @author pratesis
 */
public class ServiceGenerator {
    
    // No need to instantiate this class.
    private ServiceGenerator() {
    }

    public static <S> S createService(Class<S> serviceClass, String baseUrl) {
        RestAdapter.Builder builder = new RestAdapter.Builder().setEndpoint(baseUrl)
                .setClient(new OkClient(new OkHttpClient()));
        RestAdapter adapter = builder.build();
        return adapter.create(serviceClass);
    }
}
