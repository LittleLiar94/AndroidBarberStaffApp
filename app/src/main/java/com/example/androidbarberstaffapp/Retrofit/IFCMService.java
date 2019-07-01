package com.example.androidbarberstaffapp.Retrofit;

import com.example.androidbarberstaffapp.Model.FCMResponse;
import com.example.androidbarberstaffapp.Model.FCMSendData;

import io.reactivex.Observable;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface IFCMService {

    @Headers({
            "Content-Type:application/json",
            "Authorization:key=AAAA-v5HTl4:APA91bHoyAK4Qwsjq3yo5uuYCScxw6dznwbFXry38Xd4eaXRNkewExYlM_wNlzScvOt3Vi9YNowuM-D2JYR-10qVyUE66jttMYpMyDYkKm7uGlbcqsUM1RXlXVLeiXScxgcg-p7CAiMi"
    })
    @POST("fcm/send")
    Observable<FCMResponse> sendNotification(@Body FCMSendData body);
}
