public class Matrix {
    Vector[] wektory;

    public Matrix(int rows){
        //inicjalizacja tablicy Vektorów
        wektory = new Vector[rows];
        for (int i = 0; i < rows ; i++) {
            wektory[i]= new Vector();
        }
    }
    public void insert(int row, int col, double val){
        wektory[row].insert(col,val);
    }
}
