//Karanveer
import java.util.*;
import java.lang.Math;
class ques4
{
public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);
int num,temp,temp2,r,s,c,i;
double sum;
sum=0;
c=0;

System.out.println("Enter the number ");
num=sc.nextInt();
for(i=1;i<=num;i++)
{
sum=0;
c=0;
temp=i;
temp2=i;
while(temp>0)
{
r=temp%10;
temp=temp/10;
c++;
}
while(temp2>0)
{
s=temp2%10;
temp2=temp2/10;
sum=sum+(int)Math.pow(s,c);
}
if(sum==i)
System.out .println(i+"number is armstrong");

}
}
}


 
    
