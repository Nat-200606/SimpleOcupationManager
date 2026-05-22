import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.IOException;

public class FrameBase extends JFrame implements ActionListener{
    JButton[][] matriz = new JButton[3][5];
    JLabel primeiro;
    JLabel segundo;
    JLabel terceiro;
    int x = 0;
    int y = 0;
    FrameBase() throws IOException, FontFormatException {

        Font font = Font.createFont(Font.TRUETYPE_FONT, new File("Minecraft.ttf")).deriveFont(20f);

        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(Color.DARK_GRAY);
        this.setResizable(false);
        this.setTitle("Matriz");
        this.setLocation(360, 40);
        this.setSize(860, 400);

        JPanel panel = new JPanel(new GridLayout(3,5,20,20));
        panel.setBounds(120,40,700,300);
        panel.setOpaque(false);

        for (y = 0; y < 5; y++){

            for (x = 0; x < 3; x++){
                matriz[x][y] = new JButton("Livre");
                matriz[x][y].setFont(font);
                matriz[x][y].setForeground(Color.BLACK);
                matriz[x][y].setBackground(Color.BLUE);
                matriz[x][y].setOpaque(true);
                matriz[x][y].setHorizontalAlignment(SwingConstants.CENTER);
                matriz[x][y].addActionListener(this);
                matriz[x][y].setFocusable(false);
                panel.add(matriz[x][y]);
            }
        }
        x = 0;
        y = 0;

        primeiro = new JLabel("Primeiro");
        primeiro.setBounds(20,60,100,50);
        primeiro.setFont(font);
        primeiro.setForeground(Color.BLACK);

        segundo = new JLabel("segundo");
        segundo.setBounds(20,160,100,50);
        segundo.setFont(font);
        segundo.setForeground(Color.BLACK);

        terceiro = new JLabel("Terceiro");
        terceiro.setBounds(20,260,100,50);
        terceiro.setFont(font);
        terceiro.setForeground(Color.BLACK);

        this.add(terceiro);
        this.add(segundo);
        this.add(primeiro);
        this.add(panel);
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton src = (JButton) e.getSource();
        if (src.getText().equals("Livre")){
            src.setText("Ocupado");
            src.setBackground(Color.RED);
        }else {
            src.setText("Livre");
            src.setBackground(Color.BLUE);
        }
    }


}
