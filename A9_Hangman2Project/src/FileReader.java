import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;

public class FileReader {

    public FileReader() {

    }

    public static void displayScores() throws IOException {


        ArrayList<Character> ans = new ArrayList<>();


        String temp = "";
        try{
            temp = Files.readString(Paths.get("/Users/jshin1223/Desktop/Pyramid Academy/Pyramid-Academy/A9_Hangman2Project/record.txt"));
            System.out.println(temp);
        } catch (Exception e)
        {
            e.printStackTrace();
            System.out.println(temp);
        }

//
//        String splitBy = ",";
//
//        String first;
//        BufferedReader in = new BufferedReader(new java.io.FileReader("/Users/jshin1223/Desktop/Pyramid Academy/CodingPractice/src/com/section8/java/calls.csv"));
//        in.readLine();
//
//        System.out.println(in);


//
//
//        String[] phoneRecord = first.split(splitBy);
//
//        String[] a = new String[1];
//
//        a[0] = "Name: " + phoneRecord[0] + ", Score: " + phoneRecord[1];
//
//        System.out.println(Arrays.toString(a));

    }


}
