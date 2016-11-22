import java.util.HashMap;
import java.util.Map;

public class Learn {
	public static void main(String[] args){
		Map<String, Integer> map = new HashMap<>();
		map.put("hello", 1);
		int val = map.containsKey("hello") ? map.get("hello") : 0;
		map.put("hello", ++val);
		System.out.println(map.get("hello"));
		
		int[] arr = new int[10];
		int size = arr.length;
		System.out.println(size);
		// permutations("hello");
		perm("", "hello");
	}
	
	public static void permutations(String str){
		perm("", str);
	}
	
	public static void perm(String prefix, String str){
		int n = str.length();
		if(n == 0) System.out.println(prefix);
		else{
			for(int i = 0;i < n; i++){
				perm(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
			}
		}
	}
}
