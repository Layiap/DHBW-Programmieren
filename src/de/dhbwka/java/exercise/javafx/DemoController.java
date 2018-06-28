package de.dhbwka.java.exercise.javafx;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class DemoController {

    @FXML
    public Label label;

    @FXML
    public Button button;

    @FXML
    public TableView<FooBar> table;

    @FXML
    private TableColumn<FooBar, String> barcol;

    @FXML
    private TableColumn<FooBar, String> foocol;

    private MyApp2 myApp;

    @FXML
    private void initialize() {
        foocol.setCellValueFactory(data->data.getValue().fooProperty());
        barcol.setCellValueFactory(data->data.getValue().fooProperty());
    }


    public void setMyApp(MyApp2 myApp) {
        this.myApp = myApp;
        table.setItems(myApp.getFoobarList());
    }
}
