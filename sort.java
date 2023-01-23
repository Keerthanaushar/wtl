import java.io.*;
class sort
{
public static void main(String args[])
{
	DataInputStream br =new DataInputStream(System.in);
	int a[],m,i,j,t;
	try{
		System.out.println("enter size:");
		m =Integer.parseInt(br.readLine());
		a=new int[m];
		System.out.println("enter elements:");
		for(i=0;i<m;i++){
			a[i]=Integer.parseInt(br.readLine());
		}
		System.out.println("before sorting......");
		System.out.println("elements:");
		for(i=0;i<m;i++){
			System.out.println(a[i]);
		}
		for(i=0;i<m;i++){
			for(j=i+1;j<m;j++){
				if(a[i]>a[j]){
					t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}
		System.out.println("after sorting......");
		System.out.println("elements:");
		for(i=0;i<m;i++){
			System.out.println(a[i]);
		}
	}catch(Exception e){}
}
}