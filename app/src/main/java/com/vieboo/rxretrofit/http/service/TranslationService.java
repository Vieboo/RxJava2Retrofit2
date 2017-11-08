package com.vieboo.rxretrofit.http.service;

import com.vieboo.rxretrofit.model.BaseModel;
import com.vieboo.rxretrofit.model.Translation;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Administrator on 2017/11/8.
 */

public interface TranslationService {

    @GET("ajax.php")
    Observable<BaseModel<Translation>> getTranslation(@Query("a") String a, @Query("f") String from,
                                                      @Query("t") String to, @Query("w") String worlds);

}
