package MST;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {
	int graph[][];

	public BFS(int[][] graph) {
		// TODO Auto-generated constructor stub
		this.graph = graph;
	}

	public static void main(String[] args) throws InterruptedException {
		int graph[][] = new int[][] { 
				{ 0, 1, 1, 0, 0, 0, 0, 0 },
				{ 1, 0, 0, 1, 1, 0, 0, 0 },
				{ 1, 0, 0, 0, 0, 1, 1, 0 },
				{ 0, 1, 0, 0, 0, 0, 0, 1 }, 
				{ 0, 1, 0, 0, 0, 0, 0, 1 },
				{ 0, 0, 1, 0, 0, 0, 1, 0 }, 
				{ 0, 0, 1, 0, 0, 1, 0, 0 },
				{ 0, 0, 0, 1, 1, 0, 0, 0 } };
		// Queue<Integer> q = new LinkedList<Integer>();
		// q.add(3);
		String c = "a";
		Integer a  = new Integer(1);
		// System.out.println(q.size());
		BFS bfs = new BFS(graph);
//		bfs.search(1);
	}

	public void search(int num) throws InterruptedException {

		Boolean[] v = new Boolean[graph.length];
		for (int i = 0; i < v.length; i++) {
			v[i] = false;
		}
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(num);
		v[num] = true;
		while (q.size() > 0) {
			int flag = q.poll();
//			System.out.println("poll"+flag);
//			Thread.sleep(3000);
//			v[flag] = true;
			for (int i = 0; i < graph[flag].length; i++) {
				int adj = graph[flag][i];
//				System.out.println(adj);
				if (adj > 0 && !v[i]) {
//					System.out.println("add"+i);
					q.add(i);
					v[i] = true;
				}
			}
			System.out.println(flag+1 + "->");
		}

	}
}
