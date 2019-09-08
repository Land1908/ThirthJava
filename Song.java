/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChuaBTB1;


public class Song extends Audio{
    String artis;
    String album;

    @Override
    void play() {
        System.out.println("Play song");
    }

    @Override
    void display() {
        super.display(); 
        System.out.println("Artis is: " + artis);
        System.out.println("Album is: " + album);
    }
    
}
