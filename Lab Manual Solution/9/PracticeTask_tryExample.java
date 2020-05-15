
// Task 1:
class Test1 {

    public static void main(String[] args){
        try {
            System.out.println(1 / 0);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

}

// 2.

class Test2 {
    public static void main(String[] args) {
        int[] list = new int[5];
        try {
            System.out.println(list[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}


// 3.

class Test3 {
    public static void main(String[] args) {
        String s = "abc";
        try {
            System.out.println(s.charAt(3));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}


// 4.


class Test4 {
    public static void main(String[] args) {
        Object o = new Object();
        try {
            String d = (String)o;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}


// 5. 

class Test5 {
    public static void main(String[] args) {
        Object o = null;
        try {
            System.out.println(o.toString());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}


// 6.


class Test6 {
    public static void main(String[] args) {
        try {
            System.out.println(1.0 / 0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}


public class PracticeTask_tryExample{
    public static void main(String[] args) {
        Test1.main(args);
        Test2.main(args);
        Test3.main(args);
        Test4.main(args);
        Test5.main(args);
        Test6.main(args);
    }
}
