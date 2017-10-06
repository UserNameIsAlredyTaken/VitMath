/**
 * Created by danil on 04.10.2017.
 */
public class Result {
    public double I;
    public int n;
    public double delta;
    public void show(){
        System.out.println("The value of integral is: "+I);
        System.out.println("The number of iterations is: "+n);
        System.out.println("The error is: "+delta);
    }
}
