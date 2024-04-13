package com.leetcode.April;

import java.util.ArrayList;
import java.util.List;

//Problem Link: https://leetcode.com/problems/restore-ip-addresses/description/
//O(n^3) O(1)
public class RestoreIPAddress {
	class Solution {
		public List<String> restoreIpAddresses(String s) {
			List<String> res = new ArrayList<>();
			int totalLen = s.length();
			StringBuilder ip = new StringBuilder();
			for (int i = 1; i <= 3; i++) {
				for (int j = 1; j <= 3; j++) {
					for (int k = 1; k <= 3; k++) {
						int rem = totalLen - i - j - k;

						if (rem > 0 && rem <= 3) {
							int A = Integer.parseInt(s.substring(0, i));
							int B = Integer.parseInt(s.substring(i, i + j));
							int C = Integer.parseInt(s.substring(i + j, i + j + k));
							int D = Integer.parseInt(s.substring(i + j + k));

							if (A <= 255 && B <= 255 && C <= 255 && D <= 255) {
								ip.append(A).append(".").append(B).append(".").append(C).append(".").append(D);
							}

							if (ip.length() == totalLen + 3)
								res.add(ip.toString());

							ip = new StringBuilder();
						}
					}
				}
			}
			return res;
		}
	}
	
	//2 more ways to solve it
	class Solution {
	    List<String> res;
	    int[] arr;
	    int arridx;
	    public List<String> restoreIpAddresses(String s) {
	        this.res = new ArrayList<>();
	        if(s.length()>12)
	            return res;
	        // helper(s, 0, 0, "");
	        backtrack(s, 0, new ArrayList<>());
	        return res;
	    }
	    private void backtrack(String s, int idx, List<String> li){
	        if(idx==s.length() && li.size()==4){
	            String resString=li.get(0)+"."+li.get(1)+"."+li.get(2)+"."+li.get(3);
	            res.add(resString);
	            return;
	        }
	        StringBuilder sb=new StringBuilder();
	        for(int j=idx;j<s.length() && li.size()<4;j++){
	            sb.append(s.charAt(j));
	            int val=Integer.parseInt(sb.toString());
	            if(val>=0 && val<=255){
	                li.add(sb.toString());
	                backtrack(s, j+1, li);
	                li.remove(li.size()-1);
	            }
	            if(val<=0 || val>255)
	                break;
	        }
	    }
	    // private void helper(String s, int idx, int dots, String curIp){
	    //     if(dots==4 && idx==s.length()){
	    //         res.add(curIp.substring(0,curIp.length()-1));
	    //         return;
	    //     }
	    //     if(dots>4)
	    //         return;
	    //     int bound=Math.min(idx+3, s.length());
	    //     for(int i=idx;i<bound;i++){
	    //         if(Integer.parseInt(s.substring(idx, i+1))<=255 && (idx==i || s.charAt(idx)!='0')){
	    //             helper(s, i+1, dots+1, curIp+s.substring(idx, i+1)+".");
	    //         }
	    //     }

	    // }
	}
}
