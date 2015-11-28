import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        FileMatrixReader reader = new FileMatrixReader();
        ArrayList<Matrix> macierze = reader.read();
        for (Matrix matrix: macierze) {
            matrix.draw();
        }
        macierze.get(0).add(macierze.get(1));

    }
}