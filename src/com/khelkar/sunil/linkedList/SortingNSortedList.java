
import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class SortingNSortedList {

    public static void main(String[] args) {

        Node n1= new Node(1);
        n1.next = new Node(4);
        n1.next.next = new Node(7);

        Node n2= new Node(2);
        n2.next = new Node(5);
        n2.next.next = new Node(8);

        Node n3= new Node(30);
        n3.next = new Node(60);
        n3.next.next = new Node(90);

        ArrayList<Node> nodes = new ArrayList<>();
        nodes.add(n1);
        nodes.add(n2);
        nodes.add(n3);

        sortList(nodes);
    }

    private static void sortList(ArrayList<Node> nodes) {

        Queue<Node> q = new PriorityQueue<>(Comparator.comparing(x-> x.data));
        int length = nodes.size();

        for (int i=0; i < nodes.size(); i++) {
            q.add(nodes.get(i));
        }

        while (q.size() >0) {
            Node curr = q.poll();
            System.out.println(curr.data);
            if (curr.next != null)
                q.add(curr.next);
        }

    }

}

class Node {

    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
    }

}
