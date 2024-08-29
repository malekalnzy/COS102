public class ArrayOps {

    //find Max method
    public int findMax(int [] array ){
        int max = array[0];
        //ثابته في الماكس و الميني
        for (int i = 1; i < array.length; i++ ){


            if (array[i] > max){
                max = array[i];
            }

        }
        return max;

    }

    //find Min method
    public int findMin(int [] array){
        int min = array [0];

        //ثابته في الماكس و الميني
        for (int i = 1; i < array.length; i++){

            
            if (array[i] < min){
                min = array[i];
            }
        }
        return min;
    }

    //display All Max method
    public void displayAllMax(int [] array){
        int max = findMax(array);
        for (int i = 0; i < array.length; i++){
            if (max == array[i]){
                System.out.println("the index of maximum values: " + i);
            }
        }
    }
    //display all min method
    public void displayAllMin(int [] array){
        int min = findMin(array);
        for (int i = 0; i < array.length; i++){
            if (min == array[i]){
                System.out.println("the index of minimum values: " + i);
            }
        }
    }
    // calc avreg method
    public double calcAvg(int[] array){
        double sum = 0.0;
        for (int i = 0; i < array.length; i++){
            sum += array[i];
        }
        return sum / array.length;
    }

    public static void main(String[] args) {
       ArrayOps ops = new ArrayOps();
       int [] numbers = {7,3,2,8,9,5,4,6};
       //find Max
       int max = ops.findMax(numbers);
        System.out.println("Max of array: " + max);
       //find Min
       int min = ops.findMin(numbers);
        System.out.println("Min of array: " + min);
        //display all max
        ops.displayAllMax(numbers);
        //display all min
        ops.displayAllMin(numbers);
        //calc avg
        double avg = ops.calcAvg(numbers);
        System.out.println("the avreg: " + avg);


    }
}
