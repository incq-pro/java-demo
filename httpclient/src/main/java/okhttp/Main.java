package okhttp;

import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class Main {
    private final static OkHttpClient client = new OkHttpClient();

    public static void main(String[] args) throws Exception {
        Request request = new Request.Builder()
                .url("https://www.baidu.com")

                .build();

        try (Response response = client.newCall(request).execute()) {
            if (!response.isSuccessful()) {
                throw new IOException("unexception code: " + response.code());
            }
            Headers headers = response.headers();
            for (int i = 0; i < headers.size(); i++) {
                System.out.println(headers.name(i) + ":" + headers.value(i));
            }
            System.out.println(response.body().string());
        }
    }
}
