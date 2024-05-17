import java.util.Scanner;  
public class AsciiValue
{  
public static void main(String args[])  
{  
char ch;
System.out.print("Enter a character: ");  
Scanner sc = new Scanner(System.in);  
 ch = sc.next().charAt(0);  
int ascii = ch;  
System.out.println("ASCII value of  is: "+ascii);  
}  
}
