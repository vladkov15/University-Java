package com.example.demo3;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class HelloController {
    public TextField loginField;
    public ChoiceBox first;
    public ChoiceBox second;
    public ChoiceBox third;
    public CheckBox chesse;
    public CheckBox ketchup;
    public CheckBox garchisa;
    public Button order;
    int Orders = 0;

    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    void initialize(){
        first.getItems().add("BigMack");
        first.getItems().add("Chiken-Nagetsi");
        first.getItems().add("secret ot shevpovara");

        second.getItems().add("Картошка free");
        second.getItems().add("Картошка po-kolshoznomy");

        third.getItems().add("Black giga");
        third.getItems().add("Yellow giga");
        third.getItems().add("No-color giga");

        order.setOnAction(event -> {
                String login = loginField.getText();
                String selected1 = (String) first.getSelectionModel().getSelectedItem();
                String selected2 = (String) second.getSelectionModel().getSelectedItem();
                String selected3 = (String)third.getSelectionModel().getSelectedItem();
                String sous1 = "";
                String sous2 = "";
                String sous3 = "";
                if(ketchup.isSelected()) {
                    sous1 = ketchup.getText();
                }
                if (chesse.isSelected()){
                    sous2 = ketchup.getText();
                }
                if (garchisa.isSelected()){
                    sous3 = garchisa.getText();
                }

                if (hasUsers(login)){
                    userExist();
                }else{
                    Orders++;
                    writeToFile(login,selected1,selected2,selected3,sous1,sous2,sous3,Orders);
                    NumberOfOrder(Orders);
                    Stage stage = (Stage) order.getScene().getWindow();
                    stage.close();
                }

        });
    }

    private void writeToFile(String login,String selected1,String selected2, String selected3,String sous1,String sous2,String sous3,int Order) {
        try(FileWriter writer = new FileWriter("orders.txt", true))
        {

            writer.write(login + "+" + selected1+ "+" + selected2 + "+" + selected3+"+"+sous1+"+"+sous2+"+"+sous2+" Номер заказа"+Order);

            // запись по символам
            writer.append('\n');

            writer.flush();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }

    private boolean hasUsers(String login) {
        boolean answer = false;
        try {
            //FileWriter writer = new FileWriter("users.txt", true);
            File file = new File("orders.txt");
            //создаем объект FileReader для объекта File
            FileReader fr = new FileReader(file);
            //создаем BufferedReader с существующего FileReader для построчного считывания
            BufferedReader reader = new BufferedReader(fr);
            // считаем сначала первую строку
            List<String[]> row = new ArrayList<String[]>();

            String line = reader.readLine();

            while (line != null) {
                row.add(line.split("\\+"));
                if (Objects.equals(row.get(0)[0], login)){
                    return true;
                }
                row.clear();
                //System.out.println(line);
                // считываем остальные строки в цикле
                line = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return answer;
    }

    void userExist(){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText(null);
        alert.setContentText("Пользователь с таким логином уже существует");

        alert.showAndWait();
    }
    void NumberOfOrder(int order){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("номер заказа: "+order);
    }
}