module org.unibl.etf.customs {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.unibl.etf.customs to javafx.fxml;
    exports org.unibl.etf.customs;
}