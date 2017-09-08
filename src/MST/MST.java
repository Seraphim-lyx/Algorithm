package MST;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MST {
	/* 
    2    3
 (0)--(1)--(2)  
 |    / \   |
 6| 8/   \5 |7
 | /      \ |
 (3)-------(4)
      9          
      
  				  {0, 2, 0, 6, 0},
                  {2, 0, 3, 8, 5},
                  {0, 3, 0, 0, 7},
                  {6, 8, 0, 0, 9},
                  {0, 5, 7, 9, 0},
      */
	private int graph[][];
	private int vt;
	private List<Integer> orgList = new LinkedList<Integer>();//non-mst Node
	private List<Integer> mstList = new LinkedList<Integer>();//mst Node
	public MST(int graph[][],int vt){
		this.graph = graph;
		this.vt = vt;
		for(int i=1;i<vt;i++){
			orgList.add(i);
		}
		mstList.add(0);
	}
	public void prim(){
		
		
		int bPos=0;
		int ePos=0;
		int rNum=0;//list index that needs to be removed from orgList
		while(orgList.size()>0){
			int min=10000000;
			for(int j:mstList){
				int a[]=graph[j];//array from mst Node
				for(int i=0;i<orgList.size();i++){
					int p=orgList.get(i); //array to non-mst Node
					if(a[p]!=0&&a[p]<min){
						
						min=a[p]; //minimun weight edge
						bPos=j;
						ePos=p;
						rNum=i;
					}
				}
			}
			
			orgList.remove(rNum);
			mstList.add(ePos);
			System.out.println("link is:"+bPos+"-"+ePos+"&weight is:"+graph[bPos][ePos]);
		}
		
	}
	
	public void kruskal(List<Graph> list){
		List<Integer> mstList = new ArrayList<Integer>();

		for(Graph g:list){
			if(!(mstList.contains(g.begin)&&mstList.contains(g.end))){
				g.print();
				if(!mstList.contains(g.begin)){
					mstList.add(g.begin);
				}
				if(!mstList.contains(g.end)){
					mstList.add(g.end);
				}
			}
			
		}
	}
	
}
