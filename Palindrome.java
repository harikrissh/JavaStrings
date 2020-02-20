import java.util.*;
class Palindrome{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int count=0;
		System.out.println("Enter a string");
		String str=s.next().toLowerCase();
		StringBuffer str1=new StringBuffer(str);		
		String rev=str1.reverse().toString();
		//System.out.println(rev);
		HashSet<Character> set=new HashSet<Character>();
		if(str.equals(rev)){
			for(int i=0;i<rev.length();i++){
				set.add(rev.charAt(i));
			}
			Iterator<Character> i=set.iterator();
			while(i.hasNext()){
				char temp=i.next();
				if(temp=='a'||temp=='e'||temp=='i'||temp=='o'||temp=='u'){
					count++;
				}
			}
		}
		System.out.println();
		if(count>=2)
			System.out.println("true");
		else
			System.out.println("false");
	}	
}