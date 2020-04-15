import java.util.ArrayList;

/*
Task 5

How do you do the following?
a. Create an ArrayList for storing double values?
b. Append an object to a list?
c. Insert an object at the beginning of a list?
d. Find the number of objects in a list?
e. Remove a given object from a list?
f. Remove the last object from the list?
g. Check whether a given object is in a list?
h. Retrieve an object at a specified index from a list?

*/
class Task5{

}


public class test {
    public static void main(String[] args) {

//(a)
        ArrayList<Double> list = new ArrayList<Double>();
        //(b)
        System.out.println(list.add(Task5));
        //(c)
        System.out.println(list.add(10, Task5));
        //(d)
        System.out.println(list.size());
        //(e)
        System.out.println(list.remove(Task5));
        //(f)
        System.out.println(list.remove(list.size() - 1));
        //(g)
        System.out.println(list.contains(Task5));
        //(h)
        System.out.println(list.get(10));


    }
}