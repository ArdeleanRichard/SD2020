package utcn.sd.WebSocketJavaFXClient.component;

import javafx.scene.control.TextArea;
import org.springframework.stereotype.Component;

@Component
public class ReceivedTextAreaComponent extends TextArea {

    public ReceivedTextAreaComponent() {
        this.setEditable(false);
    }
}
