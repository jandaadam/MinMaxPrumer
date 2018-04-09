
package minmaxprumer;

import java.util.Scanner;

public class MinMaxPrumer {

    public static void main(String[] args) {
        //Definice vstupu (z klavesnice)
        Scanner sc = new Scanner(System.in, "CP1250");
        //ulozene min, max, prumer
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int pocet = 1, soucet = 0;
        //nekonecna smycka
        while (true) {
            System.out.print("vlož "+pocet+". číslo: ");
            //vstup od uzivatele (z klavesnice) do promenne vstup
            int vstup = sc.nextInt();
            //kdyz vlozi nulu, prerusime smycku (program)
            if (vstup == 0) break;
            soucet = soucet + vstup;
            //kdyz vlozene cislo je mensi, nez min, zapamatujeme ho
            if (vstup < min) min = vstup;
            if (vstup > max) max = vstup;
            System.out.println("nejmensi zatim vlozene: "+min);
            System.out.println("nejvetsi zatim vlozene: "+max);
            System.out.println("prumer: "+((float) soucet/pocet));            
            pocet++;
        }
    }
    
}
