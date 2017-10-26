package com.vieboo.rxretrofit.net;

import com.vieboo.rxretrofit.model.Upload2;
import com.vieboo.rxretrofit.model.Zhuangbi;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Administrator on 2017/10/26.
 */

public interface Api {

//    @GET("search")
//    Call<ResponseBody> search(@Query("q") String query);

    @GET("search")
    Observable<List<Zhuangbi<Upload2>>> search(@Query("q") String query);

}
