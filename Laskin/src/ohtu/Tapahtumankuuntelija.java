package ohtu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;

public class Tapahtumankuuntelija implements ActionListener {

    private JButton plus;
    private JButton miinus;
    private JButton nollaa;
    private JButton undo;
    private JTextField tuloskentta;
    private JTextField syotekentta;
    private Sovelluslogiikka sovellus;
    private Komennot komennot;

    public Tapahtumankuuntelija(JButton plus, JButton miinus, JButton nollaa, JButton undo, JTextField tuloskentta, JTextField syotekentta) {
        this.plus = plus;
        this.miinus = miinus;
        this.nollaa = nollaa;
        this.undo = undo;
        this.tuloskentta = tuloskentta;
        this.syotekentta = syotekentta;
        this.sovellus = new Sovelluslogiikka();
        this.komennot = new Komennot(sovellus, syotekentta, plus, miinus, nollaa, undo);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
        komennot.suoritaKomento((JButton) ae.getSource());
        int laskunTulos = sovellus.tulos();

        syotekentta.setText("");
        tuloskentta.setText("" + laskunTulos);
    }

}
