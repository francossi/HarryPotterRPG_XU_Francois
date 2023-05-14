module com.example.harrypotterrpg_xu_francois {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.harrypotterrpg_xu_francois to javafx.fxml;
    exports com.example.harrypotterrpg_xu_francois;
}