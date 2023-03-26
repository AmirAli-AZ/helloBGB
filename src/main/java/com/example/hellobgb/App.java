package com.example.hellobgb;

import com.bgbrowser.extensionframework.BGBApplication;
import com.bgbrowser.extensionframework.Browser;
import javafx.application.Platform;
import javafx.scene.control.Alert;

public class App extends BGBApplication {

    @Override
    public void initialize(Browser browser) {
        Platform.runLater(() -> {
            new Alert(Alert.AlertType.INFORMATION, "hello, this is a bgb extension example").show();
        });
    }
}
