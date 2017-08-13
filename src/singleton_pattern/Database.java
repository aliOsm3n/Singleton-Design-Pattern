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
public class Database {
    
    private static  Database database=null;
    private Database(){}
    public static Database getInstance(){
		if(database == null){
			database = new Database();
		}
        return database;
    }
    public void display(){
		System.out.println("I'm the Classic Singleton");
		System.out.println("Be Caution: I'm NOT thread safe");
	}
    
}
