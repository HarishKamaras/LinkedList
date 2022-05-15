package com.bridgelabz.linkedlist;

public class LinkedList <E> {
    Node<E> head;
    Node<E> tail;

    public void add(E data) {
        Node<E> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }
    public void append(E data) {
        Node<E> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }
    public void insertBetween(E data) {
        Node<E> newNode = new Node<>(data);
        head.next = newNode;
        newNode.next = tail;
    }
    public E pop() {
        E data = head.data;
        head = head.next;
        return data;
    }
    public void display() {
        Node<E> temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
    }
    }

