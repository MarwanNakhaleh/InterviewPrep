import java.util.*;
import java.lang.Math;

public class Strings{
	public static boolean isUnique(String str){
		if(str.length() <= 1) return true;
		ArrayList<Character> seenbefore = new ArrayList<>();
		for(int i = 0; i < str.length(); i++){
			if(seenbefore.contains(str.charAt(i))) return false;
			else seenbefore.add(str.charAt(i));
		}
		return true;
	}

	public static boolean oneAway(String str1, String str2){
		if(str1.length() <= 1 && str2.length() <= 1) return true;
		if(Math.abs(str1.length() - str2.length()) > 1) return false;
		HashMap<Character, Integer> str01 = new HashMap<Character, Integer>();
		HashMap<Character, Integer> str02 = new HashMap<Character, Integer>();		
		
		for(int i = 0; i < str1.length(); i++){
			if(str01.containsKey(str1.charAt(i))){
				int current_val = str01.get(str1.charAt(i));
				str01.put(str1.charAt(i), current_val + 1);
			}
			else{
				str01.put(str1.charAt(i), 1);
			}
		}
		for(int i = 0; i < str2.length(); i++){
                        if(str02.containsKey(str2.charAt(i))){
                                int current_val = str02.get(str2.charAt(i));
                                str02.put(str2.charAt(i), current_val + 1);
                        }
                        else{
                                str02.put(str2.charAt(i), 1);
                        }
                }
		
				

		return true;	
	}

	/*
	public static boolean isPerm(String str1, String str2){
		if(str1.length() == 0 && str2.length() == 0) return true;
		if(str1.length() != str2.length()) return false;
		HashMap str1_chars = new HashMap();
		HashMap str2_chars = new HashMap();
		for(int i = 0; i < str1.length(); i++){
			if(str1_chars.containsKey(str1.charAt(i)) == true){
				int current_val = Integer.parseInt(str1_chars.get(str1.charAt(i)).intValue());
				str1_chars.put(str1.charAt(i), current_val + 1);
			}else{
				str1_chars.put(str1.charAt(i), 1);
			}
		}
		for(int i = 0; i < str2.length(); i++){
                        if(str2_chars.containsKey(str2.charAt(i)) == true){
                                int current_val = Integer.parseInt(str2_chars.get(str2.charAt(i)).intValue());
				str2_chars.put(str2.charAt(i), current_val + 1);
			}else{
                                str2_chars.put(str2.charAt(i), current_val + 1);
                        }
                }
		if(str1_chars.equals(str2_chars)) return true;
		else return false;
	}
	*/
	
	public static void main(String[] args){
		System.out.println(isUnique("ass"));
		//System.out.println(isPerm("ass", "ssf"));
		System.out.println(oneAway("aaaaa", "aaaab"));
	}
}
