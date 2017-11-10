package com.vieboo.rxretrofit.http;


import com.vieboo.rxretrofit.http.service.TranslationService;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.jackson.JacksonConverterFactory;

/**
 * Created by Administrator on 2017/10/27.
 */

public class RetrofitFactory implements HttpConfigs {

    private RetrofitFactory() {

    }


    /**
     * 声明日志类， 设定日志级别
     */
    private static HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor()
            .setLevel(HttpLoggingInterceptor.Level.BODY);

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
            .addInterceptor(loggingInterceptor)
            .connectTimeout(TIME_OUT, TimeUnit.SECONDS)
            .readTimeout(TIME_OUT, TimeUnit.SECONDS)
            .build();

    private static TranslationService translationService = new Retrofit.Builder()
            .baseUrl(BASE_TRANSLATION_URL)
            .addConverterFactory(JacksonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .client(okHttpClient)
            .build()
            .create(TranslationService.class);

    public static TranslationService getTSInstance() {
        return translationService;
    }

}
