package com.example.jxxy.mobileshop_luwei.http.presenter;

import com.example.jxxy.mobileshop_luwei.http.HttpMethods;
import com.example.jxxy.mobileshop_luwei.http.entity.GoodsEntity;

import java.util.List;

import rx.Observable;
import rx.Subscriber;
public class GoodsPresenter extends HttpMethods {
    public static void listByKeywords(Subscriber<List<GoodsEntity>> subscriber,String keywords){
        Observable<List<GoodsEntity>> observable=goodsService.listByKeywords(keywords)
                .map(new HttpResultFunc<List<GoodsEntity>>());
        toSubscribe(observable,subscriber);

    }
    public static void list(Subscriber<List<GoodsEntity>> subscriber,int catId){
        Observable<List<GoodsEntity>>observable = goodsService.list(catId).map(new HttpResultFunc<List<GoodsEntity>>());
        toSubscribe(observable,subscriber);
    }
}