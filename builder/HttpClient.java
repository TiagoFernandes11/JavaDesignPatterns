package builder;

public class HttpClient {
    private String method;
    private String url;
    private String username;
    private String password;
    private String headers;
    private String body;

    public HttpClient(String method, String url, String username, String password, String headers, String body) {
        this.method = method;
        this.url = url;
        this.username = username;
        this.password = password;
        this.headers = headers;
        this.body = body;
    }

    public HttpClient(HttpClientBuilder httpClientBuilder){
        this.method = httpClientBuilder.method;
        this.url = httpClientBuilder.url;
        this.username = httpClientBuilder.password;
        this.password = httpClientBuilder.password;
        this.headers = httpClientBuilder.headers;
        this.body = httpClientBuilder.body;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getHeaders() {
        return headers;
    }

    public void setHeaders(String headers) {
        this.headers = headers;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "HttpClient{" +
                "method='" + method + '\'' +
                ", url='" + url + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", headers='" + headers + '\'' +
                ", body='" + body + '\'' +
                '}';
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
