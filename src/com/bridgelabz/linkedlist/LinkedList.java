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
    public void popLast() {
        Node<E> poppedNode = new Node<>(tail.data);
        Node<E> temp = head;
        Node<E> prev = null;
        while (temp.data != null) {
            if (temp.data == tail.data) {
                prev.next = null;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
    }
    boolean search(E searchData) {
        Node<E> temp = head;
        Node<E> searchedData = null;
        while (temp != null) {
            if (temp.data == searchData) {
                searchedData = temp;
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
    public void insertAfter(E searchData, E insertData) {
        Node<E> newNode = new Node<>(insertData);
        Node<E> searchedData = search1(searchData);
        if (searchedData != null) {
            newNode.next = searchedData.next;
            searchedData.next = newNode;
        }
    }
        Node<E> search1(E searchData){
            Node<E> temp =head;
            Node<E> searchedData = null;
            while (temp!=null){
                if(temp.data == searchData){
                    searchedData = temp;
                    break;
                }
                temp = temp.next;
            }
            return searchedData;
    }
    public void DeleteElement(E searchData) {
        Node<E> searchedNode = new Node<>(searchData);
        Node<E> temp = head;
        Node<E> prev = null;
        while (temp != null) {
            if (temp.data == searchedNode.data) {
                prev.next = temp.next;
            }
            prev = temp;
            temp = temp.next;
        }
    }
    public void linkedListSize() {
        Node<E> temp = head;
        Integer count = 0;
        while (temp != null) {
            count = count + 1;
            temp = temp.next;
        }
        System.out.println("Total Size in this Linked List is: "+count);
    }
    public void display() {
        Node<E> temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
    }
    }

