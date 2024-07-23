package stringpractice;

public class Javaopp {
	public static void main(String[] args) {
		String s="java is very easy";
		String[] a=s.split(" ");
		int i=0;
		int j=a.length-1;
		String s1= s.replace(a[i]+"",a[j]); 
		System.out.println(s1);
	}
}
		
//		String s2=" ";
//		for(String s2:a) {
//			System.out.println(s2);
//		}
		/*public static String sort(String[] s)
		{
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
		return new String(a);
		
	}
	
}
*/