//This is assuming you have your file in the correct directory, i included a reference of where your txt file should be in the brightspace assignment
//based off what we learned in class about files, you need to determine how it's best to read the text file included in the assignment 
//after you've read and kept track of the text, then i need you to figure out:
/*
1. what names had over a 3.5 gpa (using coding, of course, not your eyes)
2. how many names are there total?
*/
//here's the imports you will need to start, and i've left some code with some blanks for you to figure out
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //do you need something to start?
        File inputfile = new File(practice.txt);
        List<String> HigherGPAs = new ArrayList<>();
        int totalStudents = 0;
        try {
            Scanner input = new Scanner(inputfile);
            while(input.hasNextline()){
                String line = input.nextLine();
                String[] parts = line.split(" ");
                String name = parts[0];
                Dub gpa = Double.parseDouble(parts[1]);
                if (gpa > 3.5) {
                    HigherGPAs.add(name);
            }
                totalStudents++;
    }   catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        System.out.println("students with a gpa higher then 3.5 " + HigherGPAs);
        System.out.println(List);
    }
}
