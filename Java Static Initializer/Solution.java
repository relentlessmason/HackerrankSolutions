import java.io.*;
import java.util.*;


public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
int B = scanner.nextInt();
int H = scanner.nextInt();
boolean flag = true;
scanner.close();

if (H<=0 || B<=0) {
    flag = false;} 
    
if (flag){
            int area = B*H;
            System.out.println(area);}
else {      
    System.out.println("java.lang.Exception: Breadth and height must be positive");}

        }
}
