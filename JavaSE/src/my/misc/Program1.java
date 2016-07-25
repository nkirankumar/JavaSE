package my.misc;

class p{
	public static void disp(){
		 System.out.println("parent");
	}
}

public class Program1 extends p {
	
	public static void disp(){
		 System.out.println("child");
	}

	public static void main(String... args) {
		String s=new String("kiran");
		s.concat("kumar");
		System.out.println(s);
		
		StringBuffer sb=new StringBuffer("kiran");
		sb.append("kumar");
		System.out.println(sb);
		
		disp();
	}

}




