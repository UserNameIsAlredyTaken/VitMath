import static java.lang.Math.abs;

/**
 * Created by danil on 04.10.2017.
 */
public class Integral {
    public static boolean solve(int mode,int funcNumber, double firstLimit, double secondLimit, double accuracy, Result res){
        int multiplier;//inverses value of integral if a>b
        double start;//starting value x
        double h;//length from start to the end
        if(secondLimit-firstLimit>=0){
            multiplier = 1;
            h = secondLimit-firstLimit;
            start = firstLimit;
        }else{
            multiplier =-1;
            h = firstLimit-secondLimit;
            start = secondLimit;
        }

        int n=1;
        double Inow = 0;
        double Iprevious = 3*accuracy;
        switch(mode){
            case 1://right rectangles
                do{
                Iprevious = Inow;
                for(int i = 0; i<n; i++){
                    Inow+=Functions.calculate(funcNumber,start + h/n*i);
                }
                Inow *= h/n;
                n *= 2;
            }while(abs(Inow-Iprevious)/3<accuracy);
            case 2://left rectangles
                do{
                    Iprevious = Inow;
                    for(int i = 1; i<=n; i++){
                        Inow+=Functions.calculate(funcNumber,start + h/n*i);
                    }
                    Inow *= h/n;
                    n *= 2;
                }while(abs(Inow-Iprevious)/3<accuracy);
            case 3://midle rectangles
                do{
                    Iprevious = Inow;
                    for(int i = 0; i<n; i++){
                        Inow+=Functions.calculate(funcNumber,start + h/n*(i+0.5));
                    }
                    Inow *= h/n;
                    n *= 2;
                }while(abs(Inow-Iprevious)/3<accuracy);
        }
        res.I=Inow;
        res.delta=abs(Inow-Iprevious)/3;
        res.n = n;


        return true; //заглушка
    }
}
