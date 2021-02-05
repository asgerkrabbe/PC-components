package com.kea;

import java.util.ArrayList;
import java.util.Scanner;

public class PCComponents {


    public static void main(String[] args) {
        ArrayList<String> componentsArray = new ArrayList<>();
        componentsArray.add("1. Motherboard");
        componentsArray.add("2. CPU");
        componentsArray.add("3. RAM");
        componentsArray.add("4. HDD");
        componentsArray.add("4. SSD");


        System.out.println("Vælg hvad du vil vide mere om:");
        for (int i = 0; i < componentsArray.size(); i++) {
            System.out.println(componentsArray.get(i));
        }

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice) {

            case 1: {
                System.out.println(motherboard());
            }
            case 2: {

            }
        }
    }


    public static String motherboard() {
        String motherBoardDescription = "Motherboard/bundkortet, kaldes rygraden/hjertet i computeren." +
                "Det er det komponent som kæder alt sammen." +
                "\nKomponenter såsom CPU, graffikkort og RAM er monteret på motherboardet som gør det muligt for dem at tale sammen.";
        return motherBoardDescription;
    }

    public static String cPU() {
        String cPUDescription = "CPU,Central Processing Unit";
        return cPUDescription;
    }


    public static void componentsArray() {


    }


}


