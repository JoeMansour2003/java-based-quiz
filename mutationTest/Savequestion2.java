package mutationTest;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Savequestion2 {

    /**
     * Return's -1 if option param is empty.
     * Else it will return (max - place in alphabet) (basically the remaining option avalible) 
     * 
     * @param option
     * @param input
     * @param max
     * @return
     * @throws IOException
     */
    public static int doStuff(String option, String input, int max) throws IOException {

        FileWriter f = new FileWriter("../Question.txt", true);//file object for question file (change the file location where you want to save the file)
        BufferedWriter bf = new BufferedWriter(f);
        bf.write(option);
        bf.write(input);//writing question to the question file
        bf.write("\n");
        bf.close();
        if (!option.equals("")) {
            char ch = option.charAt(1);
            int number = max - (ch - 'a' + 1);
            return number;
        }
        return -1;

    }
}
