public class Main {
    public static void main(String[] args){
        Node root = new Node(4,200.0);
        root.insert(1,300);
        root.insert(0,64);
        root.insert(3,640);
        root.insert(2,334);
        root.insert(7,520);
        root.insert(5,400);
        root.insert(6,600);

        root.printFormated(0);

        System.out.println("el 1:" + root.get(1));
        System.out.println("el 4:" + root.get(4));
        System.out.println("el 2:" + root.get(2));
        System.out.println("el 6:" + root.get(6));


    }
}
