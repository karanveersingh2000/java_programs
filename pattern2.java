//Karanveer
import java.util.*;
class pattern2 
{
public static void main(String[] args) 
{
Scanner scanner = new Scanner(System.in);
System.out.print("Enter a number: ");
int n = scanner.nextInt();

for (int i = 1; i <= n; i++) 
{
for(int k=n-1;k>=i;k--)
System.out.print(" ");
for (int j = i; j >= 1; j--) 
System.out.print(j);
System.out.println(" ");
}
}
}
