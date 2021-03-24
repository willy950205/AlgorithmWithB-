import java.util.*;

class Solution {
    public int solution(int n, int[][] edge) {
        int answer = 0;
        
        int count = 0;
        
        Queue<Integer> q = new LinkedList<Integer>();
        int[] visited = new int[n+1];
        
        for(int i=0; i<visited.length; i++){
            visited[i] = -1;
        }
        
        q.add(1);
        visited[1] = 0;
        
        //bfs
        while(q.peek()!=null){
            int current = q.poll();
            
            count = visited[current]+1;
            for(int[] arr : edge){
                if(arr[0]==current&&visited[arr[1]]==-1){
                    q.add(arr[1]);
                    visited[arr[1]] = count;
                }

                else if(arr[1]==current&&visited[arr[0]]==-1){
                    q.add(arr[0]);
                    visited[arr[0]] = count;
                }
            }
            
        }    
        
        //get count
        for(int i =0; i<visited.length; i++){
            if(visited[i] == count-1){
                
                answer ++;
            }
        }
        
        
        
        
        return answer;
    }
    
}