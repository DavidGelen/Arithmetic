package com.wwe.linklist;

/**
 * @name Arithmetic
 * @class name：com.wwe.linklist
 * @class describe
 * @anthor David
 * @time 2019/3/25 11:59 AM
 * @class describe
 */
public class Test {
    public static void main(String[] args) {
        MyLink list = new MyLink();
        list.addNode(5);
        list.addNode(3);
        list.addNode(1);
        list.addNode(2);
        list.addNode(55);
        list.addNode(36);
        //System.out.println("linkLength:" + list.length());
        //System.out.println("head.data:" + list.head.data);
        //list.printList();
        //list.deleteNode(4);
        //System.out.println("After deleteNode(4):");
        //list.printList();

        list.ReverseIteratively(new Node(5));
        list.printList();
    }
}

