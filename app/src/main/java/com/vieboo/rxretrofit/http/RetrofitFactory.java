package com.vieboo.rxretrofit.http;


import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by Administrator on 2017/10/27.
 */

public class RetrofitFactory implements HttpConfigs {

    private RetrofitFactory() {

    }


    /**
     * 构建OkHttpClient
     */
    private static OkHttpClient okHttpClient = new OkHttpClient.Builder()
            .addInterceptor(new Interceptor() {
                @Override
                public Response intercept(Chain chain) throws IOException {
                    Request.Builder builder = chain.request().newBuilder();
                    //添加Request Header
                    builder.addHeader("client_type", "android");
                    return chain.proceed(builder.build());
                }
            })
            .connectTimeout(TIME_OUT, TimeUnit.SECONDS)
            .readTimeout(TIME_OUT, TimeUnit.SECONDS)
            .build();

//    private static

}