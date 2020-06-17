import java.util.*;

public class Main {

    public static void main(String[] args) {


        Kattio in = new Kattio(System.in, System.out);

        while (in.hasMoreTokens()){
            int numbVertices = in.getInt();
            int numTransitions = in.getInt();

            Graph graphie = new Graph();

            for (int i = 0; i < numTransitions ; i++) {
                int from = in.getInt();
                int to = in.getInt();
                Graph.Node nFrom = graphie.new Node(from);
                Graph.Node nTo = graphie.new Node(to);
                Graph.Edge e = graphie.new Edge(from, to);
                nFrom.edgies.add(e);

                if (!graphie.nodies.contains(nFrom.id)) graphie.nodies.add(nFrom);
                if (!graphie.nodies.contains(nTo.id)) graphie.nodies.add(nTo);


            }

            for (Graph.Node n: graphie.nodies) {
                System.out.print(n.id + " ");
            }
            System.out.println();
        }
        in.close();


    }

}


class Graph {
    ArrayList<Node> nodies;

    Graph() {
        this.nodies = new ArrayList<Node>();
    }

    class Node {
        int id;
        ArrayList<Edge> edgies;

        Node(int id) {
            this.edgies = new ArrayList<>();
            this.id = id;
        }

    }

    class Edge {
        // members
        int from;
        int to;

        // constructor to transition
        Edge(int from, int to) {
            this.from = from;
            this.to = to;
        }

    }
}
