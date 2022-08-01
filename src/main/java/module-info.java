module test.cgpa_cal_1_1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;
    requires java.sql;

    opens test.cgpa_cal_1_1 to javafx.fxml;
    exports test.cgpa_cal_1_1;
}
