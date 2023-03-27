package org.example.swtch.feature;

public class Main {

    public static void main(String[] args) {

    }

    public static void oldImpl(AnimalType animalType) {
        switch (animalType) {
            case CAT:
                System.out.println("CAT");
                break;
            case DOG:
                System.out.println("DOG");
                break;
            case TIGER:
                System.out.println("TIGER");
                break;
            default:
                throw new IllegalArgumentException();
        }
    }

    public static int newImpl(AnimalType animalType) {
        return switch (animalType) {
            case CAT -> {
                System.out.println("CAT");
                yield  2;
            }
            case DOG -> {
                System.out.println("DOG");
                yield 3;
            }
            case TIGER -> {
                System.out.println("TIGER");
                yield 4;
            }
        };
    }
}