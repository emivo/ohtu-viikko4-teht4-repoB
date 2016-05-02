package ohtu;

import javax.swing.JTextField;

/**
 *
 * @author emivo
 */
public class Plus extends KaksipaikkainenOperaatio{
    
    public Plus(Sovelluslogiikka sovellus, JTextField syotekentta) {
        super(sovellus, syotekentta);
    }
    
    @Override
    void laske(int arvo) {
        sovellus.plus(arvo);
    }
}
