
import java.util.*;
import java.lang.Math;
class armstrong
{
public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);
int num,temp,r,s,c;
double sum;
sum=0;
c=0;

System.out.println("Enter the number ");
num=sc.nextInt();
temp=num;
while(temp>0)
{
r=temp%10;
temp=temp/10;
c++;
}
temp=num;
while(temp>0)
{
s=temp%10;
temp=temp/10;
sum=sum+(int)Math.pow(s,c);
}
if(sum==num)
System.out .println("number is armstrong");
else
System.out .println("number is not armstrong");
}
}


 
    
