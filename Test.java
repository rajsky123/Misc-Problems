
import java.util.*;
public class Test {

	public static void main(String[] args) {
		Scanner ss=new Scanner(System.in);
		System.out.println("enter a sentence:");
		String data=ss.nextLine();
		Vector v=new Vector();
        String words="";
        int cnt=0;
        for(int i=0;i<data.length();i++)
        {
        	if(data.charAt(i)!=' ')
        	{    
        		words=words+data.charAt(i);
        	}
        	else if((data.charAt(i-1))!=' ')
        	{
        		v.add(words);
        		words="";
        	}
        	
        }
        v.add(words);
         
        for(int i=0;i<v.size();i++)
        System.out.print(v.get(i)+" ");
}
}