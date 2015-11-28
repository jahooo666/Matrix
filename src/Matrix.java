public class Matrix {
    Vector[] wektory;
    String name;
    int rows;

    public int getCols() {
        return cols;
    }

    public int getRows() {
        return rows;
    }

    int cols;

    public Matrix(int rows, int cols, String name) {
        this.name = name;
        wektory = new Vector[rows];
        this.rows = rows;
        this.cols = cols;
        //inicjalizacja tablicy Vektorów
        for (int i = 0; i < rows; i++){
            wektory[i] = new Vector();
        }
    }

    public void insert(int row, int col, double val) {
        wektory[row].insert(col, val);
    }


    public Matrix add(Matrix matrix) {
        int r, c;
        int ar = this.rows;
        int ac = this.cols;
        int br = matrix.getRows();
        int bc = matrix.getCols();
        // ustalanie wielkości tablicy wynikowej
        if (ar > br) {
            r = ar;
        } else {
            r = br;
        }
        if (ac > bc){
            c = ac;
        } else {
            c = bc;
        }
        Matrix nowy = new Matrix(r, c, "Suma");
        double sum = 0.0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++){
                    if(i<ar) {
                        if (i < br){
                            if(j<ac){
                                if(j<bc){
                                    sum = this.get(i,j)+matrix.get(i,j);
                                }else sum = this.get(i,j);
                            }else sum = matrix.get(i,j);
                        }else sum =this.get(i,j);
                    }else sum = matrix.get(i,j);

                    nowy.insert(i,j,sum);
                    //double sum = this.get(i,j)+matrix.get(i,j);
                    //nowy.insert(i,j,sum);
            }
        }
        return nowy;
    }


    public Matrix multiply(Matrix matrix) throws Exception {
        int r, c;
        int ar = this.rows;
        int ac = this.cols;
        int br = matrix.getRows();
        int bc = matrix.getCols();

        //warunek niezbędny do mnozenia macierzy
        if(ac==br){
            r = ar;
            c = bc;
            int width = ac;
            Matrix nowy = new Matrix(r, c, "Iloczyn");

            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++){
                    double outcome = 0.0;
                    for (int k = 0; k < width; k++) {
                        outcome += this.get(i,k) + matrix.get(k,j);
                    }
                    nowy.insert(i,j,outcome);
                    //double sum = this.get(i,j)+matrix.get(i,j);
                    //nowy.insert(i,j,sum);
                }
            }



            return nowy;

        }else
            throw new Exception("Niepoprawny wymiary macierzy");
    }

    public void draw() {
        System.out.printf("Macierz %s\n",this.name);
        for (int i = 0; i < this.rows; i++) {
            System.out.printf("%2d[ ",i);
            for (int j = 0; j < this.cols; j++){
                if(this.get(i,j)==0.0)
                    System.out.printf("     - ");
                else
                    System.out.printf("%2.1f - ",this.get(i,j));
            }
            System.out.printf("]\n");
        }
    }

    public double get(int row, int col){
        return this.wektory[row].get(col);
    }
}
