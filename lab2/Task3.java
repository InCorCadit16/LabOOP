package lab2;

import lab2.utils.*;

public class Task3 {
    
    public static void main(String[] args) {
        var box = new Box(5.5, 7, 9);

        System.out.printf("Aread: %.2f\nVolume: %.2f\n", box.area(), box.volume());

        var boxesQueue = new MyQueue<Box>(5);

        boxesQueue.push(box);
        boxesQueue.push(new Box(5));
        boxesQueue.push(new Box(5, 7, 9));
        boxesQueue.push(new Box(25, 12, 537));
        boxesQueue.push(new Box());

        switch(boxesQueue.isFull()) {
            case Full: System.out.println("Queue is full"); break;
            case NotFull: System.out.println("Queue is not full yet"); break;
            default: System.out.println("Queue will never be full");
        }
    }
}
