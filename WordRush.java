import java.util.Scanner;
public class WordRush {
    void compare(String a[], String b)
    {
    	for(int i=0;i<2;i++)
    	{
    		if(b.equals(a[i]))
    		{
    			System.out.println("success");
    		}
    	}
    }
	public static void main(String[] args) {
		WordRush w=new WordRush();
		System.out.println("t a e");
		System.out.println("Enter the 3 letter combnation of this word");
		String a[]={"eat","ate"};
		Scanner s=new Scanner(System.in);
		String b=s.next();
		w.compare(a,b);
	}

}
