import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    public static void main(String args[]){
        int n,n1;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        String[] s=new String[n];
        for(int i=0;i<n;i++){
           sc.nextLine();
           s[i]=sc.next();
    }
    n1=sc.nextInt();
    String []s1=new String[n1];
    for(int j=0;j<n1;j++){
        sc.nextLine();
        s1[j]=sc.next();
    }
    for(int i=0;i<n1;i++){
        int c=0;
        for(int j=0;j<n;j++){
            if(s[j].equals(s1[i]))
            c++;
        }
        System.out.println(c);
    }

    }
    }
