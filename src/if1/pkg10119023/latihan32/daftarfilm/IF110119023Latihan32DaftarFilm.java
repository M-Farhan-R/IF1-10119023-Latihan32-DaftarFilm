/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package if1.pkg10119023.latihan32.daftarfilm;

/**
 *
 * @author 
 * NAMA              : Muhammad Farhan R 
 * KELAS             : IF1
 * NIM               : 10119023
 * Deskripsi Program :
 *
 */
public class IF110119023Latihan32DaftarFilm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Film f = new Film();
        f.filmName = "random";
        f.filmGenre = "film.jpg";
        f.filmRating = 10.0;
        f.filmDuration = 1;
        
        f.nowPlaying();
    }

}
