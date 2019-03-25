package com.wwe.linklist;

/**
 * @name Arithmetic
 * @class name：com.wwe.linklist
 * @class describe
 * @anthor David
 * @time 2019/3/25 11:38 AM
 * @class describe
 */
public class MyLink {
    Node head;

    /**
     * @Author: David
     * @Date: 2019/3/25 11:39 AM
     * @param d
     * @Description: 向链表中插入数据,往头结点插入数据
     */
    public void addNode(int d) {
        Node newNode = new Node(d);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    /**
     * @Author: David
     * @Date: 2019/3/25 2:54 PM
     * @param index
     * @Description:
     */
    public boolean deleteNode(int index) {
        if (index < 1 || index > length()) {
            return false;
        }
        if (index == 1) {
            head = head.next;
            return true;
        }
        int i = 1;
        Node preNode = head;
        Node curNode = preNode.next;
        while (curNode != null) {
            if (i == index) {
                preNode.next = curNode.next;
                return true;
            }
            preNode = curNode;
            curNode = curNode.next;
            i++;
        }
        return false;
    }

    public int length() {
        int length = 0;
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
            length++;
        }
        return length;
    }

    /**
     * 在不知道头指针的情况下删除指定节点
     * @param n
     * @return
     */
    public boolean deleteNode(Node n) {
        if(n == null || n.next == null) {
            return false;
        }
        int temp = n.data;
        n.data = n.next.data;
        n.next.data = temp;
        n.next = n.next.next;
        return true;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
