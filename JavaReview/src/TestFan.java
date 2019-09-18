/**
	File name: TestFan.java
	Short description: ??????
	IST 242 Assignment:  
	@author Joshua Michaels
	@version 1.01 2014-08-25
	date of last revision:
	details of the revision: none
*/


import java.util.Scanner;

/**
 *
 * @author Joshua
 */
public class TestFan {

    public static void main(String[] args)
    {
        
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();
        
        // Settings for fan 1
        fan1.setOn(true);
        fan1.setSpeed(3);
        fan1.setColor("yellow");
        
        // Settings for fan 2
        fan2.setSpeed(2);
        fan2.setColor("blue");
        
        // Display settings for fan 1
        System.out.println(fan1.toString());
        
        // Display settings for fan 2
        System.out.println(fan2.toString());
    }
}
