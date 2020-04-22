import java.util.ArrayList;
import java.util.Set;

/*

2. You are asked to develop communication software such as an FTP (File Transfer Protocol) or Telnet
program that uses a modem. Your program must work with a variety of different modems. Although all the
modems provide the same functionality, their implementations are quite different.
Typically, there are open, close, read, and write operations that are invoked on a modem.
It would be inadvisable to create multiple versions of the application to interface with each of the modems
available on the market because the code maintenance and application upgrades would be too much work.
Suggest and implement a solution in order to provide a uniform programming interface to all the modems
so the application that uses a modem would not break even if the implementations in the methods of the
modem change in future.
The two types of modems that use these common modem behaviours are HuaweiModem and
MindstickModem.
Write an application that creates objects of HuaweiModem and MindstickModem, places references to
those objects in ArrayList, then iterates through the ArrayList, polymorphically invoking each object’s
methods

*/

interface Modems {
    boolean open = false;
    boolean close = false;
    boolean read = false;
    boolean write = false;

    void OpenTheModems();
    void CloseTheModems();
    void ReadTheModems();
    void writeTheModems();

}

class HuaweiModem implements Modems{
    @Override
    public void OpenTheModems() {
        System.out.println("OpenTheModems in the Class Huawei Modem");
    }

    @Override
    public void CloseTheModems() {
        System.out.println("CloseTheModems in the Class Huawei Modem");
    }

    @Override
    public void ReadTheModems() {
        System.out.println("ReadTheModems in the Class Huawei Modem");
    }

    @Override
    public void writeTheModems() {
        System.out.println("writeTheModems in the Class Huawei Modem");
    }
}
class MindstickModem implements Modems{
    @Override
    public void OpenTheModems() {
        System.out.println("OpenTheModems in the Class Mindstick Modem");
    }

    @Override
    public void CloseTheModems() {
        System.out.println("CloseTheModems in the Class Mindstick Modem");
    }

    @Override
    public void ReadTheModems() {
        System.out.println("ReadTheModems in the Class Mindstick Modem");
    }

    @Override
    public void writeTheModems() {
        System.out.println("writeTheModems in the Class Mindstick Modem");
    }
}
public class Practice_Tasks3b{
    public static void main(String[] args) {
        ArrayList<Modems> typeOfModem = new ArrayList<Modems>(3);

        typeOfModem.add(new HuaweiModem());
        typeOfModem.add(new MindstickModem());

        for (Modems Member : typeOfModem) {
            Member.OpenTheModems();
            Member.CloseTheModems();
            Member.ReadTheModems();    
            Member.writeTheModems();
        }
    }
}