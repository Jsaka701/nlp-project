import java.util.Scanner;

public class NLPRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MyNLP myNLP = new MyNLP();

        System.out.println("Welcome to the Spell Checker!");
        myNLP.prompt();

        scanner.close();

        

    }
}
