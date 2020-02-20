import java.util.*;
class CountCharsNotRepeated{
	public static void main(String[] args){
		char ch;
    	int count,c=0;
    	Scanner s=new Scanner(System.in);
    	String a = s.next().toLowerCase();
    	for (ch='a';ch<='z';ch++) {
        	count = 0;
        	for (int i=0;i<a.length();i++) {
            if (a.charAt(i) == ch) {
                count++;
            }
        }
        if(count==1){
        	c++;
        }
    }
	System.out.println(c);
	}
}