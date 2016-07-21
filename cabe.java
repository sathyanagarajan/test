import java.io.*;
import java.util.Scanner;
class cabe
{
public static void main(String args[])throws IOException
{
Scanner s1=new Scanner(System.in);
int nod,sume=0,vg;
System.out.println("enter the no of nodes of graph");
nod=s1.nextInt();
int[][] ed=new int[nod][nod];
for(int i=0;i<nod;i++)
{
for(int j=0;j<nod;j++)
{
ed[i][j]=s1.nextInt();
sume=ed[i][j]+sume;
}}
sume=sume/2;
vg=sume-nod+2;
System.out.println("V(G)=e-n+2 : "+vg);


}
}
