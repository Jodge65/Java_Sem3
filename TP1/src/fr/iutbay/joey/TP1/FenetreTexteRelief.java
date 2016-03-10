package fr.iutbay.joey.TP1;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Point;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

public class FenetreTexteRelief extends JFrame
{
	/**	*/
	private static final long serialVersionUID = 1L;
	/** Image de fond */
    private JLayeredPane layeredPane;
    private JLabel text;
    
	public FenetreTexteRelief (String texte)
	{
		super(texte);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		FlowLayout placeur = new FlowLayout(FlowLayout.CENTER, 2, 2);
		getContentPane().setLayout(placeur);

		
		/*text = new JLabel();
		Graphics zone = text.getGraphics();
        for (int i = 0; i < 3; i++) 
        {
            if(i%2 == 0)
            	zone.setColor(Color.black);
            else
            	zone.setColor(Color.gray);
    		zone.drawString(texte, 2, 2);

        }*/
		
		
        layeredPane = new JLayeredPane();
        layeredPane.setPreferredSize(new Dimension(texte.length()*20, 200));

        Point origin = new Point(5, 5);
        int offset = 2;

        for (int i = 0; i < 3; i++) 
        {
            JLabel label =  createLabel(texte, origin);
            Font font = new Font("Times", Font.BOLD, 33);
            label.setFont(font);
            if(i%2 == 0)
            	label.setForeground(Color.black);
            else
            	label.setForeground(Color.gray);
            layeredPane.add(label, new Integer(i));
            origin.x += offset;	
            origin.y += offset;
        }
		

        add(layeredPane);


		pack();
		setVisible(true);
	}
	
    private JLabel createLabel(String text, Point origin) 
    {
		JLabel label = new JLabel(text);
		label.setVerticalAlignment(JLabel.TOP);
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setOpaque(false);
		label.setBounds(origin.x, origin.y, text.length()*20, 55);
		return label;
	}
}
