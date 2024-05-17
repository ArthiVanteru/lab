public class TypeCasting
{  
public static void main(String[] args)  
{  
int a = 7;  
//implict typecasting 
long b= a;  
float c = b;  
System.out.println("Before conversion, int value "+a);  
System.out.println("After conversion, long value "+b);  
System.out.println("After conversion, float value "+c);

  int d = 166;  
//explicit typecasting


float i = (float)d;  
System.out.println("Before conversion: "+d);  

System.out.println("After conversion into float type: "+i);  


}  
}
