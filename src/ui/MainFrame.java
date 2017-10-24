package ui;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import ui.view.*;

import java.io.File;
import java.io.IOException;

/**
 * Created by miaomuzhi on 2017/10/16.
 * TODO row and column
 */
public class MainFrame extends Application{
    private Stage mainStage;
    private MainController mainController;

    @Override
    public void start(Stage primaryStage){
        mainStage = primaryStage;
        mainStage.setTitle("Game of Life");

        try{
            initStage();
        } catch (IOException e){

        }
    }

    private void initStage() throws IOException{
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(MainFrame.class.getResource("view"+ File.separator+"MainView.fxml"));

        BorderPane mainView = loader.load();
        mainStage.setScene(new Scene(mainView));

        MainController mainController = loader.getController();
        this.mainController = mainController;
        mainController.setFrame(this);
        mainController.setStage(mainStage);

        mainStage.show();
        addButtons(mainView);
    }

    private void addButtons(BorderPane mainView){
        GridPane grids = (GridPane) mainView.getCenter();
        for (int i=0; i<getRowCount(grids); i++){
            for (int j=0; j<getColumnCount(grids); j++){
                grids.add(new Button(), i, j);
            }
        }
    }


    private int getRowCount(GridPane pane) {
        int numRows = pane.getRowConstraints().size();
        for (int i = 0; i < pane.getChildren().size(); i++) {
            Node child = pane.getChildren().get(i);
            if (child.isManaged()) {
                Integer rowIndex = GridPane.getRowIndex(child);
                if(rowIndex != null){
                    numRows = Math.max(numRows,rowIndex+1);
                }
            }
        }
        return numRows;
    }

    private int getColumnCount(GridPane pane) {
        int numColumns = pane.getColumnConstraints().size();
        for (int i = 0; i < pane.getChildren().size(); i++) {
            Node child = pane.getChildren().get(i);
            if (child.isManaged()) {
                Integer rowIndex = GridPane.getColumnIndex(child);
                if(rowIndex != null){
                    numColumns = Math.max(numColumns,rowIndex+1);
                }
            }
        }
        return numColumns;
    }



}
