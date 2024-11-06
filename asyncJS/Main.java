import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String word = "Coepoe Word Puzzle";
        System.out.println(word);
        System.out.println("=".repeat(word.length()));
        System.out.println();
        System.out.println("Rules :");
        System.out.println("1. Create a word using given character, min 3 characters & max 6 characters.");
        System.out.println("2. Each level, You have 10 chances to answer correctly.");
        System.out.println("3. To get through to next level, you have to score 70 points each level.");

        // level 1
        System.out.println();
        String lvl1 = "Level 1";
        System.out.println(lvl1);
        System.out.println("-".repeat(lvl1.length()));
        String[] level1 = {"d","e","t","t","l","i"};
        for (int i = 0; i < level1.length; i++){
            System.out.print("\t\t "+level1[i]+" ");
        }
        System.out.println();
        List<String> answerLvl1 = Arrays.asList(
                "die","led","lei","let","lid",
                "lie","lit","tie","deli","diet",
                "edit","idle","lied","tide","tied",
                "tile","tilt","tilde","tiled","title",
                "tilted","titled"
        );
        boolean syarat = true;
        int score = 0;
        while(syarat){
            score = 0;
            ArrayList<String> anslvl1 = new ArrayList<String>();
            for (int i = 1;i < 11; i++ ){
                Scanner input = new Scanner(System.in);
                System.out.print(i+">"+ "Your Answer : ");
                String answer = input.next();
                if (answerLvl1.contains(answer)) {
                    if (anslvl1.contains(answer)) {
                        System.out.println("You had already type this word before..");
                    } else {
                        score += 10;
                        System.out.println("# Right."+ "Score : "+ score);
                        anslvl1.add(answer);
                    }
                }
            }
            System.out.println("You had answered 10 times with "+ score/10 + " right answer..");
            System.out.println();
            if (score < 70){
                System.out.println();
                System.out.println("You Lose!! Try Again..");
                System.out.println("Do you want to retry [y/t]?");
                Scanner inputA = new Scanner(System.in);
                String yesNo = inputA.nextLine();
                if (yesNo.equalsIgnoreCase("t")){
                    syarat = false;
                } else {
                    syarat = true;
                }
            } else {
                // print correct answer
                System.out.println("Correct Answers : ");
                int count = 0;
                for (int i = 0; i  < 3;i++){
                    for (int j = 0; j < 10;j++){
                        if (count < answerLvl1.size()) {
                            System.out.print(answerLvl1.get(count)+ " ");
                            count++;
                        } else {
                            syarat = false;
                        }
                    }
                    System.out.println();
                }
            }
        }
        // Level 2
        System.out.println();
        String lvl2 = "Level 2";
        System.out.println(lvl2);
        System.out.println("-".repeat(lvl2.length()));
        String[] level2 = {"s","e","c","a","e","a","n"};
        for (int i = 0; i < level2.length; i++){
            System.out.print("\t\t "+level2[i]+" ");
        }
        System.out.println();
        List<String> answerLvl2 = Arrays.asList(
                "sec","can","ease","seen","sane","acne",
                "scan","cane","case","scene","cease"
        );
        boolean syarat2 = true;
        int score2 = 0;
        while(syarat2){
            score2 = 0;
            ArrayList<String> anslvl2 = new ArrayList<String>();
            for (int i = 1;i < 11; i++ ){
                Scanner input = new Scanner(System.in);
                System.out.print(i+">"+ "Your Answer : ");
                String answer = input.next();
                if (answerLvl2.contains(answer)) {
                    if (anslvl2.contains(answer)) {
                        System.out.println("You had already type this word before..");
                    } else {
                        score2 += 10;
                        System.out.println("# Right."+ "Score : "+ score2);
                        anslvl2.add(answer);
                    }
                }
            }
            System.out.println("You had answered 10 times with "+ score2/10 + " right answer..");
            System.out.println();
            if (score2 < 70){
                System.out.println("You Lose!! Try Again..");
                System.out.println("Do you want to retry [y/t]?");
                Scanner input2A = new Scanner(System.in);
                String yesNo = input2A.nextLine();
                if (yesNo.equalsIgnoreCase("t")){
                    syarat2 = false;
                } else {
                    syarat2 = true;
                }
            } else {
                System.out.println("Correct Answers : ");
                // print correct answer
                int count = 0;
                for (int i = 0; i  < 3;i++){
                    for (int j = 0; j < 10;j++){
                        if (count < answerLvl2.size()) {
                            System.out.print(answerLvl2.get(count)+ " ");
                            count++;
                        } else {
                            syarat2 = false;
                        }
                    }
                    System.out.println();
                }
            }
        }
        // Level 3
        System.out.println();
        String lvl3 = "Level 3";
        System.out.println(lvl3);
        System.out.println("-".repeat(lvl3.length()));
        String[] level3 = {"h","k","r","n","e","o"};
        for (int i = 0; i < level3.length; i++){
            System.out.print("\t\t "+level3[i]+" ");
        }
        System.out.println();
        List<String> answerLvl3 = Arrays.asList(
                "her","hen","hoe","hon","heron","honker",
                "hone","horn","kern","hero","knot","keno",
                "nook","nor","one","ore","roe","ken","kor",
                "rho","honk"
        );
        boolean syarat3 = true;
        int score3 = 0;
        while(syarat3){
            score3 = 0;
            ArrayList<String> anslvl3 = new ArrayList<String>();
            for (int i = 1;i < 11; i++ ){
                Scanner input = new Scanner(System.in);
                System.out.print(i+">"+ "Your Answer : ");
                String answer = input.next();
                if (answerLvl3.contains(answer)) {
                    if (anslvl3.contains(answer)) {
                        System.out.println("You had already type this word before..");
                    } else {
                        score3 += 10;
                        System.out.println("# Right."+ "Score : "+ score3);
                        anslvl3.add(answer);
                    }
                }
            }
            System.out.println("You had answered 10 times with "+ score3/10 + " right answer..");
            System.out.println();
            if (score3 < 70){
                System.out.println("You Lose!! Try Again..");
                System.out.println("Do you want to retry [y/t]?");
                Scanner input3A = new Scanner(System.in);
                String yesNo = input3A.nextLine();
                if (yesNo.equalsIgnoreCase("t")){
                    syarat3 = false;
                } else {
                    syarat3 = true;
                }
            } else {
                System.out.println("Correct Answers : ");
                // print correct answer
                int count = 0;
                for (int i = 0; i  < 3;i++){
                    for (int j = 0; j < 10;j++){
                        if (count < answerLvl3.size()) {
                            System.out.print(answerLvl3.get(count)+ " ");
                            count++;
                        } else {
                            syarat3 = false;
                        }
                    }
                    System.out.println();
                }
            }
        }
        System.out.println();
        int overallScore = score+score2+score3;
        System.out.println("Overall Score : "+ overallScore);
        if (overallScore < 210){
            System.out.println("You Lose!!!");
            Scanner lanjut = new Scanner(System.in);
            System.out.println("Press ENTER to exit..");
            lanjut.nextLine();
        } else {
            System.out.println("You Win!!!");
            Scanner lanjut = new Scanner(System.in);
            System.out.println("Press ENTER to exit..");
            lanjut.nextLine();
        }

    }
}