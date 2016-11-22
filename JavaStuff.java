public class JavaStuff{
	public static String shortener(String str){
		String returned = "";
		int count = 0;
		for(int i = 0; i < str.length() - 1; i++){
			if(count == 0) count += 1;
			if(str.charAt(i) == str.charAt(i + 1))
			{
				count += 1;
			}
			else
			{
				returned += str.charAt(i);
				returned += Integer.toString(count);
				count = 0;
			}
			if(i + 1 == str.length() - 1){
				returned += str.charAt(i);
                                returned += Integer.toString(count);
                                count = 0;
			}
		}
		if(returned.length() > str.length()) return str;
		else return returned;
	}

	public static boolean can_add(int[] arr, int target){
		boolean canadd = false;
		for(int i = 0; i < arr.length(); i++){
			int other = target - arr[i];
			if(IntStream.of(arr).anyMatch(x -> x = other)){
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args){
		System.out.println(shortener("aabccccc"));	
	}
}
