package concurrency.future.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.UnknownHostException;

public class HttpConnect {

    public static String download(String sourceUrl) throws MalformedURLException, URISyntaxException {

        URL url = new URI(sourceUrl).toURL();
        Integer responseCode = null;
        try {
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            responseCode = con.getResponseCode();

            if (responseCode >= 200 && responseCode < 300) { // ok
                return read(con.getInputStream());
            }

        } catch (UnknownHostException e) {
            System.out.println("ERROR: URL=" + sourceUrl + " is unknown (responseCode=" + responseCode + ")");
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }


    public static String read(InputStream in) {
        StringBuilder text = new StringBuilder();

        try (BufferedReader br = new BufferedReader(new InputStreamReader(in, "UTF-8"))) {
            String line;
            while ((line = br.readLine()) != null) {
                text.append(line).append("\n");
            }
        } catch (UnsupportedEncodingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return text.toString();
    }
}
