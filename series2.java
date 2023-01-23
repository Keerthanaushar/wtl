import java.io.*;
 class series2  
{
 public static void main(String[] args) 
 {
  DataInputStream br = new DataInputStream(System.in);
  try{
  System.out.println("Enter the no of terms ");
  int n = Integer.parseInt(br.readLine());
  int sum = 0,i,fact=1;
   for (i = 1; i <=n; i++) 
   {
	fact*=i;
    sum = sum + (i/fact);
   }
  System.out.println("Sum of series = " + sum);
 }catch(Exception e){}
 }
}