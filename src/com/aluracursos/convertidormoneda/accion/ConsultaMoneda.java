package com.aluracursos.convertidormoneda.accion;

import com.aluracursos.convertidormoneda.modelo.Moneda;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;

public class ConsultaMoneda {
    public ArrayList<Double> consulta(){
        URI direccion =
                URI.create("https://v6.exchangerate-api.com/v6/" +
                        "bf6bcb0ecb6c1baa01581b8d/latest/USD");

        HttpClient cliente = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(direccion).build();

        try{
            HttpResponse<String> response = cliente.
                    send(request, HttpResponse.BodyHandlers.ofString());
            //return new Gson().fromJson(response.body(), Moneda.class);

            String json = response.body();

            Gson gson = new Gson();
            Moneda moneda = gson.fromJson(json, Moneda.class);

            return moneda.getValores();


        }catch (IOException | InterruptedException e){
            throw new RuntimeException("No se encontró la denominación");
        }
    }
}
