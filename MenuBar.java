package GUI;

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class MenuBar {
	private JFrame mainFrame;
	private JLabel headerLabel;
	private JLabel statusLabel;
	private JPanel controlPanel;
	JMenuItem New, Open, Save, Export, Exit;
	JMenuItem Refresh, Undo, Redo, Find, FindNext, FindPrevious;
	JMenuItem  About, Instruction;
	
	public MenuBar() {
		prepareGUI();
	}
	public static void main(String[] args){
			new MenuBar();    
	      
	   }

	private void prepareGUI(){
	      mainFrame = new JFrame("Most frequently used words in a text");
	      mainFrame.setSize(400,400);
	      mainFrame.setLayout(new GridLayout(3, 1));

	      headerLabel = new JLabel("",JLabel.CENTER );
	      statusLabel = new JLabel("",JLabel.CENTER);        

	      statusLabel.setSize(350,100);
	      
	      controlPanel = new JPanel();
	      controlPanel.setLayout(new FlowLayout());

	      mainFrame.add(headerLabel);
	      mainFrame.add(controlPanel);
	      mainFrame.add(statusLabel);
	      
	      final JMenuBar menuBar = new JMenuBar();
	      JMenu fileMenu = new JMenu("File");
	      JMenu editMenu = new JMenu("Edit");
	      JMenu helpMenu = new JMenu("Help");
	      
	      
	      New = new JMenuItem("New");
	      Open = new JMenuItem("Open");
	      Save = new JMenuItem("Save");
	      Export = new JMenuItem("Export");
	      Exit = new JMenuItem("Exit");
	      
	      Refresh = new JMenuItem("Refresh");
	      Undo = new JMenuItem("Undo");
	      Redo = new JMenuItem("Redo");
	      Find = new JMenuItem("Find");
  	      FindNext = new JMenuItem("Find Next");
	      FindPrevious = new JMenuItem("File Previous");
	      
	      About = new JMenuItem("About");
	      Instruction = new JMenuItem("Instruction");
	      
	      
	      fileMenu.add(New);
	      fileMenu.add(Open);	
	      fileMenu.add(Save);
	      fileMenu.add(Export);
	      fileMenu.add(Exit);
	      
	      editMenu.add(Refresh);
	      editMenu.add(Undo);
	      editMenu.add(Redo);
	      editMenu.add(Find);
	      editMenu.add(FindNext);
	      editMenu.add(FindPrevious);
	      
	      helpMenu.add(About);
	      helpMenu.add(Instruction);
	      
	      
	      menuBar.add(fileMenu);
	      menuBar.add(editMenu);
	      menuBar.add(helpMenu);
	     
	      mainFrame.setJMenuBar(menuBar);
	      mainFrame.setLocationRelativeTo(null);
	      
	      mainFrame.setVisible(true);  
	}
	

}