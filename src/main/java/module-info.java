module ca.ucalgary.anhnguyen.basiccalculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens basiccalculator to javafx.fxml;
    exports basiccalculator;
}