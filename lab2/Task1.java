package lab2;

import lab2.utils.Box;

public class Task1 {

    public static void main(String[] args) {
        var box1 = new Box();
        var box2 = new Box(12.2);
        var box3 = new Box(3, 4, 5);

        System.out.println(box1);
        System.out.println(box2);
        System.out.println(box3);
    }
}
