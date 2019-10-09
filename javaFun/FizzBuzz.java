public class FizzBuzz {
    
    public String fizzBuzz(int number) {
        // begin fizz buzz logic here 
        if(number %3 == 0 && number % 5 == 0){
            return "FizzBuzz"; 
        }
        else if (number %3 == 0 ){
            return "Fizz"; 
        }
        else if(number % 5 == 0){
            return "Buzz"; 
        }
        return String.valueOf(number);
    }
}