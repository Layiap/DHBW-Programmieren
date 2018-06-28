package de.dhbwka.java.exercise.javafx;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class MyApp2 extends Application{

    private Stage primaryStage;
    private BorderPane rootLayout;

    private ObservableList<FooBar> foobarList = FXCollections.observableArrayList();

    @Override
    public void init() {
        //super.init();

        foobarList.add(new FooBar("Lorem", "ipsum"));
        foobarList.add(new FooBar("kjrwafnr", "ewafwaerf"));
        foobarList.add(new FooBar("wreafrewgf", "ipsafrgfrum"));
        foobarList.add(new FooBar("arewgfre", "ipsd3fdeum"));
        foobarList.add(new FooBar("Lfeewafworem", "ipsufefawrm"));
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("test123");

        showRootLayout();

        showDemoView();
    }

    private void showDemoView() {

        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("DemoView.fxml"));

            AnchorPane anchorPane = loader.load();

            DemoController dc = loader.getController();
            dc.setMyApp(this);

            rootLayout.setCenter(anchorPane);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void showRootLayout() {
        BorderPane root = null;

        try {
            root = FXMLLoader.load(getClass().getResource("RootLayout.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        Scene scene = new Scene(root);

        primaryStage.setScene(scene);
        primaryStage.show();

        rootLayout = root;
    }

    public ObservableList<FooBar> getFoobarList() {
        return foobarList;
    }

    public static void main(String[] args) {
        Application.launch(args);
    }

}
