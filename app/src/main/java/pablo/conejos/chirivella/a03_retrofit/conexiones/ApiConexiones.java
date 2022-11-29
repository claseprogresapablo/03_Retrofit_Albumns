package pablo.conejos.chirivella.a03_retrofit.conexiones;

import java.util.ArrayList;

import pablo.conejos.chirivella.a03_retrofit.modelos.Album;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiConexiones {

    //Todos los endPoint y retornos de la API

    @GET("/albums") //para que vaya al endPiont de albumns
    Call<ArrayList<Album>> getAlbums(); //el Call es lo que devuelve retrofit y le pedimos que sea un ArrayList de album

    @GET("/albums/{idAlbum}") //endpint para llegar al solo un album que devuelve un objrto
    Call<Album> getAlbum(@Path("idAlbum")int Album); //traer solo un album //el int que recibe esta funcion lo pone en el path
}
