package com.example.jxxy.mobileshop_luwei.http.service;

import com.example.jxxy.mobileshop_luwei.http.entity.GoodsEntity;
import com.example.jxxy.mobileshop_luwei.http.entity.HttpResult;

import java.util.List;

import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import rx.Observable;

public interface GoodsService {
    @FormUrlEncoded
    @POST("goods/find")
    Observable<HttpResult<List<GoodsEntity>>> listByKeywords(
            @Field("input") String keywords
    );

    @GET("goods/cat/{catId}")
    Observable<HttpResult<List<GoodsEntity>>>list(@Path("catId")int catId);
}
