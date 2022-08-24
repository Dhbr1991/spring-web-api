package dio.web.api.controller;

import dio.web.api.model.Usuario;
import dio.web.api.repository.ConexaoTeste;
import dio.web.api.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.List;

import java.io.IOException;

import java.net.HttpURLConnection;

import java.net.URL;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioRepository repository;

    @GetMapping ("/users")
    public List<Usuario> getUsers() {
        return repository.findAll();
    }

    @GetMapping ("/api")
    public String getdadosApi() throws IOException {

        URL url = new URL("http://api.portaldatransparencia.gov.br/api-de-dados/orgaos-siafi?pagina=1");

        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        connection.setRequestMethod("GET");

        connection.setRequestProperty("Accept", "application/json");

        //connection.setRequestProperty("chave-api-dados", "1d5r8yt963h2v4g5h6j3k138sbfiec21");

        connection.setRequestProperty("chave-api-dados", "e87c65b7590a28a987705526d3812c4a");


        BufferedReader buffer = new BufferedReader(new InputStreamReader(connection.getInputStream()));

        String output;

        StringBuilder output_html = new StringBuilder("");

        while ((output = buffer.readLine()) != null) {

            output_html.append(output);

            System.out.println(output);
        }

        connection.disconnect();

        String html = "" +
                "<h1 style='color:red;'>Ola mundo 1</h1>" +
                "";


        return output_html.toString();
    }

    @GetMapping ("users/{username}")
    public Usuario getOne(@PathVariable ("username") String username) {
        return repository.findByUsername(username);
    }

    @DeleteMapping ("/users/{id}")
    public void delete(@PathVariable ("id") Integer id) {

        repository.deleteById(id);
    }

    @GetMapping ("/testBanco")
    public String testBancoPostgres() {

        String dados = ConexaoTeste.conectaBanco();

        List <Usuario> dadosRepositorio = repository.findAll();

        System.out.println(dadosRepositorio);

        // retorna os usuarios para nao retornar em branco...
        return "[" + dados + "]";
    }

    @GetMapping ("/ping")
    public String ping() {

        // Data em JAVA
        // https://www.alura.com.br/artigos/pegando-a-data-atual-em-java

        Calendar data1 = Calendar.getInstance();
        LocalDate data2 = LocalDate.now();

        return "{" +
                "\"data1\":\"" + data1.getTime().toString() + "\"," +
                "\"data-gleyson12\":\"" + data2.toString() + "\"" +
                "}";
    }



}
