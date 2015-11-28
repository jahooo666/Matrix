import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileMatrixReader {
    public FileMatrixReader() {
    }

    public ArrayList<Matrix> read() {
        ArrayList<Matrix> macierze = new ArrayList<>();
        try {
            Scanner odczyt = new Scanner(new File("dane.txt"));
            int length = 0;
            while (odczyt.hasNextLine()) {
                String naglowek = odczyt.nextLine();
                if (naglowek.matches("[A-Z]:")) {
                    //uzyskiwanie nazwy macierzy
                    String name = naglowek.split(":")[0];

                    //wczytywanie rozmiaru macierzy
                    System.out.printf("Początek wczytywania Macierzy %s\n", name );
                    int rows = odczyt.nextInt();
                    int cols = odczyt.nextInt();
                    Matrix matrix = new Matrix(rows,cols,name);

                    while(odczyt.hasNextInt()){
                        int row = odczyt.nextInt();
                        int col = odczyt.nextInt();
                        double val = odczyt.nextDouble();
                        matrix.insert(row,col,val);
                        System.out.printf("Wstawiam [%d][%d] : %f\n",row,col,val);
                    }
                    macierze.add(matrix);

                }
                //System.out.println("dodaje teraz: " + indexX + " " + indexY + " " + value);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Pliku nie znaleziono");
        }
        return macierze;
    }
}
