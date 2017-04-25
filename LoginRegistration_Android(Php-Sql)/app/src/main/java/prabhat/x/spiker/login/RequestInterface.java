package prabhat.x.spiker.login;

import prabhat.x.spiker.login.models.ServerRequest;
import prabhat.x.spiker.login.models.ServerResponse;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by Spiker_x on 27-Mar-17.
 */

public interface RequestInterface {
    @POST("pks/")
    Call<ServerResponse> operation(@Body ServerRequest request);


}
