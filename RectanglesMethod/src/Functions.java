import static java.lang.Math.*;

/**
 * Created by danil on 04.10.2017.
 */
public class Functions {
    private static double func1(double x){
        return 1/log(x);
    }
    private static double func2(double x){
        return pow(2,cos(x))/exp(pow(x,-3));
    }
    private static double func3(double x){
        return -atan(sqrt(x));
    }
    private static double func4(double x){
        return sin(x)/x;
    }

    public static double calculate(int functionNumber, double x){
        switch(functionNumber){
            case 1:
                return func1(x);
            case 2:
                return func2(x);
            case 3:
                return func3(x);
            case 4:
                return func4(x);
            default:
                return 1;//заглушка
        }
    }
}
