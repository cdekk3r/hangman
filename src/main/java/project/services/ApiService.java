package project.services;

// import java.net.http.HttpRequest;
// import java.net.http.HttpResponse;
// import java.net.http.HttpClient;
// import java.io.IOException;

public class ApiService {
    private final String API_BASE_URL = "https://random-word-api.herokuapp.com/word";

    // public static void main(String[] args) {
    //     HttpRequest request = HttpRequest.newBuilder()
    //         .uri(URI.create("https://random-word-api.herokuapp.com/word")
    //         .method("GET", HttpRequest.BodyPublishers.noBody())
    //         .build());

    //     HttpResponse<String> response = null;
    //     try {
    //         response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
    //     } catch(IOException e) {
    //         e.printStackTrace();
    //     } catch (InterruptedException e) {
    //         e.printStackTrace();
    //     }
    //     System.out.println(response.body());
    // }
}
