/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package random;

/**
 * Scope basics
 * @author edith
 */
public class Scopes {
    
    // Which scope? Class scope
    // 
    static int radius = 12;
    
    
    // Main like all other methods
    // forms a distinct scope
    // which is exists from the call to the
    // end of execution of this method
    public static void main(String[] args) {
        int radius = 2000;
        System.out.println("Can i see radius? " + radius);
        Ghost sylvia = new Ghost();
        sylvia.favoriteHouseToHaunt = "apartments";
        
        Ghost gretchen = new Ghost();
        gretchen.favoriteHouseToHaunt = "row house";
        
        System.out.println("Sylvia's house: " + sylvia.favoriteHouseToHaunt);
        System.out.println("Staic aversion: " + Ghost.averseTo);
        System.out.println("Gretchen's house: " + gretchen.favoriteHouseToHaunt);
        
        hauntHouse(4);
        hauntHouse(34);
    }
    
    static void hauntHouse(int roomsToHaunt){
        // roomsToHaunt is local to hauntHouse
        // and will only exist until the close } of this method
        // whereas class scoped variables exist until program termination
        System.out.println("Local variable roomsToHaunt: " + roomsToHaunt);
        System.out.println("Radius is class scoped and doesn't get wiped");
        System.out.println("with each new call: "+ radius);
        
        
    } // end of method exuction and destruction of the 
    // scope that was created at the time of call 
    
    
    
}
