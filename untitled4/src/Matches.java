import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
/*
class MyMouse extends JFrame
{
    JLabel lbl = new JLabel("");
    public MyMouse()
    {
        super("Dude! Where's my mouse ?");
        setSize(400,400);
        setLayout(new BorderLayout());
        add(lbl,BorderLayout.SOUTH);
        addMouseListener(new MouseListener()
        {
            public void mouseExited(MouseEvent a){}
            public void mouseClicked(org.w3c.dom.events.MouseEvent a)
            {
                lbl.setText("X="+a.getX()+" Y="+a.getY());
            }
            public void mouseEntered(MouseEvent a) {}
            public void mouseReleased(MouseEvent a) {}
            public void mousePressed(MouseEvent a) {}
        });
    }
    */
class LabExample extends JFrame
{
    Font fnt = new Font("Times new roman",Font.BOLD,20);
    int milan = 0;
    int rm =0;
    JButton but1 = new JButton("AC Milan");
    JButton but2 = new JButton("Real Madrid");
    JLabel lbl = new JLabel("Result: 0 X 0");
    JLabel lbl2 = new JLabel("Last Scorer: N/A");
    Label win = new Label("Winner: ");
    Dimension labelSize = new Dimension(150, 20);
    Border solidBorder = BorderFactory.createLineBorder(Color.BLACK, 1);
    LabExample()
    {
        super("Matches");
        setLayout(new FlowLayout());

        setSize(600,200);
        add(but1);
        add(but2);
        lbl.setVerticalAlignment(JLabel.BOTTOM);
        lbl.setHorizontalAlignment(JLabel.CENTER);
        lbl.setPreferredSize(labelSize);
        lbl.setBorder(solidBorder);
        lbl.setForeground(Color.RED);
        lbl2.setVerticalAlignment(JLabel.BOTTOM);
        lbl2.setHorizontalAlignment(JLabel.CENTER);
        lbl2.setPreferredSize(labelSize);
        lbl2.setBorder(solidBorder);
        lbl2.setForeground(Color.BLUE);
        win.setForeground(Color.BLACK);
        win.setFont(fnt);
        add(lbl);
        add(lbl2);
        add(win);
        but1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                milan+=1;
                lbl.setText("Result:"+Integer.toString(milan)+"X"+Integer.toString(rm));
                lbl2.setText("Last Scorer: AC Milan");
                if(milan>rm)
                    win.setText("Winner: AC Milan");
                else if(rm>milan) win.setText("Winner: Real Madrid");

            }
        });
        but2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rm+=1;
                lbl.setText("Result:"+Integer.toString(milan)+"X"+Integer.toString(rm));
                lbl2.setText("Last Scorer: Real Madrid");
                if(milan>rm)
                    win.setText("Winner: AC Milan");
                else if(rm>milan) win.setText("Winner: Real Madrid");
            }
        });


        setVisible(true);
    }

}

public class Matches {
    public static void main(String[]args)
    {
        new LabExample();
    }
}
