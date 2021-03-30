package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon1699DP2  {
	public static void main(String args []) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int dp[]= new int [N+1];
		
		for(int i=1; i<=N; i++) {
			dp[i]=i;
			int answer = Integer.MAX_VALUE;
			for(int j=1; j*j<=i; j++) {
				int result =i/(j*j);
				int temp = i%(j*j);
				answer = Integer.min(answer, result+dp[temp]);
			}
			dp[i] = answer;
		}
		
		System.out.println(dp[N]);

	}
}
