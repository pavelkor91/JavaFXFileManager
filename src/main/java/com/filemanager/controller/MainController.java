package com.filemanager.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;


public class MainController implements Initializable{

    @FXML
    private Label labelId;

    @FXML
    private TreeView treeView;

    @FXML
    private CheckBox chekbox;


    @Override
    public void initialize(URL url, ResourceBundle rb) {
//        File[] arrayRoots = File.listRoots();
//        TreeItem<File> rootItem = new TreeItem<>();
//        rootItem.setExpanded(true);
//        for (File root : arrayRoots) {
//            TreeItem<File> item = new TreeItem<>(root);
//            rootItem.getChildren().add(item);
//        }
//        //TreeView<File> tree = new TreeView<> (rootItem);
//        treeView.setRoot(rootItem);
//
//        treeView.setOnMouseClicked(event -> {
//            if(event.getClickCount() > 1){
//                System.out.println(treeView.getSelectionModel().getSelectedItem());
//                TreeItem<File> treeItem = new TreeItem<>();
//
//                //treeView.setCellFactory(param -> treeItem);
//            }
//        });
        TreeItem<File> root = DirectoryController.createNode(new File("E:/"));
        root.setExpanded(true);
        treeView.setRoot(root);
       // return treeView;

//        TreeView<File> treeView2 = new TreeView<>();
//        treeView2 = DirectoryController.buildFileSystemBrowser();
//        treeView.
    }


}
