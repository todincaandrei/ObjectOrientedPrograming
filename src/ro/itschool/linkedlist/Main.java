package ro.itschool.linkedlist;

public class Main {
    public static void main(String[] args) {
        Node node = new Node();
        node.setName("Gabi");

        Node node2 = new Node();
        node2.setName("Alex");

        Node node3 = new Node();
        node2.setName("Mihai");

        node2.setNode(node3);

        node.setNode(node2);
        node.getNode().getName();

        node.getNode().getNode();




    }
}
