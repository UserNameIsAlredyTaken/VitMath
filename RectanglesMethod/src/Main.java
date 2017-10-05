/**
 * Created by danil on 04.10.2017.
 */
public class Main {
    public static void main(String[] args){
        Result res = new Result();
        Values.getValues();
        if(Integral.solve(Values.mode,Values.functionNumber, Values.firstLimit, Values.secondLimit, Values.accuracy, res)){
            //Result.show();
        }else{
            System.out.println("Incomputable integral");
        }
    }
}
