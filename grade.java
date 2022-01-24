import java.util.Scanner;

public class grade 
{
    static void calgrade(float marks,String name, int rollno)
    {
        if(marks <= 33 )
        {
            System.out.println("name : "+name);
            System.out.println("Roll number : "+rollno);
            System.out.println("Marks : "+marks);
            System.out.println("Grade : F");

        }
        else if(39 >= marks && marks  >= 34)
        {
            System.out.println("name : "+name);
            System.out.println("Roll number : "+rollno);
            System.out.println("Marks : "+marks);
            System.out.println("Grade : P");

        }
        else if(49 >= marks && marks>= 40)
        {
            System.out.println("name : "+name);
            System.out.println("Roll number : "+rollno);
            System.out.println("Marks : "+marks);
            System.out.println("Grade : C1");

        }else if(59>=marks && marks>=50)
        {
            System.out.println("name : "+name);
            System.out.println("Roll number : "+rollno);
            System.out.println("Marks : "+marks);
            System.out.println("Grade : B2");

        }
        else if(69>=marks && marks>=60)
        {
            System.out.println("name : "+name);
            System.out.println("Roll number : "+rollno);
            System.out.println("Marks : "+marks);
            System.out.println("Grade : B1");

        }
        else if(79>=marks && marks>=70)
        {
            System.out.println("name : "+name);
            System.out.println("Roll number : "+rollno);
            System.out.println("Marks : "+marks);
            System.out.println("Grade : A1");

        }
        else if(89>= marks && marks >=80)
        {
            System.out.println("name : "+name);
            System.out.println("Roll number : "+rollno);
            System.out.println("Marks : "+marks);
            System.out.println("Grade : A2");

        }
        else if(100>= marks && marks >=90)
        {
            System.out.println("name : "+name);
            System.out.println("Roll number : "+rollno);
            System.out.println("Marks : "+marks);
            System.out.println("Grade : O");

        } 
    }
    public static void main(String[] args) {
        String name;
        int rollno;
        float marks;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter name");
        name = sc.nextLine();
        System.out.println("enter roll number");
        rollno = sc.nextInt();
        System.out.println("enter marks");
        marks = sc.nextFloat();
        calgrade(marks,name,rollno);
        sc.close();
    }
    
}
