public class PuzzlesTest{
    public static void main(String[] args){
        Puzzles testData = new Puzzles(); 
        
        //  // // SUM AND GREATER THAN 10 // // // 

        // we have to declare our test array here first 
        int[] testArr = {3,5,1,2,7,9,8,13,25,32};
        testData.sumAndGreaterThan10(testArr); 

        // // //  SHUFFLE STRINGS // // // // 
        
        // declare your test list string first. 
        String[] testList = {"Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"};
        // pass the testList on this function. 
        testData.shuffleStrings(testList); 

        // // //  SHUFFLE ALPHABET  // // // // 
        testData.alphabet(); 
        
        // // //  RANDOM INT  // // // // 
        System.out.println(testData.sortTenRandomNums());





    }



}
