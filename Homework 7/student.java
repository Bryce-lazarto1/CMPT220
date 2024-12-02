/*
for this problem you need to:
1. create 5 different students in your main
2. create a method in this file that returns if they're an honor roll student or not (gpa > 3.6) then
check each of the students in main
3. create a method to see if they get "free lunch" (this is a weird school, every day they generate a random student id
and see if any students match that id, if they do they get free lunch that day, yay!) compare a randomly generated id and the
id of the student to print the appropriate response.
 */
public class student{
    String name;
    String year;
    double gpa;
    int id;
    public student(String n, String y, double g, int i){
        name = n;
        year = y;
        gpa = g;
        id = i;
    }
    //new method
    public boolean honorroll() {
        return gpa > 3.6;
    }
    //new method
    public boolean freelunch(int randomnum) {
        return id == randomId; 
    }
    student MelC = new student("Melissa","Senior",3.4,1343);
    student MelC = new student("james","Senior",3.2,1344);
    student MelC = new student("kevin","Senior",3.9,1345);
    student MelC = new student("troy","Senior",3.8,1346);
    student MelC = new student("jax","Senior",3.3,1347);
    Student[] studs = {Melc, JAM, KEV, TRO, Jax};
        System.out.println("Honor Roll Status");
        for (Student MelC : studs) {
            System.out.println(MelC.name + (MelC.Honorroll() ? "Yes" : "No"));
        }
        Random random = new Random();
        int randomnum = 1343 + random.nextInt(5);
        System.out.println(" free lunch id num  " + randomnum);
        for (Student MelC : studs) {
            if (MelC.FreeLunch(randomnum)) {
                System.out.println(MelC.name + "gets free lunch");
            }
        }
    }
}
