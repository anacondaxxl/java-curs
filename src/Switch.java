package src;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        int state = 0;

        if (state == 0) {
            System.out.println("descarcata");
            if (state == 1) {
                System.out.println("incarcata partial");
                if (state == 2) {

                    System.out.println("incarcata complet");
                } else {
                    System.out.println("eroare");
                }
            }
            switch (state) {
                case 0:
                    System.out.println("descarcata");
                    break;
                case 1:
                    System.out.println("incarcata partial");
                    break;
                case 2:
                    System.out.println("incarcata complet");
                    break;
                default:
                    System.out.println("eroare");
            }
        }
    }
    }