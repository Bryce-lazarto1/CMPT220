/*
challenge file!
this one isn't too tough but it does require a little bit of writing and some googling
figure out how to take a string from the user
then print back out every individual letter one letter per line
I also am requiring a small write up: explain your discovery to me.
how did you figure out how to do this? can you translate your code into simple terms? 
you need to explain why you picked your for loop conditional and what's doing the work with the string
if you're confused reach out!
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); ///inserts the scanner///
        System.out.print("enter a string");///asks for the users answer///
        String Input = scanner.nextLine(); /// use the scanner to get the user input and make it "input"///
        
        for (int i = 0; i < Input.length(); i++) { ///this loops each letter 
            System.out.println(Input.charAt(i)); /// this print letter by letter(looked up .chartAT) ///
        }
    }
}
///i figured out how to do this by looking up how to print letter by letter in java for line 19 and for line 18 i used the google slides.
///the string is ran tbrough the scanner on line 16 then line 18 loops each letter using the .length and setting int i = 0then the final line prints each letter indivually
