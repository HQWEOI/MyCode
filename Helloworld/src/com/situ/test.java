package com.situ;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

public	class test {
	  public static void main(String[] args){
	    Scanner scanner = new Scanner(System.in);
	    int n = scanner.nextInt();
	    int l = scanner.nextInt();
	    int h = scanner.nextInt();
	    ArrayList<int[]> stu = new ArrayList<>();
	    for(int i=0;i<n;i++){
	      int tId = scanner.nextInt();
	      int tDe = scanner.nextInt();
	      int tCai = scanner.nextInt();
	      if(tDe>=l&&tCai>=l){
	        int sum = tDe+tCai;
	        int flag;
	        if(tDe>=h){
	          if(tCai>=h) flag = 1;
	          else flag = 2;
	        }else{
	          if(tDe>=tCai) flag = 3;
	          else flag = 4;
	        }
	        stu.add(new int[]{tId,tDe,tCai,sum,flag});
	      }
	    }
	    Collections.sort(stu,new CompareStu());
	    System.out.println(stu.size());
	    for(int i=0;i<stu.size();i++){
	      int[] s = stu.get(i);
	      System.out.println(s[0]+" "+s[1]+" "+s[2]);
	    }
	 
	  }
	}
	class CompareStu implements Comparator<int[]>{
	  public int compare(int[] s1,int[] s2){
	    if(s1[4]<s2[4]) return -1;
	    else if(s1[4]>s2[4]) return 1;
	    else{
	      if(s1[3]>s2[3]) return -1;
	      else if(s1[3]<s2[3]) return 1;
	      else{
	        if(s1[1]>s2[1]) return -1;
	        else if(s1[1]<s2[1]) return 1;
	        else{
	          if(s1[0]<s2[0]) return -1;
	          else if(s1[0]>s2[0]) return 1;
	          else return 0;
	        }
	      }
	    }
	  }
	}

