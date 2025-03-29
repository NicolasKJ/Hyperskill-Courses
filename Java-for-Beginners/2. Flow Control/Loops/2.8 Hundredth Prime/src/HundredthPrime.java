public class HundredthPrime {
   public static void main(String[] args) {
      int count = 0;
      int currentNumber = 2;

      while (count < 100) {
         boolean isPrime = true;

         for (int divisor = 2; divisor <= Math.sqrt(currentNumber); divisor++) {
            if (currentNumber % divisor == 0) {
               isPrime = false;
               break;
            }
         }

         if (isPrime) {
            count++;
         }

         currentNumber++;
      }

      System.out.println(currentNumber - 1);
   }
}