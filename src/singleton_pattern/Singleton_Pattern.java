/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package singleton_pattern;

/**
 *
 * @author Ali Othman
 */
public class Singleton_Pattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Database database = Database.getInstance();
		database.display();

    }
    
}
