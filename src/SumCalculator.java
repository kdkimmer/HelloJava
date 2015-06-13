/**
 * Created by kim on 6/13/2015.
 */
public class SumCalculator {

    public static void main(String[]myArgs){
        int sum = 0;
        for(int i =0; i < myArgs.length; i++){
            sum += Integer.parseInt(myArgs[i]);
            }
        System.out.println("Sum = " + sum);
    }

}
