package com.example.hellobgb;

import com.bgbrowser.extensionframework.BGBApplication;
import com.bgbrowser.extensionframework.Browser;
import javafx.scene.control.Alert;

public class App implements BGBApplication {

    @Override
    public void initialize(Browser browser) {
        new Alert(Alert.AlertType.INFORMATION, "hello, this is a bgb extension example").show();
    }

    @Override
    public void onDestroyed() {
        System.out.println("extension destroyed");
    }
}
