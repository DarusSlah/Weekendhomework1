public class homeWork {

    public static void numberPrint(){
        for (int i = 45; i >= 1; i--)
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println("year up");

            }
        else if( i % 5 == 0){
                System.out.println("up");

            }
       else if (i % 3 == 0){
                System.out.println("year");
            }
        else {
            System.out.println(i);
        }
    }
    public static void printNumbers(int x) {
        for (int i = 0; i <= x; i++ )
        System.out.println(i);
    }
    public static void learnJava() {
        System.out.println("Learning Java Is Fun");
    }

    public static void main(String[] args) {

        // Question 1

        String firstName = ("Darus");
        String lastName = ("Slah");
        String fullName = (firstName + " " + lastName);
        System.out.println(fullName);

        // Question 2

        int[] firstArray = {103, 23, 34, 41, 75};
        int[] secondArray = {66, 75, 18, 91, 120};
        firstArray[4] = (69);
        System.out.println(firstArray[3] * secondArray[1] / firstArray[4]);

        // Question 3
        String[] topArtist = {"Kendrick Lamar", "Lil Wayne", "Pusha-T"};
        {
            System.out.println("My Favorite Musicians: ");
            int i = 0;
            while (i <= 2) {
                System.out.println(topArtist[i]);
                i++;

            }


        }

        // Question 4
        learnJava();

        // Question 5
        //Create a static method that that accepts a number as an argument/parameter then prints from 0 to that number`
        //- eg: if number passed as argument to method is five then print 0 1 2 3 4 5
        printNumbers(5);

        // Question 6
        for (int i = 13; i <= 19; i++) {
            System.out.println(i);

        }
        // Question 7
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 1)
                System.out.println(i);
        }

        // Question 8
        int studentGrade = 80;
        if (studentGrade <= 100 && studentGrade >= 90) {
            System.out.println("you got an A");
        } else if (studentGrade <= 89 && studentGrade >= 80) {
            System.out.println("you got an B");
        } else if (studentGrade <= 79 && studentGrade >= 70) {
            System.out.println("you got an C");
        } else if (studentGrade <= 69 && studentGrade >= 60) {
            System.out.println("you got an D");
        } else if (studentGrade <= 59) {
            System.out.println("you got an F");
        }
        // Question 9
        int[] arrayOfNumbers = {2, 34, 7, 48, 0, 13, 24};

        // Printing out all the elements in the array
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            System.out.println(arrayOfNumbers[i]);

            //Sum of the array

                System.out.println(arrayOfNumbers.length + arrayOfNumbers.length);

            // average of the array

                System.out.println(arrayOfNumbers.length + arrayOfNumbers.length / 2);



        }

        // Question 10
        numberPrint();
    }
}

