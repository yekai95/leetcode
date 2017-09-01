package first;
import java.util.Hashtable;
public class p535 {
	Hashtable<String,String> h=new Hashtable<String,String>();
public String encode(String longUrl) {
	String shorts=longUrl.substring(longUrl.length()/2);
	StringBuffer sb=new StringBuffer(shorts);
	sb.reverse();
	h.put(shorts,longUrl);
	return shorts;
}

// Decodes a shortened URL to its original URL.
public String decode(String shortUrl) {
    return h.get(shortUrl);
}
}
