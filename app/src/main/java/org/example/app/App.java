/*
 * This source file was generated by the Gradle 'init' task
 */
package org.example.app;

import org.apache.commons.text.WordUtils;
import static org.example.app.MessageUtils.getMessage;
import org.example.list.LinkedList;
import static org.example.utilities.StringUtils.join;
import static org.example.utilities.StringUtils.split;

public class App {
    public static void main(String[] args) {
        LinkedList tokens;
        tokens = split(getMessage());
        String result = join(tokens);
        System.out.println(WordUtils.capitalize(result));


    }

    public static int factorial(int a){
        int factorial = 1;

        for(int i = a; i > 1 ; i--){
            factorial *= i;
        }

        return factorial;
    }

    public Double multiplication(Number a, Number b){
        return a.doubleValue() * b.doubleValue();
    }
}
