package com.OmarAboEsmail.e_commercev2.Pojo.category;



import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface CategoryInterface {
    @GET("category/api/")
    Call<List<Category>> getAllCategory();


}
