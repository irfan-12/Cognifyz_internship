//Tic Tac Toa
import java.util.*;
public class Task_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] game = new char[3][3];
        //initializing with empty shells
        for(int i=0;i<3;i++){
            for(int j=0;j<game[i].length;j++){
                game[i][j] = ' ';
            }
        }
        char player1,player2;
        while (true) { 
            System.out.print("select player-1 Symbol('X' or 'O'): ");
            char p1 = sc.next().charAt(0);
            player1 = Character.toUpperCase(p1);
            player2 = ' ';
            if(player1 == 'X'){
                player2 = 'O';
                break;
            }
            else if(player1 == 'O'){
                player2 = 'X';
                break;
            }
            else{
                System.out.println("Invalid Symbol select from (X or O)");
            }

            
        }
        
        System.out.println("Player1 Variable: "+player1);
        System.out.println("Player2 Variable: "+player2);
        boolean gameover = false;
        int var = 2;
        while(!gameover){
            printBoard(game);
            if(var%2 == 0){
                var++;
                System.out.print("Enter move of Player-1("+player1+"): ");
                int row = sc.nextInt();
                int col = sc.nextInt();
                if(game[row][col] == ' '){
                    game[row][col] = player1;
                    if(won(game,player1)){
                        printBoard(game);
                        System.out.println("Player1("+player1+") is Won 🏆 ");
                        gameover = true;
                    }
                    else if(isDraw(game,player1)){
                        printBoard(game);
                        System.out.println("Match Drawn 🤝 ");
                        gameover = true;
                        
                    }
                    else{
                        System.out.println("These Shell is filled, please try another shell");
                        gameover = false;
                    }
                   
    
                }
            }
            else{
                var++;
                System.out.print("Enter move of Player-2("+player2+"): ");
                int row = sc.nextInt();
                int col = sc.nextInt();
                if(game[row][col] == ' '){
                    game[row][col] = player2;
                    if(won(game,player2)){
                        printBoard(game);
                        System.out.println("Player2("+player2+") is Won 🏆");
                        gameover = true;
                    }
                    else if(isDraw(game,player1)){
                        printBoard(game);
                        System.out.println("Match Drawn 🤝 ");
                        gameover = true;
                        
                    }
                    else{
                        System.out.println("These Shell is filled, please try another shell");
                        gameover = false;
                    }
                   
                }
                
            }
        } 
    }
    public static void printBoard(char game[][]){
        System.out.println(" -----------------");
        for(int i=0;i<3;i++){
            System.out.print("|");
            for(int j=0;j<3;j++){
                System.out.print("  "+game[i][j]+"  |");
            }
            System.out.println();
            System.out.println(" -----------------");

        }

    }
    public static boolean won(char game[][],char player){
       //for row
       for(int i=0;i<3;i++){
           if(game[i][0] != ' ' && (game[i][0] == game[i][1] && game[i][1] == game[i][2])){
               return true;
           }
       }
       //for col
       for(int j=0;j<3;j++){
           if(game[0][j] != ' ' && (game[0][j] == game[1][j] && game[1][j] == game[2][j])){
               return true;
           }
       }
       // to check diagonals
       if((game[0][0] != ' ' && (game[0][0] == game[1][1] && game[1][1] == game[2][2])) || ((game[0][2] != ' ') && game[0][2] == game[1][1] && game[1][1] == game[2][0])){
           return true;
       }
       else{
           return false;
       }
    }
    public static boolean isDraw(char[][] game,char player){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(game[i][j] == ' '){
                    return false; //all shells are not filled
                }
            }
        }
        return true;
    }
    
}
