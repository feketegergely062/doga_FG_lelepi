/*
* File: App.java
* Author: Fekete Gergely
* Copyright: 2023, Fekete Gergely
* Group: Szoft 1 N
* Date: 2023-02-20
* Github: https://github.com/feketegergely062/
* Licenc: GNU GPL
*/

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Feladat: 0358");
        System.out.print("Keszitette: Fekete Gergely, I/1/N 2023-02-20\n ");
        Scanner amugy = new Scanner(System.in);  
        System.out.println("Add meg a paralepid A oldalat");

        double Aold = amugy.nextDouble();
        System.out.println("Add meg a paralepid B oldalat");

        double Bold = amugy.nextDouble();
        System.out.println("Add meg a paralepid C oldalat");

        double Cold = amugy.nextDouble();
        System.out.println("Az értéke: ");
        
        double terfogat = Aold*Bold*Cold;
    
        System.out.print(terfogat);

    }
}