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
     * @Description: 向链表中插入数据
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
                //连起来
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

    /**
     * @Author: David
     * @Date: 2019/4/15 11:32 PM
     * @param head
     * @Description: 链表反转
     */
    public void ReverseIteratively(Node head) {
        if(head == null || head.next == null) {
            return;
        }
        Node p1 = head;
        Node p2 = head.next;
        Node p3 = null;
        while(p2 != null) {
            p3 = p2.next;
            p2.next = p1;
            p1 = p2;
            p2 = p3;
        }

        //把head节点的next指向空，成为逆序链表的尾节点。并且把p1赋值给head，让p1所在的节点成为逆序链表的头节点
        head.next = null;
        head = p1;
    }

    /**
     * @Author: David
     * @Date: 2019/4/17 10:48 PM
     * @Description: 查找链表中间节点
     */
    public Node SearchMid() {
        Node p = this.head,q = this.head;
        while (p != null && p.next != null && p.next.next != null) {
            p = p.next.next;
            q = q.next;
        }
        System.out.println("Mid:" + q.data);
        return q;
    }

    /**
     * @Author: David
     * @Date: 2019/4/17 10:48 PM
     * @Description: 链表排序
     */
    public void orderList() {
        Node nextNode = null;
        int tmp = 0;
        Node curNode = head;
        while (curNode.next != null) {
            nextNode = curNode.next;
            while (nextNode != null) {
                if (curNode.data > nextNode.data) {
                    tmp = curNode.data;
                    curNode.data = nextNode.data;
                    nextNode.data = tmp;
                }
                nextNode = nextNode.next;
            }
            curNode = curNode.next;
        }
    }

    /**
     * @Author: David
     * @Date: 2019/4/17 10:48 PM
     * @Description: 删除重复节点
     */
    public void deleteDuplecate(Node head) {
        Node p = head;
        while (p != null) {
            Node q = p;
            while (q.next != null) {
                if (p.data == q.next.data) {
                    q.next = q.next.next;
                } else
                    q = q.next;
            }
            p = p.next;
        }
    }

    /**
     * @Author: David
     * @Date: 2019/4/17 11:03 PM
     * @param pListHead\
     * @Description: 从尾到头输出单链表，采用递归方式实现
     */
    public void printListReversely(Node pListHead) {
        if (pListHead != null) {
            printListReversely(pListHead.next);
            System.out.println("printListReversely: " + pListHead.data);
        }
    }

}
