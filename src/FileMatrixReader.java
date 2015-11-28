import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileMatrixReader {
    public FileMatrixReader() {
    }

    public Matrix read() {
        try {
            Scanner odczyt = new Scanner(new File("dane.txt"));
            int length = 0;
            while (odczyt.hasNextLine()) {
                if (odczyt.nextLine().matches("[A-Z]:"))
                    System.out.println("Mamy A");
                //System.out.println("dodaje teraz: " + indexX + " " + indexY + " " + value);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Pliku nie znaleziono");
        }
        return new Matrix(10);
    }
}
