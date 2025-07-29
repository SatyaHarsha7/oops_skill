// Java program to check whether given is even or odd
package skill;
 import java.util.Scanner;
public class evenodd {
 public static void main(String args[]) {
  Scanner scanner = new Scanner(System.in);
  int a=scanner.nextInt();
  if(a%2==0) {
   System.out.println("Even Number");
  }
  else {
   System.out.println("Odd Number");
  }
 }

}