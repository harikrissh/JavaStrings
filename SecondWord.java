import java.util.*;
import java.lang.*;
class SecondWord{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int count=0;
		String s1=s.nextLine();
		String[] splitS1=s1.split(" ");
		String s2=s.nextLine();
		String[] splitS2=s2.split(" ");
		String second=splitS2[1];
		for(int i=0;i<splitS1.length;i++){
			if(splitS1[i].equals(second)){
				count++;
			}
		}
		System.out.println(count);
	}
	
}