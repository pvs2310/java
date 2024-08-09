class Student
{
    int rollno;
    String name , parent;
    int marks;
}
public class arrayobj
{
    public static void main(String a[])
    {
        Student s1 = new Student();
        s1.rollno = 1;
        s1.name = "sandy";
        s1.marks = 88;

        Student s2 = new Student();
        s2.rollno = 2;
        s2.name = "venky";
        s2.marks = 98;

        Student s3 = new Student();
        s3.name = "pvs";
        s3.rollno = 3;
        s3.marks = 100;

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for(int i =0; i<1; i++)
        {
            System.out.println("name:" +s1.name  + "marks :" + s1.marks +    "Rollno : " + s1.rollno);
            System.out.println(s2.name + " " + s2.marks + " " + s2.rollno + " ");
            System.out.println(s3.name + " " + s3.marks + " " + s3.rollno + " ");
        }



    }
}

class A
{
	public A()
	{
		System.out.println("object created");
	}
	public void show()
	{
		System.out.println("in A show");
	}
}

// eg to call show method
// public class Demo
// {
// 	public static void main(String a[]) 
// 	{
// 		int marks;
// 		marks=99;
		
// 		new A();   //anonymous object
// 		new A().show();
		
// //		A obj=new A();
// 		A obj;
// 		obj=new A();
		
// 		obj.show();
// 	}
// }