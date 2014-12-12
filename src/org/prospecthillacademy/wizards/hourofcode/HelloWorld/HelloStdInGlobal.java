package org.prospecthillacademy.wizards.hourofcode.helloworld;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Hello for Java using standard input, can work with international characters.
 *
 * @author michael@bushe.com
 * @since 12/06/14
 */
public class HelloStdInGlobal {
    public static void main(String[] args) throws IOException {
        //This will be output after Hello, start with outputting nothing.
        String input = "";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String line = br.readLine();
            if (line == null) {
                break;
            } else {
                input = input + line;
            }
        }
        //What should we do if there is no input?
        System.out.println("Hello " + input);
    }
}
