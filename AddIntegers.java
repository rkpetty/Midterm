public class AddIntegers {

    public static void main(String[] args) {

        int sum = AddInteger();

        System.out.println("The sum is: " + sum);
    }

    public int AddInteger(){
      int first = 20;
      int second = 30;

      System.out.println("Enter two numbers: " + first + " " + second);
      int sum = first + second;
      return sum;
    }
}
