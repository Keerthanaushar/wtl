import java.io.*;
 class series1  
{
 public static void main(String[] args) 
 {
  DataInputStream br = new DataInputStream(System.in);
  try{
	  System.out.println("Enter the no of terms ");
  int n = Integer.parseInt(br.readLine());
  int sum = 0, i = 1;
  while(i<=n){
	  sum+=i*(i+1)/2;
	  i++;
  }
  System.out.println("Sum of series = " +sum);
 }catch(Exception e){}
 }
}