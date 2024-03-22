package builder;

public class Test {
    public static void main(String[] args) {
        HttpClient client = new HttpClient.HttpClientBuilder().method("Get").url("http://test.com").secure(null, null).headers("headers").body("body").build();
        System.out.println(client);
    }
}
