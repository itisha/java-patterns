package puzzles.tinyurl;

import java.util.HashMap;
import java.util.Map;

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));
public class Codec {

    private Map<Integer, String> urlMap = new HashMap<>();

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        urlMap.put(longUrl.hashCode(), longUrl);
        return Integer.valueOf(longUrl.hashCode()).toString();
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return urlMap.get(Integer.valueOf(shortUrl));
    }
}
