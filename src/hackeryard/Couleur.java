/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackeryard;

import javafx.scene.paint.Color;

/**
 *
 * @author jonathan
 */
public class Couleur {
    public static Color getCouleurArc(int type){
        switch(type){
            case 0:
                return Color.BLACK;
            case 1:
                return Color.BISQUE;
                
            case 2:
                return Color.CHOCOLATE;
            case 3:
                return Color.DARKRED;
        }
        return Color.BLACK;
    } 
    
    
    
}