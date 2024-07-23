package stringpractice;

public class PracticeDemo1 {
	public static void main(String[] args) {
		String s1="java is oop lang";
		String s2=" ";
		char[] a=s1.toCharArray();
		int i=0;
		int j=0;
		while(i<a.length) {
			while(j<a.length && a[j]!=' ') {
				j++;
			}
			int k=j-1;
			String t="";
			while(k>=i) {
				t+=a[k];
				k--;
			}
			s2+=t;
			if(j<a.length) {
				s2+=" ";
				
			}
			j++;
			i=j;
			
		}
		System.out.println(s2);
	}

}
