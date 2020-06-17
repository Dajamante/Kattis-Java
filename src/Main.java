import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Kattio in = new Kattio(System.in, System.out);

        while (in.hasMoreTokens()) {
            int vertices = in.getInt();
            int numbEdges = in.getInt();
            ArrayList<LinkedList<Integer>> nodes = new ArrayList<>();

            for (int i = 0; i < vertices; i++) {
                nodes.add(new LinkedList<>());
            }
            Graph graph = new Graph(nodes, vertices, numbEdges);

            for (int i = 0; i < numbEdges; i++) {
                int from = in.getInt();
                System.out.println("from " + from);

                int to = in.getInt();
                System.out.println("to "+ to);
                graph.incoming[to]++;
                graph.outgoing[from]++;
                nodes.get(from).add(to);

            }
            for(LinkedList<Integer> n: nodes){
                System.out.println(n);
            }
            for(int i=0 ; i <graph.incoming.length; i++){
                System.out.print("incoming in " + i + " ");
                System.out.println(graph.incoming[i]);
            }
            for(int i=0 ; i <graph.outgoing.length; i++){
                System.out.print("outgoing from " + i + " ");
                System.out.println(graph.outgoing[i]);
            }

            isAPathPossible(graph, graph.incoming, graph.outgoing);




        }

    }

    private static void isAPathPossible(Graph graph, int[] incoming, int[] outgoing) {
    }


    static class Graph{
        ArrayList<LinkedList<Integer>> nodes;
        int numbEdges;
        int vertices;
        int[] incoming;
        int[] outgoing;

        Graph(ArrayList<LinkedList<Integer>> nodes, int vertices, int numbEdges){
            this.nodes = nodes;
            this.vertices = vertices;
            this.numbEdges = numbEdges;
            this.incoming = new int[vertices];
            this.outgoing = new int[vertices];

        }
    }


}




