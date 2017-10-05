import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by danil on 04.10.2017.
 */
public class Values{
    public static int functionNumber;
    public static double firstLimit;
    public static double secondLimit;
    public static double accuracy;
    public static  int mode;

    public static void getValues(){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String option;
        boolean optionIsReceived = false;
        while(!optionIsReceived){
            System.out.println("Choose one of 4 functions(1,2,3,4): ");
            try{
                option = reader.readLine();
                switch(option){
                    case "1":
                        functionNumber = 1;
                        optionIsReceived = true;
                        break;
                    case "2":
                        functionNumber = 2;
                        optionIsReceived = true;
                        break;
                    case "3":
                        functionNumber = 3;
                        optionIsReceived = true;
                        break;
                    case "4":
                        functionNumber = 4;
                        optionIsReceived = true;
                        break;
                    default:
                        System.out.println("Incorrect input, try again");
                        break;
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        String stringMode;
        boolean modeIsReceived = false;
        while(!modeIsReceived){
            System.out.println("Choose one of 3 modifications: ");
            System.out.println("1 - left rectangles");
            System.out.println("2 - right rectangles");
            System.out.println("3 - midle rectangles");
            try{
                stringMode = reader.readLine();
                switch(stringMode){
                    case "1":
                        mode = 1;
                        modeIsReceived = true;
                        break;
                    case "2":
                        mode = 2;
                        modeIsReceived = true;
                        break;
                    case "3":
                        mode = 3;
                        modeIsReceived = true;
                        break;
                    default:
                        System.out.println("Incorrect input, try again");
                        break;
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        String accString;
        boolean accIsRight = false;
        while(!accIsRight){
            try{
                System.out.print("Choose accuracy: ");
                accString = reader.readLine();
                accuracy = Double.parseDouble(accString);
                if (0<=accuracy){accIsRight = true;}else{throw new NumberFormatException();}
            }catch(NumberFormatException nfe){
                System.out.println("Incorrect input, try again");
            }catch(IOException ioe){
                ioe.printStackTrace();
            }
        }
        String flString;
        boolean flIsRight = false;
        while(!flIsRight){
            try{
                System.out.print("Choose first limit: ");
                flString = reader.readLine();
                firstLimit = Double.parseDouble(flString);
                flIsRight = true;
            }catch(NumberFormatException nfe){
                System.out.println("Incorrect input, try again");
            }catch(IOException ioe){
                ioe.printStackTrace();
            }
        }
        String slString;
        boolean slIsRight = false;
        while(!slIsRight){
            try{
                System.out.print("Choose second limit: ");
                slString = reader.readLine();
                secondLimit = Double.parseDouble(slString);
                slIsRight = true;
            }catch(NumberFormatException nfe){
                System.out.println("Incorrect input, try again");
            }catch(IOException ioe){
                ioe.printStackTrace();
            }
        }
    }
}
