
// Task 1:
class Test1 {

    public static void main(String[] args) throws ArithmeticException{
            System.out.println(1 / 0);
       
    }

}

// 2.

class Test2 {
    public static void main(String[] args)  throws IndexOutOfBoundsException{
        int[] list = new int[5];
       
            System.out.println(list[5]);
       
    }
}


// 3.

class Test3 {
    public static void main(String[] args)  throws IndexOutOfBoundsException{
        String s = "abc";
       
            System.out.println(s.charAt(3));
       
    }
}


// 4.


class Test4 {
    public static void main(String[] args)  throws NullPointerException{
        Object o = new Object();
       
            String d = (String)o;
       
    }
}


// 5. 

class Test5 {
    public static void main(String[] args)  throws NullPointerException{
        Object o = null;
       
            System.out.println(o.toString());
       
    }
}


// 6.


class Test6 {
    public static void main(String[] args)  throws ArithmeticException{
       
            System.out.println(1.0 / 0);
       
    }
}


public class PracticeTask_throwsExample{
    public static void main(String[] args) throws Exception{
        Test1.main(args);
        Test2.main(args);
        Test3.main(args);
        Test4.main(args);
        Test5.main(args);
        Test6.main(args);
    }
}
