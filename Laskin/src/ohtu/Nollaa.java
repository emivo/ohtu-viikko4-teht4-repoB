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
public class Nollaa extends Komento {
    private Sovelluslogiikka sovellus;
    protected int edellinenTulos;

    public Nollaa(Sovelluslogiikka sovellus) {
        super(sovellus);
    }

    @Override
    public void suorita() {
        super.suorita();
        sovellus.nollaa();
    }
}
