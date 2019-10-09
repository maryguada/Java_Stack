import java.util.Arrays;
import java.util.List;
import java.util.ArrayList; 
import java.util.Collections; 
import java.util.Random; 
import java.util.concurrent.ThreadLocalRandom; 

// Q#1 Create an array with the following values: 3,5,1,2,7,9,8,13,25,32. 
//Print the sum of all numbers in the array. 
//Also have the function return an array that only includes numbers that are greater than 10 (e.g. when you pass the array above, it should return an array with the values of 13,25,32)
public class Puzzles {
    public void sumAndGreaterThan10(int[] arr){
        // we need to initialize an array that can store this many values 
        // int [10] myArr = {} 
        // int [] myArr = {3,5,1,2,7,9,8,13,25,32}; 
        ArrayList<Integer> newArr = new ArrayList<Integer>();
        int sum = 0 ; 
        for (int i = 0; i < arr.length; i++){
            sum += arr[i]; 
            if (arr[i] > 10){
                newArr.add(arr[i]); 

            }
        }
        System.out.println(sum); 
        System.out.println(newArr); 
        
    }

    // Q#2  Create an array with the following values: Nancy, Jinichi, Fujibayashi, Momochi, Ishikawa. 
    // Shuffle the array and print the name of each person. 
    // Have the method also return an array with names that are longer than 5 characters.
    public void shuffleStrings(String[] arr){

        //declare a new list for shuffled names
        ArrayList<String> newList = new ArrayList<String>(); 

        //declare another list for any names > than 5. 
        ArrayList<String> newListFive = new ArrayList<String>();

        // for loop through list 
        for (int i = 0; i<arr.length; i++){
            // if > 5 , then appeand to  newListFive 
            if(arr[i].length() > 5){
                newListFive.add(arr[i]);
            }
            // add all the names to the list 
            newList.add(arr[i]); 
        }
        // shuffle the newList . collections.shuffle(listname) will shuffle the
        // list for us 
        Collections.shuffle(newList);
        //print out both lists 
        System.out.println(newList); 
        System.out.println(newListFive); 
    }


    // Q #3  Create an array that contains all 26 letters of the alphabet 
    //(this array must have 26 values). Shuffle the array and, 
    // after shuffling, display the last letter from the array.
    // Have it also display the first letter of the array. If the first letter in the array is a vowel, have it display a message.
    public void alphabet(){
        String[] alphabet = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        Collections.shuffle(Arrays.asList(alphabet)); 
        String first = alphabet[0];
        System.out.println("The first letter is " + first ); 
        String last = alphabet[25]; 
        System.out.println("The first letter is " + last); 
        if( first == "a" || first == "e" || first == "i" || first == "o" || first == "u" ); 
        System.out.println("The first letter is a vowel! "); 
                
    }

    // Q#4 Generate and return an array with 10 random numbers between 
    //55-100. 

    public static ArrayList sortTenRandomNums() {
        ArrayList<Integer> intArr = new ArrayList<Integer>();
        int min = 100; 
        int max = 55; 
        for (int i = 1; i<=10; i++){
            int newNum = ThreadLocalRandom.current().nextInt(55, 100); 
            intArr.add(newNum); 
            if (newNum < min){
                min = newNum; 
            
            }
            else if (newNum > max){
                max = newNum; 
            }
        }
        Collections.sort(intArr); 
        System.out.println("Minimum" + min); 
        System.out.println("Maximum" + max); 
        return intArr; 
        
    }

    // Q# 5 Create a random string that is 5 characters long.
    
    


    // Q#6 Generate an array with 10 random strings that are each 5 char long 

}






