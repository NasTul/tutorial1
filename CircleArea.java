
/**
 * Write a description of class CircleArea here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;

public class CircleArea
{   
    
    private double radius;
    

 
    public static void main(String[] args){
        
        
        System.out.println("Hello world");
        Scanner getinput = new Scanner(System.in);
        
        double radius = getinput.nextDouble();
        double pi = 3.14;
        double area = radius * radius * pi;
        
        System.out.print(area);
    
    }
    
    void compute(){
    
    
    }
    

    
    
}
