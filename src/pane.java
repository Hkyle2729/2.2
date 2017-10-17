/*
 * Author: kyle hicks
 * date 9/14/17
 * knh2729@email.vccs.edu
 * purpose of program:
 * to read input of byte,char,short,int,long,float,double and boolean.
 */
import javax.swing.*;
import java.util.Scanner;
public class pane {
    public static void main(String[] args ) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("enter byte value.");
        byte bytevalue = keyboard.nextByte();
        System.out.println("enter int value.");
        int intvalue = keyboard.nextInt();
        System.out.println("enter double value");
        double doublevalue = keyboard.nextDouble();
        System.out.println("enter boolean value");
        boolean booleanvalue = keyboard.nextBoolean();
        System.out.println("enter long value");
        long longvalue = keyboard.nextLong();
        System.out.println("enter short value.");
        short shortvalue =keyboard.nextShort();
        System.out.println("enter float value.");
        float floatvalue = keyboard.nextFloat();
        System.out.println("enter character value");
        char charvalue = keyboard.next().charAt(0);
        JOptionPane.showMessageDialog(null, "byte = " + bytevalue + "\n"
        + "int = " + intvalue + "\n"
        + "double = " + doublevalue + "\n"
        + "boolean = " + booleanvalue + "\n"
        + "long = " + longvalue + "\n"
        + "short = " + shortvalue + "\n"
        + "float = " + floatvalue + "\n"
        + "character = " + charvalue + "\n");
        keyboard.close();
    }
}
