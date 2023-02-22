package com.example.demo2;

import javafx.fxml.FXML;
import javafx.scene.control.Label;


public class HelloController {

    @FXML Label label;

    int labelNumber = 0;
    String labelText;

    public void increaseClick() {
        labelText = label.getText();
        labelNumber = Integer.parseInt(labelText);
        labelNumber++;
        label.setText("" + labelNumber);
    }

    public void decreaseClicked() {
        labelText = label.getText();
        labelNumber = Integer.parseInt(labelText);
        labelNumber--;
        label.setText("" + labelNumber);
    }
}