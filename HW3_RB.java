package hw3_rb;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
Rachel Bridson - CIT2551
 */
public class HW3_RB extends Application {
    
@Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Test Scores");
        
        GridPane grid = new GridPane();
            grid.setAlignment(Pos.CENTER);
            grid.setHgap(10);
            grid.setVgap(10);

            // Labels and text boxes
            Label testScore = new Label("Test Score:");
            grid.add(testScore, 0, 1);

            TextField scoreInput = new TextField();
            grid.add(scoreInput, 1, 1);
            
            Label scoreNum = new Label("Number of Scores");
            grid.add(scoreNum, 0, 2);
            
            TextField scoreNumOut = new TextField();
            grid.add(scoreNumOut, 1, 2);
            
            Label average = new Label("Average Score:");
            grid.add(average, 0, 3);
            
            TextField averageOut = new TextField();
            grid.add(averageOut, 1, 3);
            
            Label bestScore = new Label("Best Score:");
            grid.add(bestScore, 0, 4);
            
            TextField bestOut = new TextField();
            grid.add(bestOut, 1, 4);
            

            // Buttons
            Button subBtn = new Button("Enter Score");
            Button clearBtn = new Button("Clear");
            Button closeBtn = new Button("Close");
            HBox btnBox = new HBox(10);
            btnBox.setAlignment(Pos.BOTTOM_LEFT);
            btnBox.getChildren().add(subBtn);
            btnBox.getChildren().add(clearBtn);
            btnBox.getChildren().add(closeBtn);
            
            grid.add(btnBox, 0, 5);

    } 

    public static void main(String[] args) {
        launch(args);
    }
    
}
