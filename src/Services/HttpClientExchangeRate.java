package Services;

import Domain.Models.ExchangeRate;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.CompletableFuture;

public  abstract class HttpClientExchangeRate {
    private static String url = "https://v6.exchangerate-api.com/v6/f3d9932f68f46aa9b65503e7/latest/";
    private static final HttpClient client = HttpClient.newHttpClient();
    private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    private static ExchangeRate fromJson(String json){
        return gson.fromJson(json, ExchangeRate.class);
    }

    public static CompletableFuture<ExchangeRate> getAsync(String coin){
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url.concat(coin)))
                .build();

        return client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                .thenApply(HttpResponse::body)
                .thenApply(HttpClientExchangeRate::fromJson);
    }

}
