package com.rafsan.inventory.controller.report;

import com.rafsan.inventory.entity.Invoice;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.ObservableSet;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.print.Printer;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextInputControl;

public class ViewController implements Initializable {

    @FXML
    private TextField employeeField, totalField, vatField, discountField, payableField, paidField, returnedField;
    @FXML
    private Label serialLabel, dateLabel;
    private Invoice invoice;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void setReport(Invoice invoice){
        this.invoice = invoice;
        setData();
    }

    private void setData() {
        serialLabel.setText("Transcation ID# " + invoice.getId());
        dateLabel.setText("Date: " + invoice.getDate());
        employeeField.setText(invoice.getEmployee().getUserName());
        totalField.setText(String.valueOf(invoice.getTotal()));
        vatField.setText(String.valueOf(invoice.getVat()));
        discountField.setText(String.valueOf(invoice.getDiscount()));
        payableField.setText(String.valueOf(invoice.getPayable()));
        paidField.setText(String.valueOf(invoice.getPaid()));
        returnedField.setText(String.valueOf(invoice.getReturned()));
    }

    @FXML
    public void handlePrint(ActionEvent event) {
    	 //Get all Printers
        ObservableSet<Printer> printers = Printer.getAllPrinters();

        for(Printer printer : printers)
        {
            TextInputControl textArea = null;
			textArea.appendText(printer.getName()+"\n");
        }


    }

    @FXML
    public void closeAction(ActionEvent event) {
        ((Node) (event.getSource())).getScene().getWindow().hide();
    }
}
