/** 
* Jehlani Burton
 * 12/1/2019
 * CIS 231
 * Final part 2
 * This program lets the user input loan information. The loan information
 * gets but into a text bar that then allows the program to 
 * pull up a loan list comparing the rate, amount and years owed.
 * Also three rings will be colorized at the bottom
 * 
 * */
package application;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.geometry.Pos;
import java.util.*;

public class Loan extends Application {
	// setting up our text field space area 	
protected TextField TFLoans = new TextField();
protected TextField TFYearsowed = new TextField();
protected TextArea TFArea = new TextArea();
// Primary stage + override
@Override // Override function
// primary stage with start and pre set columns. 
public void start(Stage primaryStage) {
TFYearsowed.setPrefColumnCount(10);
TFLoans.setPrefColumnCount(9);
TFArea.setPrefColumnCount(90);
// Creates the show button table
Button btLoanTable = new Button("Show Loan Table");
// Creates the Hbox pane and controls
HBox paneForControls = new HBox(10);
paneForControls.setAlignment(Pos.CENTER);
paneForControls.getChildren().addAll(new Label(" Enter Loan ammount"), TFLoans,
new Label("Years owed"), TFYearsowed, btLoanTable);
// Creates a scrollbar
ScrollPane ScrollBar = new ScrollPane(TFArea);
// Create's a new BorderPane for the area
BorderPane NewbpPANE = new BorderPane();
NewbpPANE.setTop(paneForControls);
NewbpPANE.setCenter(TFArea);
// Create's a set on action event to open up the loan table
btLoanTable.setOnAction(LoanTableControls -> {
print();
});
//Create's a Scene and place it in the stage //
Scene scene = new Scene(NewbpPANE);
primaryStage.setTitle("Loan calculator"); // sets the title
primaryStage.setScene(scene); // place the scene in the stage
primaryStage.show(); // Displays the stage
}
private void print() {
// TODO Auto-generated method stub
}
// start method 
public static void main(String[] args) {
Application.launch(args);
}
}

	
