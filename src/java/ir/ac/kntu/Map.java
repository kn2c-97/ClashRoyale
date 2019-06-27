package ir.ac.kntu;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Map {

    public static char[][] readMap() {
        char[][] gameMap = new char[20][20];
        try {
            FileInputStream myReader = new FileInputStream("Test.txt");
            int character;
            for(int i = 0; i < 20; i++) {
                for(int j = 0; j < 20; j++) {
                    character = myReader.read();
                    if(character != -1) {
                        gameMap[i][j] = (char) character;
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException d) {
            System.out.println(d);
        }
        return gameMap;
    }

    public static void printMap() {
        char[][] a = readMap();
        for(int i = 0; i < 20; i++) {
            for(int j = 0; j < 20; j++) {
                System.out.print(a[i][j]);
            }
            System.out.print("\n");
        }
    }
}
