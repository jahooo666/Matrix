public class Node {
    private int index;
    private double value;
    private Node left, right;

    public Node(int index, double value) {
        this.index = index;
        this.value = value;
        this.left = null;
        this.right = null;
    }

    public int getIndex() {
        return index;
    }

    public double getValue() {
        return value;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }



    public void print() {
        if (this.right != null)
            this.right.print();
        System.out.println(index + "-" + value);
        if (this.left != null)
            this.left.print();
    }

    public void printFormated(int level) {
        if (this.right != null)
            this.right.printFormated(level + 1);

        String spaces = "";
        for (int i = 0; i < level; i++)
            spaces = spaces + "  ";

        System.out.println(spaces + index + "-" + value);

        if (this.left != null)
            this.left.printFormated(level + 1);
    }

    public void insert(int index, double value) {
        if (this.index == index)
            this.value = value;
        else if (index < this.index) {
            if (this.left != null) {
                this.left.insert(index, value);
            } else this.left = new Node(index, value);
        } else if (index > this.index) {
            if (this.right != null) {
                this.right.insert(index, value);
            } else this.right = new Node(index, value);
        }
    }


    public double get(int index) {
        if (index == this.index) {
            return this.value;
        } else if (index < this.index) {
            if (this.left == null)
                return 0.0;
            else
                return this.left.get(index);
        } else if (index > this.index) {
            if (this.right == null)
                return 0.0;
            else
                return this.right.get(index);
        }
        return 0;
    }
}