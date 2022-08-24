package dio.web.api.controller;

import org.springframework.web.bind.annotation.GetMapping;

import java.io.BufferedReader;

import java.io.IOException;

import java.io.InputStreamReader;

import java.net.HttpURLConnection;

import java.net.URL;

public class testApiGov {

    @GetMapping ("/api")
    public void testApi(String[] args) throws IOException {

        // URL url = new URL("http://api.portaldatransparencia.gov.br/api-de-dados/orgaos-siafi?pagina=1");
        URL url = new URL("https://api.portaldatransparencia.gov.br/api-de-dados/auxilio-emergencial-beneficiario-por-municipio?codigoIbge=4214805&mesAno=202101&pagina=10");

//        URL url = new URL("https://api.portaldatransparencia.gov.br/api-de-dados/auxilio-emergencial-beneficiario-por-municipio?codigoIbge=4214805&mesAno=202101&pagina=10");
//

        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        connection.setRequestMethod("GET");

        connection.setRequestProperty("Accept", "application/json");

        String chave_api = "e87c65b7590a28a987705526d3812c4a";

//        connection.setRequestProperty("chave-api-dados", "1d5r8yt963h2v4g5h6j3k138sbfiec21");

        connection.setRequestProperty("chave-api-dados", chave_api);

        BufferedReader buffer = new BufferedReader(new InputStreamReader(connection.getInputStream()));

        String output;

        while ((output = buffer.readLine()) != null) {

            System.out.println(output);

        }

        connection.disconnect();

    }


}
