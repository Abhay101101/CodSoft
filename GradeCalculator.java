package CodSoft;

import java.util.Scanner;

public class GradeCalculator {
    Scanner sc=new Scanner(System.in);
    static int[] marks=new int[5];
    int sum;
    float percentage;

    public void marks(){
        for(int i=0; i<5; i++){
            System.out.print("Enter marks for Subject "+(i+1)+": ");
            marks[i]=sc.nextInt();
        }
        for(int i=0; i<marks.length; i++){
            sum+=marks[i];
        }
        percentage = (float)sum/5;
        
        System.out.println("Total marks are: "+sum);
        System.out.println("Percentage is: "+(float)sum/5);
        if(percentage<60.0){
            System.out.println("Your Grade is: "+'E');
        }
        else if(percentage>60 && percentage<=63){
            System.out.println("Your Grade is: "+"D-");
        }
        else if(percentage>63 && percentage<=67){
            System.out.println("Your Grade is: "+"D");
        }
        else if(percentage>67 && percentage<=70){
            System.out.println("Your Grade is: "+"D+");
        }
        else if(percentage>70 && percentage<=73){
            System.out.println("Your Grade is: "+"C-");
        }
        else if(percentage>73 && percentage<=77){
            System.out.println("Your Grade is: "+"C");
        }
        else if(percentage>77 && percentage<=80){
            System.out.println("Your Grade is: "+"C+");
        }
        else if(percentage>80 && percentage<=83){
            System.out.println("Your Grade is: "+"B-");
        }
        else if(percentage>83 && percentage<=87){
            System.out.println("Your Grade is: "+"B");
        }
        else if(percentage>87 && percentage<=90){
            System.out.println("Your Grade is: "+"B+");
        }
        else if(percentage>90 && percentage<=94){
            System.out.println("Your Grade is: "+"A");
        }
        else if(percentage>94 && percentage<=100){
            System.out.println("Your Grade is: "+"A+");
        }
    }
    public static void main(String[] args) {
        GradeCalculator gc=new GradeCalculator();
        gc.marks();
    }
}
