package lab2;

import lab2.utils.MyQueue;

public class Task2 {
    public static void main(String[] args) {
        var nubmersQueue = new MyQueue<Integer>();
        var stringsQueue = new MyQueue<String>(4);
        
        nubmersQueue.push(17);
        nubmersQueue.push(12);
        nubmersQueue.push(-3);

        System.out.println(nubmersQueue.pop());

        stringsQueue.push("Get outta here!");
        stringsQueue.push("I\'m playing Maincraft!");
        stringsQueue.push("GG WP");

        System.out.println(stringsQueue.pop());
    }
}
