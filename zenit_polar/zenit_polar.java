import java.util.Scanner;

public class ZenitPolar{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type the phrase: ");
        String input = scan.nextLine();
        String output = "";
        for (int i = 0; i < input.length(); i++) {
            char m = input.charAt(i);
            switch (m) {
                case 'Z':
                    output += 'P';
                    break;
                case 'E':
                    output += 'O';
                    break;
                case 'N':
                    output += 'L';
                    break;
                case 'I':
                    output += 'A';
                    break;
                case 'T':
                    output += 'R';
                    break;
                case 'P':
                    output += 'Z';
                    break;
                case 'O':
                    output += 'E';
                    break;
                case 'L':
                    output += 'N';
                    break;
                case 'A':
                    output += 'I';
                    break;
                case 'R':
                    output += 'T';
                    break;
                case 'z':
                    output += 'p';
                    break;
                case 'e':
                    output += 'o';
                    break;
                case 'n':
                    output += 'l';
                    break;
                case 'i':
                    output += 'a';
                    break;
                case 't':
                    output += 'r';
                    break;
                case 'p':
                    output += 'z';
                    break;
                case 'o':
                    output += 'e';
                    break;
                case 'l':
                    output += 'n';
                    break;
                case 'a':
                    output += 'i';
                    break;
                case 'r':
                    output += 't';
                    break;
                default:
                    output += m;
                    break;
            }
        }
        System.out.println("String output: " + output);
    }
}




