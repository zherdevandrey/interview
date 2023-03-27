package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class UrlShortener {

    private static final String POSSIBLE_SYMBOLS = "abcdefghijklmnopqrstuvwxyzAbCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    private static final String tinyUrlHost = "http://tinyurl.com/";

    private Map<String, String> inMemLongToShort = new HashMap<>();
    private Map<String, String> inMemShortToLong = new HashMap<>();

//    public static void main(String[] args) {
//        UrlShortener urlShortener = new UrlShortener();
//        String encoded = urlShortener.encode("bla");
//        String bla = urlShortener.decode(tinyUrlHost + encoded);
//        System.out.println(bla);
//    }

    public String encode(String longUrl) {
        if (inMemLongToShort.containsKey(longUrl)) return inMemLongToShort.get(longUrl);

        String hash = hash();
        String encoded = tinyUrlHost + hash;
        inMemLongToShort.put(longUrl, hash);
        inMemShortToLong.put(hash, longUrl);

        return encoded;
    }

    public String decode(String shortUrl) {
        return inMemShortToLong.get(shortUrl.replace(tinyUrlHost, ""));
    }

    private String hash() {
        StringBuilder hashBuilder = new StringBuilder();
        Random random = new Random();
        while (true) {
            for (int i = 0; i < 7; i++) {
                hashBuilder.append(random.nextInt(POSSIBLE_SYMBOLS.length()));
            }
            if (!inMemShortToLong.containsKey(hashBuilder.toString())) return hashBuilder.toString();
            hashBuilder.setLength(0);
        }
    }

    public static void main(String[] args) {
        int[] ints = plusOne(new int[]{9, 8, 9});
        System.out.println("");
    }


    public static int[] plusOne(int[] nums) {
        int[] result = new int[nums.length];
        int delta = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (i == nums.length - 1) {
                if (nums[i] == 9) {
                    delta = 1;
                    result[nums.length - 1] = 0;
                } else {
                    result[nums.length - 1] = nums[i] + 1;
                }
            } else {
                if (nums[i] + delta == 10) {
                    result[i] = 0;
                } else {
                    result[i] = nums[i] + delta;
                    delta = 0;
                }
            }
        }
        if (result[0] == 0) {
            result = new int[nums.length + 1];
            result[0] = 1;
            return result;
        }
        return result;
    }
}
