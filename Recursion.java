import java.util.*;

public class Recursion{
	public static int fib_cache(int n, int[] cache){
		if(n == 0 || n == 1) return 1;
		if(cache[n] == 0){ // remember arrays in Java initialize integers to 0
			cache[n] = fib_cache(n - 1, cache) + fib_cache(n - 2, cache);
		}
		return cache[n];
	}

	public static void powerSet(ArrayList<Integer> set){
		if(set.size() <= 1) return;
		for(int i = 0; i < set.size(); i++){
			System.out.println(set); 
		}
	}

	public static void permString(String prefix, String str){
		if(str.length() == 0) System.out.println(prefix);
		for(int i = 0; i < str.length(); i++){
			permString(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, str.length()));
		}
	}

	public static void permNum(ArrayList<Integer> prefix, ArrayList<Integer> number){
		if(number.size() == 0){
			for(int i = 0; i < prefix.size(); i++){
				System.out.print(prefix.get(i));
				System.out.print("\n");
			}
		}
		for(int i = 0; i < number.size(); i++){
			prefix.add(number.get(i));
			number.remove(i);
			permNum(prefix, number);
		}
	}

	public static int tripleStep(int n){
		if(n == 0) return 0;
		if(n == 1) return 1;
		if(n == 2) return 2;
		if(n == 3) return 4;
		return tripleStep(n - 1) + tripleStep(n - 2) + tripleStep(n - 3);
	}

	public static void main(String[] args){
		System.out.println(fib_cache(30, new int[31]));
		System.out.println(tripleStep(5));
		ArrayList<Integer> prefix = new ArrayList<>();
		ArrayList<Integer> num = new ArrayList<>();
		num.add(3);
		num.add(5);
		num.add(7);
		num.add(9);
		permString("", "asdf");
		permNum(prefix, num);

	}
}