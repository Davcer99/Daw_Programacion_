package SimulacroExamen;

import com.google.gson.*;

import java.io.IOException;

import java.io.InputStream;

import java.io.BufferedReader;

import java.io.FileInputStream;

import java.io.InputStreamReader;

public class LeerGMaps {

    public static void main (String[] args)  throws IOException{

        Gson gson = new Gson();

        InputStream f = new FileInputStream("./archivos/gmaps.json");

        final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(f));

        GeoResponse g = gson.fromJson(bufferedReader, GeoResponse.class);

        for (GeoResponse.Result r: g.results ) {

            System.out.println(r.formatted_address);

        }

        bufferedReader.close();

    }

}