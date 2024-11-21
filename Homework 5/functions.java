/*
for this one, if you remember, I asked you to come up with a 'reason' for a function and implement it. 
Now you get to do it! yay!!!!!
please go a little more complex than just simple math/simple printing for the function
feel free to google some inspiration though :)
*/

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number to see if its the same number reversed");
        int num = sc.nextInt();
         if (isSame(num)) {
            System.out.println(num + " is the same reversed");
        }else {
            System.out.println(number + " is not the same reversed");
   
    public static boolean isSame(int num) {
        int usernum = num;
        int reversed = 0;
        while (num > 0) {
            int digit = num % 10; 
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return usernum == reversed;
        }
    }
