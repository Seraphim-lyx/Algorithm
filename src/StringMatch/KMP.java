package StringMatch;

import java.util.Arrays;

public class KMP {
	private int next[]=new int[20];
	private String str;
	private String text;
	public KMP(String str, String text){
		this.str = str;
		this.text = text;
		Arrays.fill(next, 0);
	}
	
	public int[] Next(){
		next[1]=0;

		for(int p=1, k=0;p<str.length();p++){
			while(k>0&&(str.charAt(k)!=str.charAt(p))){
				k=next[k-1];
				
			}
			if(str.charAt(k)==str.charAt(p)){
				k++;
			}
			next[p]=k;
		}
		return next;
	}
	
	public void math(){
//		for(int a:next){
//			System.out.println(a);
//		}
		for(int i=0,q=0;i<text.length();i++){
			while(q>0&&str.charAt(q)!=text.charAt(i)){
				q=next[q-1];
			}
			if(str.charAt(q)==text.charAt(i)){
//				System.out.println(text.substring(i-q, i));
			
				q++;
			}
			if(q==str.length()){
				System.out.println(text.substring(i-q+1, i+1));
				break;
			}
		}
	}
}
		
		
		
