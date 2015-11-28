import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        FileMatrixReader reader = new FileMatrixReader();
        reader.read();

        /*
        Vector wektor = new Vector();
        try {
            Scanner odczyt = new Scanner(new File("dane.txt"));
            while(odczyt.hasNextInt()){
                int index = odczyt.nextInt();
                double value = odczyt.nextDouble();
                wektor.insert(index,value);
                //  System.out.println("dodaje teraz: " + index + " " + value);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Pliku nie znaleziono");
        }
        wektor.printFormated();
        */

      /*  System.out.println("Element numer 1 ma wartość:" + wektor.get(1));
        System.out.println("Element numer 4 ma wartośc:" + wektor.get(4));
        System.out.println("Element numer 2 ma wartość:" + wektor.get(2));
        System.out.println("Element numer 6 ma wartość:" + wektor.get(6));
       */

    }
}