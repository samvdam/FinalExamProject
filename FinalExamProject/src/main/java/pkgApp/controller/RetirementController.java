package pkgApp.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import pkgApp.RetirementApp;
import pkgCore.Retirement;

public class RetirementController implements Initializable {

		
	private RetirementApp mainApp = null;
	
	@FXML
	private TextField txtYearsToWork;
	
	@FXML
	private TextField txtYearsRetired;
	
	@FXML
	private TextField txtMonthlySSI;
	
	@FXML
	private TextField txtAnnualReturnWorking;
	
	@FXML
	private TextField txtAnnualReturnRetired;
	
	@FXML
	private TextField txtRequiredIncome;
	
	@FXML
	private Label lblSaveEachMonth;
	
	@FXML
	private Label lblNeedToSave;

	
	
	public RetirementApp getMainApp() {
		return mainApp;
	}

	public void setMainApp(RetirementApp mainApp) {
		this.mainApp = mainApp;
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		lblSaveEachMonth.setText(null);
		lblNeedToSave.setText(null);
	}
	
	@FXML
	public void btnClear(ActionEvent event) {
		System.out.println("Clear pressed");
		
		//	TODO: Clear all the text inputs
		
		txtYearsToWork.setText(null);
		txtYearsRetired.setText(null);
		txtMonthlySSI.setText(null);
		txtAnnualReturnWorking.setText(null);
		txtAnnualReturnRetired.setText(null);
		txtRequiredIncome.setText(null);
		
		lblSaveEachMonth.setText(null);
		lblNeedToSave.setText(null);
		
		
	}
	
	@FXML
	public void btnCalculate(ActionEvent event) {
		
		//	TODO: Call AmountToSave and TotalAmountSaved and populate 
		
		Retirement r=new Retirement(Integer.parseInt(txtYearsToWork.getText()), Double.parseDouble(txtAnnualReturnWorking.getText()), Integer.parseInt(txtYearsRetired.getText()), Double.parseDouble(txtAnnualReturnRetired.getText()), Double.parseDouble(txtRequiredIncome.getText()), Double.parseDouble(txtMonthlySSI.getText()));
		
		lblSaveEachMonth.setText(Double.toString(r.AmountToSave()).substring(0, Double.toString(r.AmountToSave()).indexOf('.')+3));
		lblNeedToSave.setText(Double.toString(r.TotalAmountSaved()).substring(0,Double.toString(r.TotalAmountSaved()).indexOf('.')+3));
	}
	
}
