module edu.farmingdale.csc325_introproj {
    requires javafx.controls;
    requires javafx.fxml;


    opens edu.farmingdale.csc325_introproj to javafx.fxml;
    exports edu.farmingdale.csc325_introproj;
}