package com.bridgelabz.linkedlist;

public class LinkedListMain {
    public static void main(String[] args) {
        System.out.println("Welcome to linked list:");
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(70);
        linkedList.add(30);
        linkedList.add(56);
        System.out.println("After Adding the data : ");
        linkedList.display();
        LinkedList<Integer> linkedList1 = new LinkedList<>();
        linkedList1.append(56);
        linkedList1.append(30);
        linkedList1.append(70);
        System.out.println();
        System.out.println("After Appending the data : ");
        linkedList1.display();
    }
}
