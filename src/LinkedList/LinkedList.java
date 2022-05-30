package LinkedList;

import java.util.NoSuchElementException;

public class LinkedList {

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
            next = null;
        }
    }

    private Node first;
    private Node last;

    private int size;

    public LinkedList() {
        first = null;
        last = null;
    }

    public void addFirst(int value) {
        Node newNode = new Node(value);

        if(first == null) {
            first = newNode;
            last = newNode;
        } else {
            newNode.next = first;
            first = newNode;
        }
        size++;
    }

    public void addLast(int value) {
        Node newNode = new Node(value);

        if(first == null) {
            first = newNode;
            last = newNode;
        } else {
            Node curr = first;
            while(curr.next != null) {
                curr = curr.next;
            }
            curr.next = newNode;
            last = newNode;
        }

        size++;
    }

    public void deleteFirst() {
        if(first == null)
            throw new NoSuchElementException();

        if(first == last) {
            first = null;
            last = null;
        } else {
            Node curr = first;
            first = curr.next;
            curr.next = null;
        }
            size--;
    }

    public void deleteLast() {

        if(first == null)
            throw new NoSuchElementException();

        if(first == last) {
            first = null;
            last = null;
        } else {
            Node prev = first;
            Node curr = first.next;

            while (curr.next != null) {
                curr = curr.next;
                prev = prev.next;
            }
            prev.next = null;
            last = prev;
        }
        size--;
    }

    public boolean contains(int value) {
//        if(first == null) // this statement isn't necessary
//            return false;
        Node curr = first;
        while(curr!=null) {
            if(curr.value == value)
                return true;
            curr = curr.next;
        }
        return false;
    }

    public int indexOf(int value) {
//        if(first == null)
//            return -1;

        int index = 0;
        Node curr = first;

        while(curr != null) {
           if(curr.value == value) {
               return index;
           }
           curr = curr.next;
           index++;
        }
        return -1;
    }

    public void print() {
        Node curr = first;
        while(curr!=null) {
            System.out.println(curr.value);
            curr = curr.next;
        }
    }

    public int size() {
        return size;
    }

    public int[] toArray() {
        var arr = new int[size];
        Node current = first;
        int index=0;
        while(current != null) {
            arr[index] = current.value;
            index++;
            current = current.next;
        }
        return arr;
    }

}
