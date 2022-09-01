package dio.web.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.Calendar;

@RestController
public class FolhaPagamentoController {

    @GetMapping ("/folha")
    public String folha() {

        // Data em JAVA
        // https://www.alura.com.br/artigos/pegando-a-data-atual-em-java

        Calendar data1 = Calendar.getInstance();
        LocalDate data2 = LocalDate.now();

//        return "{" +
//                "\"data1\":\"" + data1.getTime().toString() + "\"," +
//                "\"data-gleyson12\":\"" + data2.toString() + "\"" +
//                "}";

        return " [\n" +
                "            {\"data\":\"01/01/2021\",\"tipo\": \"Folha Mensal\", \"competencia\":\"01/02/2022\",\"provento\":\"1954,78\",\"desconto\":\"154,76\",\"liquido\":\"1654,78\"},\n" +
                "            {\"data\":\"01/02/2021\",\"tipo\": \"Folha Mensal\", \"competencia\":\"01/02/2022\",\"provento\":\"1954,78\",\"desconto\":\"154,76\",\"liquido\":\"1654,78\"},\n" +
                "            {\"data\":\"01/03/2021\",\"tipo\": \"Folha Mensal\", \"competencia\":\"01/02/2022\",\"provento\":\"1954,78\",\"desconto\":\"154,76\",\"liquido\":\"1654,78\"},\n" +
                "            {\"data\":\"01/04/2021\",\"tipo\": \"Folha Mensal\", \"competencia\":\"01/02/2022\",\"provento\":\"1954,78\",\"desconto\":\"154,76\",\"liquido\":\"1654,78\"},\n" +
                "            {\"data\":\"01/05/2021\",\"tipo\": \"Folha Mensal\", \"competencia\":\"01/02/2022\",\"provento\":\"1954,78\",\"desconto\":\"154,76\",\"liquido\":\"1654,78\"},\n" +
                "            {\"data\":\"01/06/2021\",\"tipo\": \"Folha Mensal\", \"competencia\":\"01/02/2022\",\"provento\":\"1954,78\",\"desconto\":\"154,76\",\"liquido\":\"1654,78\"},\n" +
                "            {\"data\":\"01/07/2021\",\"tipo\": \"Folha Mensal\", \"competencia\":\"01/02/2022\",\"provento\":\"1954,78\",\"desconto\":\"154,76\",\"liquido\":\"1654,78\"},\n" +
                "            {\"data\":\"01/08/2021\",\"tipo\": \"Folha Mensal\", \"competencia\":\"01/02/2022\",\"provento\":\"1954,78\",\"desconto\":\"154,76\",\"liquido\":\"1654,78\"},\n" +
                "            {\"data\":\"01/09/2021\",\"tipo\": \"Folha Mensal\", \"competencia\":\"01/02/2022\",\"provento\":\"1954,78\",\"desconto\":\"154,76\",\"liquido\":\"1654,78\"},\n" +
                "            {\"data\":\"01/10/2021\",\"tipo\": \"Folha Mensal\", \"competencia\":\"01/02/2022\",\"provento\":\"1954,78\",\"desconto\":\"154,76\",\"liquido\":\"1654,78\"},\n" +
                "            {\"data\":\"01/11/2021\",\"tipo\": \"Folha Mensal\", \"competencia\":\"01/02/2022\",\"provento\":\"1954,78\",\"desconto\":\"154,76\",\"liquido\":\"1654,78\"},\n" +
                "            {\"data\":\"01/12/2021\",\"tipo\": \"Folha Mensal\", \"competencia\":\"01/02/2022\",\"provento\":\"1954,78\",\"desconto\":\"154,76\",\"liquido\":\"1654,78\"},\n" +
                "            {\"data\":\"01/01/2022\",\"tipo\": \"Folha Mensal\", \"competencia\":\"01/02/2022\",\"provento\":\"1954,78\",\"desconto\":\"154,76\",\"liquido\":\"1654,78\"},\n" +
                "            {\"data\":\"01/02/2022\",\"tipo\": \"Folha Mensal\", \"competencia\":\"01/02/2022\",\"provento\":\"1954,78\",\"desconto\":\"154,76\",\"liquido\":\"1654,78\"},\n" +
                "            {\"data\":\"01/03/2022\",\"tipo\": \"Folha Mensal\", \"competencia\":\"01/02/2022\",\"provento\":\"1954,78\",\"desconto\":\"154,76\",\"liquido\":\"1654,78\"},\n" +
                "            {\"data\":\"01/04/2022\",\"tipo\": \"Folha Mensal\", \"competencia\":\"01/02/2022\",\"provento\":\"1954,78\",\"desconto\":\"154,76\",\"liquido\":\"1654,78\"},\n" +
                "            {\"data\":\"01/05/2022\",\"tipo\": \"Folha Mensal\", \"competencia\":\"01/02/2022\",\"provento\":\"1954,78\",\"desconto\":\"154,76\",\"liquido\":\"1654,78\"},\n" +
                "            {\"data\":\"01/06/2022\",\"tipo\": \"Folha Mensal\", \"competencia\":\"01/02/2022\",\"provento\":\"1954,78\",\"desconto\":\"154,76\",\"liquido\":\"1654,78\"},\n" +
                "            {\"data\":\"01/07/2022\",\"tipo\": \"Folha Mensal\", \"competencia\":\"01/02/2022\",\"provento\":\"1954,78\",\"desconto\":\"154,76\",\"liquido\":\"1654,78\"},\n" +
                "            {\"data\":\"01/08/2022\",\"tipo\": \"Folha Mensal\", \"competencia\":\"01/02/2022\",\"provento\":\"1954,78\",\"desconto\":\"154,76\",\"liquido\":\"1654,78\"}\n" +
                "        ]";
    }
}
