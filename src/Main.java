import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            FileMatrixReader reader = new FileMatrixReader();

            ArrayList<Matrix> macierze = reader.read("mnozenie.txt");
            for (Matrix matrix : macierze) {
                matrix.draw();
            }
            macierze.get(0).add(macierze.get(1)).draw();
            macierze.get(0).multiply(macierze.get(1)).draw();
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}