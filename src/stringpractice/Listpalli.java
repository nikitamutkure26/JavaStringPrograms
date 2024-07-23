package stringpractice;

public class Listpalli {
	public static void main(String[] args) {
		String s="banana";
		for(int i=0;i<s.length()-1;i++) {
			for(int j=0;j<s.length();j++) {
				if(isPallidrone(s,i,j)) {
					//System.out.println(i+" "+j);
					
					
				
				}
			}
			
		}
		
	}
	public static boolean isPallidrone(String s,int start,int end) {
		int i=start,j=end;
		while(i<j) {
			if(s.charAt(i)!=s.charAt(j)) {
				return false;
			}
		}
		return true;
	}

}
