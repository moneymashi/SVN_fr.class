/* 
	<�������>
	
	EarlGrey SemiProject
		1) ������Ʈ ���� => application, application.view, application.model, application.util
	
	CSS �����ϱ� �ҽ�
	scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());


	<�̽�����> ex) 1. 97�� - Ŭ������ ã�� �� ����
	1. 
	2.
	3.
 
*/

package application;
	
import java.util.*;
import application.view.MainController;
import application.view.TableViewController;
import application.model.Data;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.util.Callback;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

public class Main extends Application {
	
	private Stage primaryStage;
	private Stage secondaryStage;
	private Scene secondaryScene;
	private BorderPane mainPage;
	private AnchorPane tableView;
	private TableView table;
	
	@Override
	public void start(Stage primaryStage) {
		
		this.primaryStage = primaryStage;
		fxlogin();
		
	}
	
	// �α���
	public void fxlogin(){
		try {

			Parent root = FXMLLoader.load(getClass().getResource("/application/view/login.fxml"));
            Scene scene = new Scene(root);

            primaryStage.setScene(scene);
            primaryStage.show();

		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	// �⺻ ȭ�� 
	public void basic(){
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(getClass().getResource("/application/view/Main.fxml"));
	        mainPage = loader.load(); // �̽� 1��
	        secondaryStage = new Stage();
	        //tableView(); // ���� �������� ���̺� �� ����
	        secondaryScene = new Scene(mainPage);
	        secondaryStage.setScene(secondaryScene);
	        secondaryStage.setResizable(true);
	        secondaryStage.show();
	        MainController control = loader.getController();
	        control.setMain(this);

		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	// ���̺� �� ȭ��
	public void tableView(){
		FXMLLoader loader = new FXMLLoader();
		try {
			loader.setLocation(getClass().getResource("/application/view/tableView.fxml")); // �̽� 1��
			tableView = (AnchorPane) loader.load();
			table = (TableView)tableView.getChildren().get(0);
	        mainPage.setCenter(tableView);	        
	        secondaryScene.setRoot(mainPage);
	        secondaryStage.setScene(secondaryScene);
	        secondaryStage.show();		   
	        TableViewController tc = loader.getController();
	        tc.setMain(this);        
	        
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	// �÷� ���ε� http://www.java2s.com/Tutorials/Java/JavaFX/0650__JavaFX_TableView.htm
	public void columnView(ObservableList<Data> dataList){
		//Scene node = tableView.getScene();
		TableColumn col01 = new TableColumn("overallqual");
		TableColumn col02 = new TableColumn("overallcond");
		TableColumn col03 = new TableColumn("saleprice");
		for(Data d : dataList){
			col01.setCellValueFactory(new PropertyValueFactory<>("overallqual"));
			col02.setCellValueFactory(new PropertyValueFactory<>("overallcond"));
			col03.setCellValueFactory(new PropertyValueFactory<>("saleprice"));
			System.out.println("������ : " + String.valueOf(d.getOverallQual()));
		}
		table.getColumns().add(col01);
		table.getColumns().add(col02);
		table.getColumns().add(col03);
	
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
}
