public class FizzBuzz {

    public static void main(String[] args){
         for (int i = 1;i <= 100;i++){

             String output ="";
             output = new Integer(i).toString();

             if (i % 3 == 0 && i % 5 == 0){
                 output = "FizzBuzz";
             }else if (i % 3 == 0){
                 output = "Fizz";
             }else if (i % 5 == 0){
                 output = "Buzz";
             }

             System.out.println(output);

         }
    }
}
