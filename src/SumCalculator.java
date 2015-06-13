/**
 * Created by kim on 6/13/2015.
 * my first commit
 */
public class SumCalculator {

    public static void main(String[]myArgs){
        //this is a default value
        int sum = 0;
        //here is the logic for summing
        for(int i =0; i < myArgs.length; i++){
            sum += Integer.parseInt(myArgs[i]);
            }
        System.out.println("Sum = " + sum);
    }

}
