import java.io.*;
class digits{
    public int sum(int n){
	int d=0,r;
	while(n>0){
		r=n%10;
		d=d+r;
		n=n/10;
	}
	return d;
	}	
}

class sod
{
		public static void main(String args[])
	{
		int n,t;
		digits s =new digits();
		DataInputStream br=new DataInputStream(System.in);
		try{
			System.out.println("enter an number:");
			n=Integer.parseInt(br.readLine());
			t=s.sum(n);
			System.out.println("sum of digits of given number is :"+t);
		}catch(Exception e){}
	}
}