import java.util.ArrayList;

/*
Task 4

Suppose you need to process course information. Each course has a name and has students
enrolled. You should be able to add/drop a student to/from the course. Use an ArrayList to store
students. A Course object can be created using the constructor Course(String name) by
passing a course name. You can add students to the course using the addStudent(String
student) method, drop a student from the course using the dropStudent(String student) method,
and return all the students in the course using the getStudents() method. Gives a test class that
creates two courses and adds students to them.
*/

class courseInformation{
    private String name;
    private ArrayList<String> list;//Creating arraylist

    public courseInformation(String name){
        this.name = name;
        list = new ArrayList<String>();
    }

    public void addStudent(String student){
        list.add(student);
    }

    public void dropStudent(String student){
        System.out.println(list.remove(student)?"Succesfully drop the student":"Enter the correct name");
    }

    public ArrayList<String> getList() {
        return list;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

}


public class Practice_Tasks4 {
    public static void main(String[] args) {
        courseInformation OOP = new courseInformation("OOP");
        courseInformation OOP_Lab = new courseInformation("OOP lab");

        OOP.addStudent("Muhammad Fahad");//adding student

        for (int i = 0; i < 20; i++) {
            OOP.addStudent("Muhammmad Fahad "+((int) Math.random()));
            OOP_Lab.addStudent("Muhammmad Fahad "+((int) Math.random()));
        }

        OOP.dropStudent("Muhammad Fahad");//droping student


        System.out.println("No of student in "+OOP.getName()+" is: "+OOP.getList());
        System.out.println("No of student in "+OOP_Lab.getName()+" is: "+OOP_Lab.getList());


    }
}