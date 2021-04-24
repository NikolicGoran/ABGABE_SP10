package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        //Einlesen der gewünschten Größe des Arrays vom Bediener
        System.out.print("Bitte geben Sie die gewünschte Größe für Ihr Array an: ");
        int arraySize = keyboard.nextInt();

        //Einlesen der maximal gewünschten Zufallszahl vom Bediener
        System.out.print("Bitte geben Sie die gewünschte größte Zahl an: ");
        int maxNumber = keyboard.nextInt();

        //Aufruf von GetValues
        int[] numbers = getValues(arraySize, maxNumber);

        //Ausgabe des Arrays auf der Konsole
        printArray(numbers);

        //Ermitteln des größten Wertes im Array (und Ausgabe auf die Konsole)
        System.out.println("Maximaler Wert ist " + getMaximum(numbers));

        //Ermitteln des Index des größten Wertes im Array (und Ausgabe auf die Konsole)
        int maxIndex = getMaximumIndex(numbers);
        System.out.println("Maximaler Index ist " + maxIndex);

        //Vertauschen des größten Wertes im Array mit dem ersten Wert im Array
        swap(numbers, 0, maxIndex);

        //neuerliche Ausgabe des Arrays auf der Konsole
        printArray(numbers);

        //Ermitteln des Index des größten Wertes im Array (und Ausgabe auf die Konsole)
        System.out.println("Maximaler Index ist " + getMaximumIndex(numbers));
    }

    // Erstellt ein Array mit den Gegeben parametern
    static int[] getValues(int arraySize, int maxNumber){
        int[] arr = new int[arraySize];

        for(int i=0; i<arr.length; i++){
            int radomNumber = (int)(Math.random() * maxNumber);
            arr[i] = radomNumber;
        }
        return arr;
    }

    //Gibt das Array in die Console aus
    static void printArray (int[] numbers){
        System.out.println(Arrays.toString(numbers));
    }

    //Findet die größte nummer im Array
    static int getMaximum (int[] numbers){
        int biggestNumber = 0;

        for(int i=0; i<numbers.length; i++){
            if (numbers[i] > biggestNumber){
                biggestNumber = numbers[i];
            }
        }
        return biggestNumber;
    }

    //Findet von der Größten Zahl den Index
    static int getMaximumIndex (int[] numbers){
        int biggestNumber = getMaximum(numbers);
        int index = 0;

        while (biggestNumber != numbers[index]){
            index++;
        }
        return index;
    }

    static void swap (int[] numbers, int index1, int index2){
        int firstNumber = numbers[index1];
        int biggestNumber = numbers[index2];

        numbers[index1] = biggestNumber;
        numbers[index2] = firstNumber;
    }
}

