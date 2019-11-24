import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * prac9e
 */
public class prac10e {
    public static void main(String[] args) {

        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
        Thread t1 = new Thread(new printData2(new File(args[1])));
        Thread t2 = new Thread(new printData2(new File(args[0])));


        // t.setPriority(+2);
        // t2.setPriority(-2);

        t1.setPriority(Thread.NORM_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
    }
    
}

class printData2 implements Runnable {
    File file;

    printData2(File file) {
        this.file = file;
    }

    @Override
    public void run() {

        Scanner input;

        try {
            input = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
            return;
        }

        while (input.hasNextLine()) {
            System.out.println(file.getName() +" "+ input.nextLine());
        }
        input.close();
    }
}