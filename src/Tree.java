public class Tree {
    Node root;

    public Tree(){
        root = null;
    }
    public void add(int index, double value){
        if(root!=null)
            root.insert(index, value);
        else root = new Node(index,value);
    }
    public double get(int index){
        return  root.get(index);
    }
    public void printFormated(){
        if(root!=null)
            root.printFormated(0);
        else System.out.println("Drzewo jest puste");
    }

}