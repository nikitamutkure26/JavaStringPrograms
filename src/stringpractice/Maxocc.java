package stringpractice;

public class Maxocc {
	public static void main(String[] args) {
		String s="banana";
		int max1=0;
		int max2=0;
		char res='\u0000';
		while(s.length()>0) {
			char a=s.charAt(0);
			String s1=s.replace(a+"", "");
			int count=s.length()-s1.length();
			if(max1<count) {
				max2=max1;
				max1=count;
				//res=a;
				 
			}
			else if((max1==max2 ||count>max2) && ( count!=max1)) {
				max2=count;
				res=a;
			}
			
			s=s1;
		
//			System.out.println(a +"="+count);
//			s=s1;
		}
		System.out.println(res+"="+max2);
	}

}
