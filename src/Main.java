import java.util.Scanner;
import java.util.Random;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    static String [][] arr = new String[3][3];
    public static void main(String[] args) {
        arr[0][0] = " ";
        arr[0][1] = " ";
        arr[0][2] = " ";
        arr[1][0] = " ";
        arr[1][1] = " ";
        arr[1][2] = " ";
        arr[2][0] = " ";
        arr[2][1] = " ";
        arr[2][2] = " ";

        Scanner data = new Scanner(System.in);
        boolean computer_turn = false;
        int is_win = 0;
        int index = 0;
        while ( is_win != 1 ) {
            print();
            if (computer_turn) {
                Random rand = new Random();
                index = rand.nextInt(9);
                index += 1;
                System.out.println("computer chose "+ index);
                is_win = play(index,"O");
                while (is_win == -1){

                    index = rand.nextInt(9);
                    index += 1;
                    is_win = play(index,"O");
                }
                computer_turn = !computer_turn;
            } else {
                System.out.println("Where would you like to play? (1-9)");
                index = data.nextInt();
                is_win = play(index,"X");
                while (is_win == -1){
                    System.out.println(index+" is not a valid move");
                    index = data.nextInt();
                    is_win = play(index,"X");
                }
                computer_turn = !computer_turn;


            }
        }

    }
    public static int play(int index, String xo){

        //int state = 0;
        switch (index){
            case 1:
                if (arr[0][0] != " ") {
                    return -1;
            }
                arr[0][0] = xo;
                break;
            case 2:
                if (arr[0][1] != " ") {
                    return -1;
                }
                arr[0][1] = xo;
                break;
            case 3:
                if (arr[0][2] != " ") {
                    return -1;
                }
                arr[0][2] = xo;
                break;
            case 4:
                if (arr[1][0] != " ") {
                    return -1;
                }
                arr[1][0] = xo;
                break;
            case 5:
                if (arr[1][1] != " ") {
                    return -1;
                }
                arr[1][1] = xo;
                break;
            case 6:
                if (arr[1][2] != " ") {
                    return -1;
                }
                arr[1][2] = xo;
                break;
            case 7:
                if (arr[2][0] != " ") {
                    return -1;
                }
                arr[2][0] = xo;
                break;
            case 8:
                if (arr[2][1] != " ") {
                    return -1;
                }
                arr[2][1] = xo;
                break;
            case 9:
                if (arr[2][2] != " ") {
                    return -1;
                }
                arr[2][2] = xo;
                break;
            default:
                return -1;

        }


        if (arr[0][0] == xo && arr[0][1] == xo && arr[0][2] == xo || arr[1][0] == xo && arr[1][1]== xo && arr[1][2] == xo || arr[2][0] == xo && arr[2][1]== xo && arr[2][2] == xo){
            if(xo == "X") {
                print();
                System.out.println("You wins!");
            }else{
                print();
                System.out.println("Computer wins!");
            }
            return 1;
        }else if (arr[0][0] == xo && arr[1][0] == xo && arr[2][0] == xo || arr[0][1] == xo && arr[1][1] == xo && arr[2][1] == xo || arr[0][2] == xo && arr[1][2]== xo && arr[2][2] == xo) {
            if(xo == "X") {
                print();
                System.out.println("You wins!");
            }else{
                print();
                System.out.println("Computer wins!");
            }
            return 1;
        }else if (arr[0][0] == xo && arr[1][1] == xo && arr[2][2] == xo || arr[2][0] == xo && arr[1][1] == xo && arr[0][2] == xo ) {
            if(xo == "X") {
                print();
                System.out.println("You wins!");
            }else{
               print();
                System.out.println("Computer wins!");
            }
            return 1;
        }
        if (arr[0][0] != " " && arr[0][1] != " " && arr[0][1] != " " && arr[1][0] != " " && arr[1][1] != " " && arr[1][2] != " " && arr[2][0] != " " && arr[2][1] != " " && arr[2][2] != " "){
            print();
            System.out.println("Game over");
            return 1;
        }

        return 0;

    }

    public static void print(){
        System.out.println(arr[0][0]+"|"+arr[0][1]+ "|"+arr[0][2]+ "\n" +
                "-+-+- \n" +
                arr[1][0]+"|"+arr[1][1]+ "|"+arr[1][2]+ "\n"+
                "-+-+- \n" +
                arr[2][0]+"|"+arr[2][1]+ "|"+arr[2][2]+ "\n" );
    }
}