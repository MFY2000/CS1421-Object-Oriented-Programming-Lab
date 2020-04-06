
class Main
{
    private int Lab = 6 ;
    private int Evaluation = 0 ;
    private int Home = 0 ;
    public static void main(final String[] args) {
        try {
            Runtime.getRuntime().exec("javac Practice_Tasks1.java");

            Scanner scan = new Scanner(System.in);

            System.out.println("Enter the task number b/w 1 - 6:");
            int task = scan.nextInt();

            System.out.println("Wait for 3 second and in 5 file is closed");

            final long start = System.currentTimeMillis();
            Thread.sleep(3000);

            Runtime.getRuntime().exec("cmd /c start cmd.exe /K \"java Practice_Tasks"+task+" \"");

            final long end = System.currentTimeMillis();
            Thread.sleep(5000);

            Runtime.getRuntime().exec("taskkill /f /MAX cmd.exe");

            Runtime.getRuntime().exec("taskkill /f /im cmd.exe");

    } 
    
        catch (final Exception e){
            System.out.println("HEY Buddy ! U r Doing Something Wrong ");
            e.printStackTrace();
        }
    }
}
