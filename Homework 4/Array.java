
/*
Take the given array and keep track of:
1. Any duplicate numbers
2. How many times the duplicate numbers appear
3. Print out those duplicate numbers with how many times they appear

 */

public class Main {
    public static void main(String[] args) {
        //Don't let the size of this scare you! no matter how big an array is, it all works the same!
        int[] myArray = {10,3,295,38,20,3,4,267,2445,10,5566,87,93,17,10,2,87,267,3176,3,82};
        //you cannot use the array util. Do this one by hand :(
        HashMap<Integer, Integer> numberCounts = new HashMap<>();
         for (int i = 0; i < myArray.length; i++) {
            int num = myArray[i]; 
            if (counts.containsKey(num)) {
                int liveCount = counts.get(num);
                counts.put(num, liveCount + 1);
            } else {
                counts.put(num, 1);
            }
        }
        for (int num : counts.keySet()) {
            int count = counts.get(num);
            if (count > 1) {
                System.out.println(num + " shows up  "+ count + " times.");
            }
        }
    }
