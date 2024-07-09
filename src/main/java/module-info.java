module com.example.examjavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.examjavafx to javafx.fxml;
    exports com.example.examjavafx;
}