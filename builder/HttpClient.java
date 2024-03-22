package builder;

public class HttpClient {
    private String method;
    private String url;
    private String username;
    private String password;
    private String headers;
    private String body;

    private HttpClient(HttpClientBuilder httpClientBuilder){
        this.method = httpClientBuilder.method;
        this.url = httpClientBuilder.url;
        this.username = httpClientBuilder.password;
        this.password = httpClientBuilder.password;
        this.headers = httpClientBuilder.headers;
        this.body = httpClientBuilder.body;
    }

    public static class HttpClientBuilder{
        private String method;
        private String url;
        private String username;
        private String password;
        private String headers;
        private String body;

        public HttpClientBuilder method(String method){
            this.method = method;
            return this;
        }

        public HttpClientBuilder url(String url){
            this.url = url;
            return this;
        }

        public HttpClientBuilder secure(String username, String password){
            this.username = username;
            this.password = password;
            return this;
        }

        public HttpClientBuilder headers(String headers){
            this.headers = headers;
            return this;
        }

        public HttpClientBuilder body(String body){
            this.body = body;
            return this;
        }

        public HttpClient build(){
            return new HttpClient(this);
        }
    }
}
