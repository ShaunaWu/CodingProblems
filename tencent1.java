import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Main {
	
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x,y;       
        boolean flag = true;
        String[] result = new String[n];
        for(int i = 0; i < n; i++){
        	flag = true;
        	ArrayList<Integer> xAxis = new ArrayList<>();
            ArrayList<Integer> yAxis = new ArrayList<>();
            for(int j = 0; j < 4; j++){
                x = sc.nextInt();
                xAxis.add(x);
            }
            for(int j = 0; j < 4; j++){
            	y = sc.nextInt();
            	yAxis.add(y);
            }
            HashMap<Integer, Integer> map = new HashMap<>();
            for(int j = 0; j < 4; j++){            	
            	for(int k = j+1; k < 4; k++){
            		int a = (xAxis.get(j) - xAxis.get(k))*(xAxis.get(j) - xAxis.get(k))+
            				(yAxis.get(j) - yAxis.get(k))*(yAxis.get(j) - yAxis.get(k));
            		if(map.containsKey(a)){
            			map.put(a, map.remove(a)+1);  
            		}else
            			map.put(a, 1);
            		if(map.size()>2){
            			result[i]="No";
            			flag = false;
            			break;
            		}            			
            	}
            	if(!flag)
            		break;
            }
            if(!flag)
            	break;
            Set<Integer> keys = map.keySet() ;// 得到全部的key
            Iterator<Integer> iter = keys.iterator() ;
            int a = 0,b =0;
            while(iter.hasNext()){
            	a = iter.next() ; 
            	b = iter.next();
            }           
            if(a == b * 2 || b == a * 2){
            	result[i]="Yes";
            }else{
            	result[i]="No";
            }            
        }    
        for(String string : result){
        	System.out.println(string);
        }
    }	
}
