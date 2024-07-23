package stringpractice;

public class RevDemo1 {
	public static void main(String[] args) {
		String s="java";
		char[] a=s.toCharArray();
		int i=0;
		int j=a.length-1;
		while(i<j) {
			char temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			i++;
			j--;
		}
		
		String s1=new String(a);
		System.out.println(s1);
//		System.out.println(s);
	}

}
