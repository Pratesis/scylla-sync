/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iface;

import com.models.MblUpload;
import com.models.Mblfaktivitas;
import com.models.Person;
import retrofit.Callback;
import retrofit.http.POST;
import retrofit.http.Body;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.GET;
import retrofit.http.Headers;
import retrofit.http.Query;
/**
 *
 * @author pratesis
 */
public interface Api {
    
    @Headers( "Content-Type: application/json" )
    @POST("/apiv1/hallo")
    void uploadData(@Body MblUpload value, Callback<String> cb);
    
    @Headers( "Content-Type: application/json" )
    @POST("/apiv1/download")
    void downloadData(@Body String value, Callback<String> cb);

}
