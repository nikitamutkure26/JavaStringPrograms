package stringpractice;

public class StringplliDemo3 {
	public static void main(String[] args) {
		String s="malayalam";
		if(isPallidrone(s)) {
			System.out.println("pallidrone");
		}
		else {
			System.out.println("not pallidrone");
		}
	}
	
	public static boolean isPallidrone(String s) {
		char[] a=s.toCharArray();
		int i=0;
		int j=a.length-1;
		while(i<j) {
			if(a[i]!=a[j]) {
				return false;
			}
			i++;
			j--;
		}
		return true;		
	}

}
