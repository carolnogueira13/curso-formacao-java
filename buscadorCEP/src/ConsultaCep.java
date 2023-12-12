import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaCep {

    public Endereco buscaEndereco(String cep) {
        HttpClient client = HttpClient.newHttpClient();

        String url = "https://viacep.com.br/ws/" +
                cep + "/json/";

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            String json = response.body();
            Gson gson = new Gson();
            Endereco endereco = gson.fromJson(json, Endereco.class);
            return endereco;
        } catch (Exception e) {
            throw new RuntimeException("Não consegui obter um endereco a partir desse CEP");
        }


    }
}
