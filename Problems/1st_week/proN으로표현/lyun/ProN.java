import java.util.*;

class Solution {
    public int solution(int N, int number) {
        int answer = 0;
        
        boolean isEnd = false;
        int count = 3;
        
        //반복, +n, -n, *n , /n
        List<Integer> curList = new ArrayList<Integer>();
        List<Integer> memoList = new ArrayList<Integer>();
        
        if(number==N){
            return 1;
        }
        memoList.add(N*10+N);
        memoList.add(N+N);
        memoList.add(N-N);
        memoList.add(N*N);
        memoList.add(N/N);
        
        for(int i : memoList){
            if(number == i){
                return 2;
            }
        }
        
        
        while(isEnd == false){
            int firstNum = 0;
            
            if(count > 8){
                return -1;
            }
            
            for(int i = 0; i<count; i++){
                firstNum += Math.pow(10,i)*N;
            }
            
            curList.add(firstNum);
            
            for(int pl : memoList) curList.add(pl+N);
            
            for(int mi : memoList) curList.add(mi-N);
            
            for(int mul : memoList) if(mul!=0) curList.add(mul*N);
            
            for(int div : memoList) if(div!=0) curList.add(div/N);
            
            memoList.clear();
            
            for(int i : curList){
                memoList.add(i);
                
                if(i==number){
                    return count;
                }
            }
            
            curList.clear();
            
            count++;
            
            
        }
        
        answer = count;
        
        return answer;
    }
}