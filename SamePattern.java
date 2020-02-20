import java.util.*;
class SamePattern{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		String s1=s.nextLine();
		String s2=s.nextLine();
		boolean flag=false;
		int l1=s1.length();
		for(int i=0;i<l1;i++){
			if(s1.charAt(i)=='-'&&s2.charAt(i)=='-')
				flag=true;
			if(s1.charAt(i)!='-'&&s2.charAt(i)=='-')
				flag=false;
			if(s1.charAt(i)=='-'&&s2.charAt(i)!='-')
				flag=false;
		}
		if(flag==true)
			System.out.println("true");
		else
			System.out.println("false");
	}
}