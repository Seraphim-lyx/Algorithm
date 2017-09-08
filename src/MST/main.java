package MST;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import MST.MST;

public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/* 
        2    3
     (0)--(1)--(2)
     |    / \   |
     6| 8/   \5 |7
     | /      \ |
     (3)-------(4)
          9          */
		  int graph[][] = new int[][] {
				  {0, 2, 0, 6, 0},
                  {2, 0, 3, 8, 5},
                  {0, 3, 0, 0, 7},
                  {6, 8, 0, 0, 9},
                  {0, 5, 7, 9, 0},
           };
		  MST mst = new MST(graph,graph.length);
		  mst.prim();
		  mst.kruskal(buildGraph());
		  
	} 
	
	public static List<Graph> buildGraph(){
		List<Graph> list = new LinkedList<Graph>();
		list.add(new Graph(0,1,2));
		list.add(new Graph(1,2,3));
		list.add(new Graph(1,4,5));
		list.add(new Graph(0,3,6));
		list.add(new Graph(2,4,7));
		list.add(new Graph(1,3,8));
		list.add(new Graph(3,4,9));
		return list;
	}

}
