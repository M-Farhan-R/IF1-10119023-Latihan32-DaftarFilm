/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119023.latihan32.daftarfilm;

/**
 *
 * @author Muhammad Farhan R 
 */
public class Film {
    public String filmName;
    public String filmGenre;
    public double filmRating;
    public int filmDuration;
    
    public void nowPlaying(){
        System.out.println("Judul Film : ".concat(filmName));
        System.out.println("Genre Film : ".concat(filmGenre));
        System.out.println("Rating Film : "+filmRating);
        System.out.println("Duration Film : "+filmDuration);
    }
}
