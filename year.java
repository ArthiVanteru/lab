class Year
{
 public static void main(String arg[])
 {
  int n=2000;
  if(((n%4==0)&&(n%100!=0))||(n%400==0))
 {
  System.out.println("leap year");
 }
 else
 {
  System.out.println("not a leap year");
 }
}
}
