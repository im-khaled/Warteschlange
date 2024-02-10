package com.company;

import java.util.Scanner;

public class Queue {

    private static int front = 0;
    private static int nextFree = 0;
    private static int[] arr;
    private static Scanner in;

    public void enqueue() {
        in = new Scanner(System.in);
        if (nextFree == 5) {
            System.out.println("Queue ist Voll");
        } else {

                System.out.printf("%nBitte Wert eingeben: ");
                int wert = in.nextInt();
                arr[nextFree] = wert;
                nextFree++;

        }


    }
    public void dequeue() {

        if ( nextFree==front) {
            System.out.printf("%nQueue:\t0\t0\t0\t0\t0");
        } else {
            for (int j = 0; j<nextFree; j++) {
                arr[j] = arr[j + 1];


            }
            nextFree--;

        }
    }
    public void display() {

        if (front == nextFree) {
            System.out.printf("%nQueue:\t0\t0\t0\t0\t0");
            System.out.printf("%nQueue ist Leer");
        } else {
            System.out.printf("%nQueue:");
            for (int i = front; i < arr.length; i++) {
                System.out.printf("\t%d", arr[i]);
            }
        }
    }
    public static void main(String[] args) {
        in = new Scanner(System.in);
        int b = 1;
        arr = new int[5];
        arr[0]=0;
        arr[1]=0;
        arr[2]=0;
        arr[3]=0;
        arr[4]=0;

        Queue queue = new Queue();
        queue.display();

       while (b==1) {
            System.out.printf("%n1- Enqueue%n");
            System.out.println("2- dequeue");
            System.out.println("3- Verlassen");
            System.out.printf("Bitte wählen Sie aus: ");
            int auswahl = in.nextInt();

            switch (auswahl) {
                case 1:
                    queue.enqueue();
                    queue.display();
                    break;
                case 2:
                    queue.dequeue();
                    queue.display();

                    break;
                case 3:
                    b = 0;
                    break;

            }
        }
        }
    }



