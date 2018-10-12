/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sinka.com;

/**
 *
 * @author dwarfonfire this is an attempt to make the sinka.com example from
 * Head First Java chapter 6 page 146 onwards functional
 */
public class SinkaCom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DotComBust game = new DotComBust();
        game.setUpGame();
        game.startPlaying();
    }

}
