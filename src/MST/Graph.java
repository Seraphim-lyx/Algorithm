package MST;

public class Graph {
	public int begin;
	public int end;
	public int weight;
	public Graph(int begin, int end, int weight){
		this.begin = begin;
		this.end = end;
		this.weight = weight;
	}
	
	public int getWeight(){
		return weight;
	}
	
	public int getBegin(){
		return begin;
	}
	
	public int getEnd(){
		return end;
	}
	
	public void print(){
		System.out.println("link is:"+begin+"-"+end+"&weight is:"+weight);
	}
	
}
