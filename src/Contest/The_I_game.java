package Contest;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Oljursh
 */
public class The_I_game {

    /**
     * @param args the command line arguments
     */
    static boolean gameTable[][]= new boolean[10][10];
    
    private static void toggle(int x,int y){

        if (x != 0 && y != 0 && x != 9 && y != 9) {
            if (!gameTable[x][y]) {
                gameTable[x][y] = true;
            } else {
                gameTable[x][y] = false;
            }
            if (!gameTable[x - 1][y - 1]) {
                gameTable[x - 1][y - 1] = true;
            } else {
                gameTable[x - 1][y - 1] = false;
            }
            if (!gameTable[x - 1][y]) {
                gameTable[x - 1][y] = true;
            } else {
                gameTable[x - 1][y] = false;
            }
            if (!gameTable[x - 1][y + 1]) {
                gameTable[x - 1][y + 1] = true;
            } else {
                gameTable[x - 1][y + 1] = false;
            }
            if (!gameTable[x + 1][y - 1]) {
                gameTable[x + 1][y - 1] = true;
            } else {
                gameTable[x + 1][y - 1] = false;
            }
            if (!gameTable[x + 1][y]) {
                gameTable[x + 1][y] = true;
            } else {
                gameTable[x + 1][y] = false;
            }
            if (!gameTable[x + 1][y + 1]) {
                gameTable[x + 1][y + 1] = true;
            } else {
                gameTable[x + 1][y + 1] = false;
            }
        }if(x==0 && y!=0){
            if (!gameTable[x][y]) {
                gameTable[x][y] = true;
            } else {
                gameTable[x][y] = false;
            }
            if (!gameTable[x + 1][y - 1]) {
                gameTable[x + 1][y - 1] = true;
            } else {
                gameTable[x + 1][y - 1] = false;
            }
            if (!gameTable[x + 1][y]) {
                gameTable[x + 1][y] = true;
            } else {
                gameTable[x + 1][y] = false;
            }
            if (!gameTable[x + 1][y + 1]) {
                gameTable[x + 1][y + 1] = true;
            } else {
                gameTable[x + 1][y + 1] = false;
            }
        }if(y==0 && x!=0){
            if (!gameTable[x][y]) {
                gameTable[x][y] = true;
            } else {
                gameTable[x][y] = false;
            }
            if (!gameTable[x - 1][y]) {
                gameTable[x - 1][y] = true;
            } else {
                gameTable[x - 1][y] = false;
            }
            if (!gameTable[x - 1][y + 1]) {
                gameTable[x - 1][y + 1] = true;
            } else {
                gameTable[x - 1][y + 1] = false;
            }
            if (!gameTable[x + 1][y]) {
                gameTable[x + 1][y] = true;
            } else {
                gameTable[x + 1][y] = false;
            }
            if (!gameTable[x + 1][y + 1]) {
                gameTable[x + 1][y + 1] = true;
            } else {
                gameTable[x + 1][y + 1] = false;
            }
        }if(x==9 && y!=9){
            if (!gameTable[x][y]) {
                gameTable[x][y] = true;
            } else {
                gameTable[x][y] = false;
            }
            if (!gameTable[x - 1][y - 1]) {
                gameTable[x - 1][y - 1] = true;
            } else {
                gameTable[x - 1][y - 1] = false;
            }
            if (!gameTable[x - 1][y]) {
                gameTable[x - 1][y] = true;
            } else {
                gameTable[x - 1][y] = false;
            }
            if (!gameTable[x - 1][y + 1]) {
                gameTable[x - 1][y + 1] = true;
            } else {
                gameTable[x - 1][y + 1] = false;
            }
        } if(y==9 && x!=9){
                        if (!gameTable[x][y]) {
                gameTable[x][y] = true;
            } else {
                gameTable[x][y] = false;
            }
            if (!gameTable[x - 1][y - 1]) {
                gameTable[x - 1][y - 1] = true;
            } else {
                gameTable[x - 1][y - 1] = false;
            }
            if (!gameTable[x - 1][y]) {
                gameTable[x - 1][y] = true;
            } else {
                gameTable[x - 1][y] = false;
            }
            if (!gameTable[x + 1][y - 1]) {
                gameTable[x + 1][y - 1] = true;
            } else {
                gameTable[x + 1][y - 1] = false;
            }
            if (!gameTable[x + 1][y]) {
                gameTable[x + 1][y] = true;
            } else {
                gameTable[x + 1][y] = false;
            }
        }if(x==0&&y==0){
            if (!gameTable[x][y]) {
                gameTable[x][y] = true;
            } else {
                gameTable[x][y] = false;
            }
            if (!gameTable[x + 1][y]) {
                gameTable[x + 1][y] = true;
            } else {
                gameTable[x + 1][y] = false;
            }
            if (!gameTable[x + 1][y + 1]) {
                gameTable[x + 1][y + 1] = true;
            } else {
                gameTable[x + 1][y + 1] = false;
            }
        }if(x==9&&y==9){
            if (!gameTable[x][y]) {
                gameTable[x][y] = true;
            } else {
                gameTable[x][y] = false;
            }
            if (!gameTable[x - 1][y - 1]) {
                gameTable[x - 1][y - 1] = true;
            } else {
                gameTable[x - 1][y - 1] = false;
            }
            if (!gameTable[x - 1][y]) {
                gameTable[x - 1][y] = true;
            } else {
                gameTable[x - 1][y] = false;
            }
        }
        
    }
    
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("C:\\Users\\Oljursh\\Documents\\NetBeansProjects\\Algo\\src\\Contest\\created\\The I game.txt"));
        while(sc.hasNextLine()){
            int x =sc.nextInt();
            int y =sc.nextInt();
            toggle(y,x);
        }
        for (int i = 0; i < 10; i++) {
            if(i>0)System.out.println();
            for (int j = 0; j < 10; j++) {
                if(gameTable[i][j])System.out.print("X ");
                else System.out.print(". ");
            }
        }
        System.out.println();
    }
}
