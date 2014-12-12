package org.prospecthillacademy.wizards.hourofcode.helloworld;

import java.io.IOException;

/**
 * Hello foro Java using standard input.
 *
 * @author michael@bushe.com
 * @since 12/06/14
 */
public class HelloStdIn {
    public static void main(String[] args) throws IOException {
        //This will be output after Hello, start with outputting nothing.
        String input = "";
        while (true) {
            //System input has the characters that were directed to the program "< input.txt"
            int character = System.in.read();//read exactly one character
            if (character == -1) {
                break;
            }
            //Must convert (chop off) the 32-bit int (+/- 2,147,483,648)
            // to convert it to an 16-bit Unicode character 0->65,535
            // http://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
            input = input + (char) character;
        }
        //What should we do if there is no input?
        System.out.println("Hello " + input);
    }
}
