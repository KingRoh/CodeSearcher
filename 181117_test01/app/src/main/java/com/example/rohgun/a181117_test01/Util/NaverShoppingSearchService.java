package com.example.rohgun.a181117_test01.Util;

import io.reactivex.*;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

/**
 * Created by XPS on 2017-12-02.
 */

public interface NaverShoppingSearchService {

    /*@Headers({
            "X-Naver-Client-Id: OzYyCwp8a0JpBJiKXycC",
            "X-Naver-Client-Secret: SszZOHXjYS"
    })
    @GET("shop")
    Call<SearchDataList> getSearchList(@Query("query") String queryKey, @Query("display") int displayValue, @Query("start") int start, @Query("sort") String sortType);*/


    @Headers({
            "X-Naver-Client-Id: OzYyCwp8a0JpBJiKXycC",
            "X-Naver-Client-Secret: SszZOHXjYS"
    })
    @GET("shop")
    Observable<SearchDataList> getSearchDataList(@Query("query") String queryKey, @Query("display") int displayValue, @Query("start") int start, @Query("sort") String sortType);
}
