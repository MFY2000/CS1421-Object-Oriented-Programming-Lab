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



public class Practice_Tasks5 {
    public static void main(String[] args) {
     
//(a)
    ArrayList<Double> list = new ArrayList<Double>();
    //(b)
        list.add(Task5);
    //(c)
        list.add(0, Task5);
    //(d)
        list.size();
    //(e)
        list.remove(object);
    //(f)
        list.remove(list.size() - 1);
    //(g)
        list.contains(object);
    //(h)
        list.get(index);
    
       
    }
}