package leetcode;

import java.util.HashMap;

public class tinyurl {

    Integer count = 0;
    HashMap<String, String> invert_cache = new HashMap<String, String>();
    HashMap<String,String> cache = new HashMap<String,String>();
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        count++;
        invert_cache.put(count.toString(), longUrl);
        cache.put(longUrl, count.toString());
        return "http://tinyurl.com/" + (count).toString();
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        String key = shortUrl.substring(19);
        return invert_cache.get(key);
    }
    
    public static void main(String[] args){
        tinyurl t = new tinyurl();
        String str = t.encode("abc");
        System.out.println(str);
        System.out.println(t.decode(str));
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));