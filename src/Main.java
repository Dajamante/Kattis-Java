import java.util.*;

public class Main {

    public static void main(String[] args) {

        Kattio in = new Kattio(System.in, System.out);
        //ArrayList<ArrayList<LinkedList<Integer>>> allGraphs = new ArrayList<>();
        ArrayList<LinkedList<Integer>> smallGraph = new ArrayList<>();
        int[] incoming;
        int[] outgoing;


        while (in.hasMoreTokens()) {
            int numbVertices = in.getInt();
            int numTransitions = in.getInt();

            incoming = new int[numTransitions];
            outgoing = new int[numTransitions];


            for (int i = 0; i < numbVertices; i++) {
                smallGraph.add(new LinkedList<>());
            }
            for (int i = 0; i < numTransitions; i++) {
                smallGraph.get(in.getInt()).add(in.getInt());
            }
            System.out.println();
            System.out.println(smallGraph);
            //allGraphs.add(smallGraph);

            countIncomingOutgoingEdges(smallGraph, incoming, outgoing);

            for (int i = 0; i < incoming.length; i++) {
                System.out.println("incoming in " + i + " " + incoming[i]);

            }
            for (int i = 0; i < outgoing.length; i++) {
                System.out.println("outgoing from " + i +" "+ outgoing[i]);

            }


            for (int at = 0; at < smallGraph.size(); at++) {
                if(incoming[at]-outgoing[at]>0) System.out.println("bigger than");
                if(incoming[at]-outgoing[at]<0) System.out.println("smaller than");


            }

        }






    }

    private static void countIncomingOutgoingEdges(ArrayList<LinkedList<Integer>> smallGraph, int[] incoming, int[] outgoing) {
        for (int from = 0; from < smallGraph.size(); from++) {
            for (int to : smallGraph.get(from)) {
                incoming[to]++;
                outgoing[from]++;
            }
        }

    }


    static class Graph{



    }


}


