import java.io.*;
class digits{
    public int sum(){
		int n,i,s=0;
		DataInputStream br=new DataInputStream(System.in);
		try{
			System.out.println("enter limit:");
			n=Integer.parseInt(br.readLine());
			for(i=1;i<=n;i++)
			{
				if(i%2==0){
					s+=i;
				}
			}
		}catch(Exception e){}	
		return s;
	}
}

class soe
{
		public static void main(String args[])
	{
		int t;
		digits d =new digits();
		DataInputStream br=new DataInputStream(System.in);
		t=d.sum();
		System.out.println("sum of even number are :"+t);
	}
}