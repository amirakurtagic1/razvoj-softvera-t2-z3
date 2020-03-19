package ba.unsa.etf.tutorijal2;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
    public TextField Recenica;
    public TextArea Ispis;


    public void OnClick(ActionEvent actionEvent) {

        if(Recenica.getText().isEmpty())
        {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Warning Dialog");
            alert.setHeaderText("Problem učitavanja rečenice!");
            alert.setContentText("Niste unijeli odgovarajući tekst!");

            alert.showAndWait();


        }
        String s = new String();
        String nova_rijec = new String();
        s = Recenica.getText();
        String izlaz = new String();
        int broj = 0;
        String[] rijeci = s.split(" ");
        for(String x: rijeci)
        {
           if(x.length() > broj) broj = x.length();
        }

        for(String x: rijeci)
        {
            if(x.length() == broj) {
                    nova_rijec = x.toUpperCase();
                    izlaz = izlaz + " " + nova_rijec;
            }
            else {
                izlaz = izlaz + " " + x;
            }
        }

        Ispis.setText(izlaz);
    }
}
