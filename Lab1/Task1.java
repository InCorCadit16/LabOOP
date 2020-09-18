package Lab1;

import Lab1.utils.Monitor;
import Lab1.utils.Resolution;

public class Task1 {
    

    public static void main(String args[]) {
        var monitor1 = new Monitor();

        monitor1.resolution = Resolution.UHD;
        monitor1.widthInches = 17.5f;
        monitor1.heightInches = 11.3f;
        monitor1.color = 0xFFFFFF;

        var monitor2 = new Monitor();
        monitor2.resolution = Resolution.HD;
        monitor2.widthInches = 20.2f;
        monitor2.heightInches = 13.3f;
        monitor2.color = 0xFFFFFF;

        if (monitor1 == monitor2) 
            System.out.print("monitor1 and monitor2 is the same monitor");
        else 
            System.out.print("monitor1 and monitor2 are different instances of monitors");
    }
}
