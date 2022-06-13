package com.bl.linked_list;

public class LinkedList {
    MyNode start;
    int size;

    public LinkedList() {
        start = null;
        size = 0;
    }

    public boolean isempty() {
        if (start == null)
            return true;
        else
            return false;
    }

    public void displayList() {
        MyNode test;
        if (isempty())
            System.out.println("List is empty");
        else {
            test = start;
            for (int index = 1; index <= size; index++) {
                System.out.println(test.getValue());
                test = test.getNext();
            }
        }
    }

    public void insertionAtFirst(int value) {
        MyNode nodeInsert = new MyNode();
        nodeInsert.setValue(value);
        nodeInsert.setNext(start);
        start = nodeInsert;
        size++;
    }

    public void insertiionAtlast(int value) {
        MyNode insertNode, traverseNode;
        insertNode = new MyNode();
        insertNode.setValue(value);
        traverseNode = start;
        if (traverseNode == null)
            start = insertNode;
        else {
            while (traverseNode.getNext() != null) {
                traverseNode = traverseNode.getNext();
            }
            traverseNode.setNext(insertNode);
        }
        size++;
    }

    public void insertionAtPosition(int value, int position) {
        if (position == 1)
            insertiionAtlast(value);
        else if (position == size + 1)
            insertiionAtlast(value);
        else if (position > 1 && position <= size) {
            MyNode insertNode, testeNode;
            insertNode = new MyNode(value, null);
            testeNode = start;
            for (int index = 1; index < position - 1; index++) {
                testeNode = testeNode.getNext();
            }
            insertNode.setNext(testeNode.getNext());
            testeNode.setNext(insertNode);
            size++;
        } else
            System.out.println("Insertion not possible at that position");
    }

    public void deletefirst() {
        if (start == null)
            System.out.println("Linked list is empty");
        else {
            start = start.getNext();
            size--;

        }

    }

    public void deleteLast() {
        if (start == null)
            System.out.println("Linked list is empty");
        else if (size == 1)
            start = null;

        else {
            MyNode traverseNode;
            traverseNode = start;
            for (int index = 1; index < size - 1; index++) {
                traverseNode = traverseNode.getNext();
            }
            traverseNode.setNext(null);
            size--;
        }
    }

    public void deleteAtPosition(int position) {
        if (start == null)
            System.out.println("Linked List is empty");
        else if (position < 1 && position > size)
            System.out.println("Invalid list");
        else if (position == 1)
            deletefirst();
        else if (position == size)
            deleteLast();
        else {
            MyNode traverseNode, currentNode;
            traverseNode = start;
            for (int index = 1; index < position - 1; index++) {
                traverseNode = traverseNode.getNext();
            }
            currentNode = traverseNode.getNext();
            currentNode.setNext(currentNode.getNext());
            size--;
        }
    }
}
