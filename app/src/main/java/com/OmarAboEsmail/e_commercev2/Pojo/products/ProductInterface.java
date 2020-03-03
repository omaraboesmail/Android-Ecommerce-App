package com.OmarAboEsmail.e_commercev2.Pojo.products;

import androidx.annotation.MainThread;
import androidx.annotation.UiThread;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.Path;

public interface ProductInterface {

    @GET("product/api/")
    Call<List<Product>> getAllProduct();


    @GET("product/{id}/api/")
    Call<Product> getByID(@Path("id") String id);

    @PATCH("product/{id}/patch/api/")
    Call<Product> patchQuantity(@Path("id") String id, @Body Product product);


}
