public class Vector {
    Tree drzewo;

    public Vector(){
        this.drzewo = new Tree();
    }

    public void insert(int index, double value){
        drzewo.add(index, value);
    }
    public double get(int index){
        return drzewo.get(index);

    }
    public void printFormated(){
        drzewo.printFormated();
    }

}
