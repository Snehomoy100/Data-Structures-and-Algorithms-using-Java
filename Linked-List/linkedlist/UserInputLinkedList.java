package linkedlist;

import java.util.Scanner;

public class UserInputLinkedList {

    // taking user input as the elements of Linked List

    public static void printLinkedlist(Node<Integer> head) {
        Node<Integer> temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static Node<Integer> takeInput(){
        Scanner input = new Scanner(System.in);
        int data = input.nextInt();
        Node<Integer> head = null;
        while(data != -1){
            Node<Integer> currentNode = new Node<Integer>(data);
            if(head == null){
                head = currentNode;
            } else{
                Node<Integer> tail = head;
                while(tail.next != null){
                    tail = tail.next;
                }
                tail.next = currentNode; 
            }
            data = input.nextInt();           
        }
        return head;
    }

    public static void main(String[] args) {
        Node<Integer> head = takeInput();
        printLinkedlist(head);
    }
}
