
public class Basics{
// // // // // // // // // // PRINT NUMS 1 - 255
    public void print1To255(){
        for (int i = 0; i < 256; i++){
            System.out.println(i);
            
        }
    }
}

// // // // // // // // // // PRINT ODD NUMS BETWEEN 1 - 255 

    public void printOdd1To255(){
        for (int i = 0; i < 256; i++){
            if (i % 2 != 0); 
                System.out.println(i);

    }
}

        

// // // // // // // // // // PRINT SUM OF NUMS 0 - 255 
    public void printSum1To255(){
        int Sum = 0;
        for (int i = 0; i < 256; i++){
            Sum += i;
            System.out.println(Sum); 

        }
    }


// // // // // // // // / // ITERATING THROUGH AN ARRAY 
    public void iterateArray(int[] arr){
        for (int i = 0; i<arr.length; i++){
            System.out.println("New Number: " + i + "Sum :" + total); 
        }
    }

// // // // // // // // / // FIND MAX 
    public void findMax(int[] arr){
        int max = arr[0]; 
        for (int i = 0; i<arr.lengh; i++){
            if(arr[i] > max){
                max = arr[i]; 
            }
        }
        system.out
    }