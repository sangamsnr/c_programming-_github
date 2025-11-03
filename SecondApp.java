import java.awt.*;

public class SecondApp {
    SecondApp(){
        Frame fr = new Frame();
        fr.setLayout(null);

        Button b = new Button ("submit");
        b.setBounds(200, 300,200, 300);

        fr.add(b);

        fr.setVisible(true);

    }
}
