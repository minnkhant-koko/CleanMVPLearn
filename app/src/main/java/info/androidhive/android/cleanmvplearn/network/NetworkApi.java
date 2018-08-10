package info.androidhive.android.cleanmvplearn.network;

import info.androidhive.android.cleanmvplearn.data.vos.NetworkResponse;
import io.reactivex.Observable;
import retrofit2.http.GET;

public interface NetworkApi {

    @GET("bins/1bsqcn/")
    Observable<NetworkResponse> fetchDataFromNetwork();
}
