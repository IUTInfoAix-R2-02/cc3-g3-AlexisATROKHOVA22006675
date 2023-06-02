package fr.amu.iut.cc3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.shape.Circle;

import java.net.URL;
import java.util.ResourceBundle;

public class ToileController implements Initializable {

    private static int rayonCercleExterieur = 200;
    private static int angleEnDegre = 60;
    private static int angleDepart = 90;
    private static int noteMaximale = 20;



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }


    int getXRadarChart(double value, int axe ){
        return (int) (rayonCercleExterieur + Math.cos(Math.toRadians(angleDepart - (axe-1)  * angleEnDegre)) * rayonCercleExterieur
                *  (value / noteMaximale));
    }


    int getYRadarChart(double value, int axe ){
        return (int) (rayonCercleExterieur - Math.sin(Math.toRadians(angleDepart - (axe-1)  * angleEnDegre)) * rayonCercleExterieur
                *  (value / noteMaximale));
    }

    @FXML
    public void drawPoint() {
        Circle point = new Circle();
        point.setCenterX(225);
        point.setCenterY(225);
        point.setRadius(5);
    }

    /*

    public void drawPoint() {
        Circle point = new Circle();
        point.setCenterX(getXRadarChart(comp1, 1));
        point.setCenterY(getYRadarChart(comp1, 1));
        point.setRadius(5);
    }

     */
}
