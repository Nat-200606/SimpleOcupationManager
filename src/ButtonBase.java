import javax.swing.*;
import java.awt.*;

public class ButtonBase extends JButton {
    ButtonBase(String text){
        ImageIcon button = new ImageIcon("button.png");
        ImageIcon buttonPressed = new ImageIcon("button_pressed.png");
        this.setIcon(button);
        this.setPressedIcon(buttonPressed);

        this.setBorderPainted(false);
        this.setHorizontalAlignment(CENTER);
        this.setHorizontalTextPosition(CENTER);
        this.setBackground(null);
        this.setText(text);
        this.setForeground(Color.BLACK);
        this.setBounds(190,170,260,115);
        this.setFocusable(false);
        this.setContentAreaFilled(false);
    }
}
