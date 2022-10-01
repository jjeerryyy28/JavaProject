package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class PrintBinaryUsingQueue {
    public static void main(String[] args){
        Queue<String> q=new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n>0) {
            q.add("1");

            for (int i = 0; i <= n; i++) {
                String s = q.peek();
                System.out.print(s + " ");
                q.remove();
                q.add(s + "0");
                q.add(s + "1");
            }
        }//System.out.println();
        //System.out.print("Queue: "+q);
    }
}
