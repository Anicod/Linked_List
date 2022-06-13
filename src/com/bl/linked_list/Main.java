package com.bl.linked_list;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("welcome to the Linked list");
        Scanner  scanner = new Scanner(System.in);
        LinkedList linkedList = new LinkedList();
        while (true){
            System.out.println("");
            System.out.print("enter the  choice"+" ");
            int choice = scanner.nextInt();
            int value, position;

            switch (choice){
                case 1:
                    System.out.println("enter value of the list");
                    value = scanner.nextInt();
                    linkedList.insertionAtFirst(value);
                    break;
                case 2:
                    System.out.println("enter the vlaue of the list");
                    value = scanner.nextInt();
                    linkedList.insertiionAtlast(value);
                    break;
                case 3:
                    System.out.println("enter value and postion of the list");
                    position = scanner.nextInt();
                    value = scanner.nextInt();
                    linkedList.insertionAtPosition(position, value);
                    break;
                case 4:
                    System.out.println("delete the value in the list");
                    linkedList.deletefirst();
                    break;
                case 5:
                    System.out.println("delete the vlaue in the list");
                    linkedList.deleteLast();
                    break;
                case 6:
                    System.out.println("enter position which value to delete");
                    position = scanner.nextInt();
                    linkedList.deleteAtPosition(position);
                    break;
                case 7:
                    linkedList.displayList();
                    break;
                case 8:
                    System.exit(1);
                default:
                    System.out.println("invaid entry");
            }
        }
    }
}