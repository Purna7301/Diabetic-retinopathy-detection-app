import java.util.Scanner;

class MyClass{
   public static void main(String[] args)
   {
      Scanner sc=new Scanner(System.in);
      int n;
      n=sc.nextInt();
      if(n==10)
      {
         System.out.println("n is 10");
      }
      else if (n==20)
      {
         System.out.println("n is 20");
      }
      else{
         System.out.println("n is 30");
      }
   }
}