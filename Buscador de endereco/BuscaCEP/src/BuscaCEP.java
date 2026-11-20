import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class BuscaCEP {
    public Endereco consultarEndereco(String cep){
        cep = cep.replaceAll("\\D", "");
        if (cep.length() != 8) {
            throw new IllegalArgumentException("O CEP deve conter 8 digitos!");
        }
        String url = "https://viacep.com.br/ws/" + cep + "/json/";
        HttpClient cliente = HttpClient.newHttpClient();
        HttpRequest requisicao = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .GET()
                .build();
        try {
            HttpResponse<String> resposta = cliente.send(requisicao, HttpResponse.BodyHandlers.ofString());

            if (resposta.statusCode() != 200) {
                throw new RuntimeException("Erro ao buscar este CEP, " + resposta.statusCode());
            }
            String json = resposta.body();
            JsonObject jsonObeject = JsonParser.parseString(json).getAsJsonObject();
            if (jsonObeject.has("erro") && jsonObeject.get("erro").getAsBoolean()) {
                throw new RuntimeException("CEP não encontrado");
            }
            return new Gson().fromJson(json, Endereco.class);
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException("Erro na conexão!");
        }
    }
}
