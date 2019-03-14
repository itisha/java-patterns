package puzzles.tinyurl;

public class Demo {
    public static void main(String[] args) {

        String url = "https://leetcode.com/problems/design-tinyurl";

        Codec codec = new Codec();

        String encoded = codec.encode(url);
        System.out.println(encoded);

        String decoded = codec.decode(encoded);
        System.out.println(decoded);

    }
}
