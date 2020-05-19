package life.view;

import javafx.fxml.FXML;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import life.MainFrame;
import life.model.GamePlay;
import life.model.GameStrategy;

/**
 * Created by miaomuzhi on 2017/10/16.
 */
public class MainController {
    private MainFrame frame;
    private Stage stage;
    private GamePlay gamePlay;

    private Thread timer;

    @FXML
    private GridPane gridPane;


    @FXML
    private void create(){

    }

    @FXML
    private void delete(){

    }

    @FXML
    private void save(){

    }

    @FXML
    private void exit(){

    }

    @FXML
    private void initiate(){
        gamePlay = new GameStrategy();
        timer = new Thread(new Runnable() {
            public void run() {
                try{
                    Thread.sleep(1000);
                } catch (InterruptedException ie) {
                    ie.printStackTrace();
                }
            }
        });

    }

    @FXML
    private void run(){

    }

    @FXML
    private void stop(){

    }

    @FXML
    private void about(){

    }


    public MainFrame getFrame() {
        return frame;
    }

    public void setFrame(MainFrame frame) {
        this.frame = frame;
    }

    public Stage getStage() {
        return stage;
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }
}
