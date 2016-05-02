/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ohtu;


/**
 *
 * @author emivo
 */
public abstract class Komento {
    protected int edellinenTulos;
    protected Sovelluslogiikka sovellus;

    public Komento(Sovelluslogiikka sovellus) {
        this.sovellus = sovellus;
        edellinenTulos = 0;
    }
    
    public void suorita() {
        edellinenTulos = sovellus.tulos();
    }
    public void peru() {
        sovellus.palautaTulos(edellinenTulos);
    }
}
