/******************************************************************************
 Walkthrough Tasks:
 
 Task 1:
 
 Implement a superclass Person. Make two classes, Student and Instructor, that inherit
 from Person. A person has a name and a year of birth. A student has a major, and
 an instructor has a salary. Write the class declarations, the constructors, and the
 methods toString for all classes. Supply a test program that tests these classes and
 Methods.
 *******************************************************************************/
import java.util.Scanner; 

class Person{
	private String name;
	private long birthYear;

	public Person(String n, long byear){
	  name = n;
	  birthYear = byear;
	}

	public String toString(){
	  return "Person[name=" + name + ",birthYear=" + birthYear + "]";
	}
}

class Student extends Person{
  private String major;

  public Student(String n, int byear, String m){
     super(n, byear);
     major = m;
  }

  public String toString(){
    return "Student[super=" + super.toString() + ",major=" + major + "]";
  }
}

class Instructor extends Person{
  private double salary;
  
	public Instructor(String n, int byear, double s){
      super(n, byear);
      salary = s;
    }

    public String toString(){
      return "Employee[super=" + super.toString() + ",salary=" + salary + "]";
    }
}

public class Practice_Tasks_Walkthrough_1{
  public static void main(String[] args)
  {
    Person a = new Person("Anil", 1992);
    Student b = new Student("Jimmy", 1919, "Information Technology");
    Instructor c = new Instructor("Mike", 1998, 95000);
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
  }
}

