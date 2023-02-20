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
        System.out.print("Keszitette: Fekete Gergely, I/1/N 2023 02 20\n ");
        Scanner myObj = new Scanner(System.in);  
        System.out.println("Add meg a paralepid A oldalat");

        double Aold = myObj.nextDouble();
        System.out.println("Add meg a paralepid B oldalat");

        double Bold = myObj.nextDouble();
        System.out.println("Add meg a paralepid C oldalat");

        double Cold = myObj.nextDouble();
        
        double terfogat = Aold*Bold*Cold;
    
        System.out.print(terfogat);

    }
}