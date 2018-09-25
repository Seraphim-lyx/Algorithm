package MST;

public class DFS {
	int graph[][];
	Boolean[] visit;
	boolean next = true;
	
	/**
	 * @param graph
	 */
	public DFS(int graph[][]) {
		// TODO Auto-generated constructor stub
		this.graph = graph;
		visit = new Boolean[graph.length];
		for(int i = 0; i < visit.length; i++){
			visit[i] = false;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int graph[][] = new int[][] { 
				{ 0, 1, 1, 0, 0, 0, 0, 0 },
				{ 1, 0, 0, 1, 1, 0, 0, 0 },
				{ 1, 0, 0, 0, 0, 1, 1, 0 },
				{ 0, 1, 0, 0, 0, 0, 0, 1 }, 
				{ 0, 1, 0, 0, 0, 0, 0, 1 },
				{ 0, 0, 1, 0, 0, 0, 1, 0 }, 
				{ 0, 0, 1, 0, 0, 1, 0, 0 },
				{ 0, 0, 0, 1, 1, 0, 0, 0 } };
		DFS dfs = new DFS(graph);
		dfs.search(0);
	}
	
	/**
	 * @param num
	 */
	public void search(int num){
		
		
			visit[num] = true;
			System.out.println(num+1 + "->");
			for(int i = 0;i<graph[num].length;i++){
				if(graph[num][i]>0 && !visit[i]){
					search(i);
				}
			}
		
	}

}
