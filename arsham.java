import java.util.*;
public class arsham {
    public static void main(String[] args) {

        String name;
        int[] answer = new int[6]; // "answer is user´s input
        int[] point = new int[6]; // "points are the result of the answer
        int SumOfResults;

        System.out.println("Enter your name to start: " + "\n");
        Scanner Begin = new Scanner(System.in);
        name = Begin.next();

        System.out.println("Welcome to this \"Fromsoftware quiz\"" + name + "\n" +
                "In this quiz you will be asked 6 questions about fromsoftware games\n" +
                "You will get one point for a right answer. You have to get at least\n" +
                "4 points to prove that your a true fromsoftware fan :D " +
                "Lets get stared:\n ");

        System.out.println("A) Who is the hardest boss in bloodborne?\n" +
                "1.Cleric Beast  2.Gherman  3.Orphan of cos  4.Lady Maria\n");
        System.out.print("Your answer :");
        Scanner first = new Scanner(System.in);
        answer[0] = first.nextInt();

        System.out.println("_____________________");

        System.out.println("B) Who is the Demon Hatred in Sekiro?\n" +
                "1.Unknown  2.Sculptor  3.The Owl  4.Isshin\n");
        System.out.print("Your answer :");
        Scanner second = new Scanner(System.in);
        answer[1] = second.nextInt();

        System.out.println("_____________________");

        System.out.println("C)  Who gives you the Skill \"One Mind\" in sekiro?\n" +
                "1.Isshin  2.The Owl  3.Isshin the sword saint  4.Emma\n");
        System.out.print("Your answer :");
        Scanner third = new Scanner(System.in);
        answer[2] = third.nextInt();

        System.out.println("______________________");

        System.out.println("D) Who is the last boss in dark souls 3?\n" +
                "1.Gwyn Lord of Cinder  2.Nashandra  3.Namless King  4.Soul of Cinder\n");
        System.out.print("Your answer :");
        Scanner fourth = new Scanner(System.in);
        answer[3] = fourth.nextInt();

        System.out.println("______________________");

        System.out.println("E) In which Dark souls game do you play as the chosen undead?\n" +
                "1.Dark souls 1  2.Dark souls 2  3.Dark souls 3  4.None of them\n");
        System.out.print("Your answer :");
        Scanner fith = new Scanner(System.in);
        answer[4] = fith.nextInt();

        System.out.println("______________________");

        System.out.println("F) Which one one these is not a great one in bloodborne?\n" +
                "1.ROM  2.the One Reborn  3.Moon Presence  4.Amygdala\n");
        System.out.print("Your answer :");
        Scanner sixth = new Scanner(System.in);
        answer[5] = sixth.nextInt();

        System.out.println("\n======================");

        if (answer[0] == 3) {
            point[0] = 1;
        } else {
            point[0] = 0;
        }
        if (answer[1] == 2) {
            point[1] = 1;
        } else {
            point[1] = 0;
        }
        if (answer[2] == 1) {
            point[2] = 1;
        } else {
            point[2] = 0;
        }
        if (answer[3] == 4) {
            point[3] = 1;
        } else {
            point[3] = 0;
        }
        if (answer[4] == 1) {
            point[4] = 1;
        } else {
            point[4] = 0;
        }
        if (answer[5] == 2) {
            point[5] = 1;
        } else {
            point[5] = 0;

        }
        SumOfResults = point[0] + point[1] + point[2] + point[3] + point[4] + point[5];
        if (SumOfResults <= 3) {
            System.out.println("Im sorry " + name + " You have gained " + SumOfResults + " Points\n" +
                    "This shows that you dont know much about fromsoftware");
        } else {
            System.out.println("You have gained " + SumOfResults + "Points\n" +
                    "You are clearly a fromsoftware fan " + name);
        }
    }
}