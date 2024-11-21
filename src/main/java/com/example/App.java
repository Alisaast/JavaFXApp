package com.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Установлюємо заголовок вікна
        primaryStage.setTitle("JavaFX: TextField and Button");

        // Створюємо текстове поле
        TextField textField = new TextField();
        textField.setPromptText("Введіть текст тут"); // Підказка в текстовому полі

        // Створюємо кнопку для виводу тексту
        Button displayButton = new Button("Вивести текст");
        displayButton.setOnAction(event -> {
            String inputText = textField.getText();
            System.out.println("Введений текст: " + inputText);
        });

        // Створюємо другу кнопку для очищення текстового поля
        Button clearButton = new Button("Очистити текст");
        clearButton.setOnAction(event -> textField.clear());

        // Додаємо елементи до VBox (розташування елементів вертикально)
        VBox root = new VBox(10); // Відстань між елементами - 10 пікселів
        root.getChildren().addAll(textField, displayButton, clearButton);

        // Створюємо сцену і додаємо до Stage
        Scene scene = new Scene(root, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args); // Запускаємо JavaFX-програму
    }
}