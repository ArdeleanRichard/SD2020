package utcn.sd.WebSocketJavaFXClient.component;

import javafx.scene.control.TextArea;
import org.springframework.stereotype.Component;

@Component
public class SentTextAreaComponent extends TextArea {

    public SentTextAreaComponent() {
        this.setEditable(false);
    }
}
