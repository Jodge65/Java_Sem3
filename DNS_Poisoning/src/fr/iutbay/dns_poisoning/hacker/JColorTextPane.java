package fr.iutbay.dns_poisoning.hacker;

import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;
import javax.swing.text.StyledDocument;
import javax.swing.text.html.HTMLEditorKit;

/**
 * Free of use.
 * 
 * @author pctronique
 * @URL https://openclassrooms.com/forum/sujet/texte-de-differentes-couleurs-jtextpane
 */
public class JColorTextPane extends JTextPane 
{

	private StringBuilder sb = new StringBuilder();
	private Color defColor = Color.BLACK;
	private String defColorHTML = "black";
	private StyledDocument doc;
	private Style style;

	public void styleHTML() 
	{
		this.setContentType("text/HTML");
		this.setEditorKit(new HTMLEditorKit());
	}

	public void styleDoc() 
	{
		doc = this.getStyledDocument();
		
		style = this.addStyle(null, null);
	}

	public void setDefColor(Color c) 
	{
		defColor = c;
	}

	public Color getDefColor() 
	{
		return defColor;
	}

	public void setDefColorHTML(String colorHTML) 
	{
		defColorHTML = colorHTML;
	}

	public String getDefColorHTML() 
	{
		return defColorHTML;
	}

	public void append(String msg) 
	{
		append(msg, defColor);
	}

	public void append(String msg, Color c) 
	{
		StyleContext sc = StyleContext.getDefaultStyleContext();
		AttributeSet aset = sc.addAttribute(SimpleAttributeSet.EMPTY,
				StyleConstants.Foreground, c);

		setCaretPosition(getDocument().getLength());
		setCharacterAttributes(aset, false);
		replaceSelection(msg);
	}

	public void appendHTML(String msg) 
	{
		appendHTML(msg, defColorHTML);
	}

	public void appendHTML(String msg, String colorHTML) 
	{
		sb.append("<font color=\"");
		sb.append(colorHTML);
		sb.append("\">");
		sb.append(msg);
		sb.append("</font>");
		setText(sb.toString());
	}

	public void appendDoc(String msg) 
	{
		appendDoc(msg, defColor);
	}

	public void appendDoc(String msg, Color c) 
	{
		StyleConstants.setForeground(style, c);
		try{doc.insertString(doc.getLength(), msg, style);}
		catch (BadLocationException e){}
		setCaretPosition(getDocument().getLength());
	}
}