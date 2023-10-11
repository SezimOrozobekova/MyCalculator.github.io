package com.example.mycalculator;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController{

   Calculator calc = new Calculator();

   @FXML
   private TextField inputfield;

   @FXML
   protected void onButtonClearClick(){
      String val = inputfield.getText();
      inputfield.setText("");
   }

   @FXML
   protected void onButtonOneClick(){
      String val = inputfield.getText();
      if(val.equals("0")) val="";
      inputfield.setText( val + "1" );
   }
   @FXML
   protected void onButtonTwoClick(){
      String val = inputfield.getText();
      if(val.equals("0")) val="";
      inputfield.setText(val + "2" );
   }
   @FXML
   protected void onButtonTreeClick(){
      String val = inputfield.getText();
      if(val.equals("0")) val="";
      inputfield.setText( val + "3" );
   }
   @FXML
   protected void onButtonFourClick(){
      String val = inputfield.getText();
      if(val.equals("0")) val="";
      inputfield.setText(val + "4" );
   }
   @FXML
   protected void onButtonFiveClick(){
      String val = inputfield.getText();
      if(val.equals("0")) val="";
      inputfield.setText( val + "5" );
   }
   @FXML
   protected void onButtonSixClick(){
      String val = inputfield.getText();
      if(val.equals("0")) val="";
      inputfield.setText(val + "6" );
   }
   @FXML
   protected void onButtonSevenClick(){
      String val = inputfield.getText();
      if(val.equals("0")) val="";
      inputfield.setText( val + "7" );
   }
   @FXML
   protected void onButtonEightClick(){
      String val = inputfield.getText();
      if(val.equals("0")) val="";
      inputfield.setText(val + "8" );
   }
   @FXML
   protected void onButtonNineClick(){
      String val = inputfield.getText();
      if(val.equals("0")) val="";
      inputfield.setText( val + "9" );
   }
   @FXML
   protected void onButtonZeroClick(){
      String val = inputfield.getText();
      if(val.equals("0")) val="";
      inputfield.setText(val + "0" );
   }



   @FXML
   protected void onButtonPlusClick(){
      String val = inputfield.getText();
      inputfield.setText("");
      double d = Double.parseDouble(val); //convert val to double
      calc.setOperator('+');
      calc.setOperand1(d);

   }
   @FXML
   protected void onButtonDivideClick(){
      String val = inputfield.getText();
      inputfield.setText("");
      double d = Double.parseDouble(val); //convert val to double
      calc.setOperator('/');
      calc.setOperand1(d);
   }
   @FXML
   protected void onButtonMultiplyClick(){
      String val = inputfield.getText();
      inputfield.setText("");
      double d = Double.parseDouble(val); //convert val to double
      calc.setOperator('*');
      calc.setOperand1(d);
   }
   @FXML
   protected void onButtonMinusClick(){
      String val = inputfield.getText();
      inputfield.setText("");
      double d = Double.parseDouble(val); //convert val to double
      calc.setOperator('-');
      calc.setOperand1(d);
   }
   @FXML
   protected void onButtonEqualClick(){
      String val = inputfield.getText();
      inputfield.setText("");
         double d = Double.parseDouble(val); //convert val to double
         calc.setOperand2(d);
         calc.calculate();
         d = calc.getResult();
         if(d == (int)d){
            inputfield.setText(Integer.toString((int)d));
         } else{
             inputfield.setText(Double.toString(d));
         }
      }

   }
