/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sinka.com;
import java.util.*;
/**
 *
 * @author dwarfonfire
 */
public class DotComBust {
    
    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
    private int numOfGuesses = 0;
    
    void setUpGame(){
        //first make some dot coms and give them locations
        DotCom one = new DotCom();
        one.setName("Pets.com");
        DotCom two = new DotCom();
        two.setName("eToys.com");
        DotCom three = new DotCom();
        three.setName("Go2.com");
        dotComsList.add(one);
        dotComsList.add(two);
        dotComsList.add(three);
    
        
        System.out.println("Your goal is to sink 3 dot coms");
        System.out.println("Try to sink hem all is the fewest nos of guesses");
        
        for(DotCom dotComToSet : dotComsList){
            ArrayList<String> newLocation = helper.placeDotCom(3);
            dotComToSet.setUpLocationCells(newLocation);
        }
    }
    
    void startPlaying(){
        
        while(!dotComsList.isEmpty()){
            String userGuess = helper.getUserInput("Enter a Guess!");
            checkUserGuess(userGuess);
        }
        
        finishGame();
    }
    
    void checkUserGuess(String userGuess){
        
        numOfGuesses++;
        
        String result = "miss";
        
        for(DotCom dotComToTest : dotComsList){
            
            result = dotComToTest.checkYourself(userGuess);
            
            if(result.equals("hit")){
                
                break;
            }
            
            if(result.equals("kill")){
                
                dotComsList.remove(dotComToTest);
                break;
            }
                
                
        }
    }
    
    
    private void finishGame(){
        
        System.out.println("All dot Coms are now dead! Your Stock is now worthless!");
        
        if(numOfGuesses <= 18){
            System.out.println("It took you " + numOfGuesses+ "Guesses");
            
        } else{
            System.out.println("Took You Long Enough. " + numOfGuesses+ "Guesses");
        
        }
           
    }
}
