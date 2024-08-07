public class LoopsDemo {

    public static void main(String[] args) {
        // For loop to print numbers from 1 to 5
        System.out.println("For Loop starts :-");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Number: " + i);
        }   


        System.out.println("While Loop starts :-");
        int count = 1;
        // While loop to print numbers from 1 to 5
        while (count <= 5) {
            System.out.println("Count: " + count);
            count++;
        }

        int co = 1;

        // Do-while loop to print numbers from 1 to 5
        // it firsts runs the loop and then checks the condition so if the condition is false then too it will run one time .
        do {
            System.out.println("Count in do-while: " + co);
            co++;
        } while (co <= 5);

    }
}
