
public class Main {
    public static void main(String[] args) {


        //P1: This one only prints 0-9, can you fix it so it prints 1-10?
        System.out.println("Problem 1");
        for (int i = 1; i <= 10; i++){
            System.out.println(i);
        }

        //P2: Ask the user for a number. Create a loop to find the factorial of it
        //(factorial = X!, X being the user input, Factorials are every digit before X multiplied together)
        System.out.println("Problem 2");
        System.out.println("Enter a number and I will tell you the fatorial: ");
        Scanner sc = new Scanner(System.in);
        int num = scanner.nextInt();
        int factorial = 1;
        for (int i = 0; i <= num; i++) {
        factorial *= i;    
        //here's a hint
        for (int i = 0; i < ?; i++){

        }

        //P3: Ask the user for a number, and then add together every OTHER digit (starting from 1)
        System.out.println("Problem 3");
        System.out.println("Enter a number and I will tell you the sum of every other number: ");
        Scanner sc = new Scanner(System.in);
        String num = scanner.nextLine(); 
        int sum = 0;
        for (int i = 0; i < num.length(); i += 2) {
            sum += Character.getNumericValue(number.charAt(i)); /// looked this up i got very lost but i understand it now :)
        //No hint! what do you need to complete this task?

        //P4: Why does this loop never stop!
        //what can you do to break out of the loop after it prints once?
        System.out.println("Problem 4");
        boolean run = true;
        while (run == true){
            System.out.println("I printed once!");
            break;
        }

        //P5: Take a string from the user and print them the reverse!
        System.out.println("Problem 5");
        System.out.print("Enter a string");

        Scanner sc = new Scanner(System.in);
        String input = scanner.nextLine(); 
        String reverse = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reverse += input.charAt(i); 
        }

        System.out.println(reverse);
    }
}
