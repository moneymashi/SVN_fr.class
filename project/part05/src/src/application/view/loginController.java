package application.view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
//import javafx.scene.Parent;
//import javafx.scene.Scene;
import javafx.scene.control.Label;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;

import application.Main;
//import javafx.stage.Stage;
//import application.Main;

import application.util.DbConn;
import application.util.DbController;

//import java.io.IOException;
import java.sql.*;


public class loginController  {
	//private DbController control;
  //  private Main main;
	
    @FXML
    private JFXTextField txusername;
    @FXML
    private JFXPasswordField txpassword;
	@FXML
	private Label labeltitle;
	
	private DbController control;
	private Main mainapp;
	 
	
	 @FXML
	 private void btnlogin(ActionEvent event){
		 // db���������̱⶧���� test/test�Է½� �α��μ���or ���� ����
		 /*
		 if(txusername.getText().equals("test") && txpassword.getText().equals("test")){
			 labeltitle.setText("succes");	

					try {
						((Node)(event.getSource())).getScene().getWindow().hide();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				
					Main main = new Main();
					main.basic();

			 }else{
				 labeltitle.setText("fail");
			 }
			 */
		 // DB������ �ּ� Ǯ����
		 	control = new DbController();
			try {
				ResultSet rs = null;
				rs = control.logincheck(txusername.getText().toString(), txpassword.getText().toString() );
				//System.out.println(rs.next());
				if(rs.next()){
					((Node)(event.getSource())).getScene().getWindow().hide();
					
					Main mainapp = new Main();
					mainapp.basic();
				}
				else{
					labeltitle.setText("id�� pw�� Ʋ�Ƚ��ϴ�");
				}
				control.con.disconnect();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
			} finally{
				control.con.disconnect();
			}
	 }
	 

    public loginController() {
    }


	@FXML
    private void initialize() {
		// TODO Auto-generated method stub
		
	}




}
