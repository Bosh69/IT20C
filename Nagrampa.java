/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ITLAB1-PC03-STUDENT
 */
public class Nagrampa {

    public static void main(String[] args) {

        int[][] names = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        for (int i = 0; i <names.length; i++) {
            for (int j = 0; j < names[i].length; j++) {
                System.out.print(names[i][j]);
            }
            System.out.println();
            
        }
    }
}
