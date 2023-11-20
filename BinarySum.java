//WAP to calculate and return the sum of the digits after converting it to its binary representation

public class BinarySum {
   public static int IntToBinarySum(int num)
    {
        int b = 0;
         while(num > 0)
      {
          int rem = num % 2;
          b = b + rem;
          num = num / 2;
      }
      return b;
        
    }
    public static void main(String args[]) {
     
      System.out.println(IntToBinarySum(15));
     
}
}
