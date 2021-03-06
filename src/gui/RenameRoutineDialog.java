package gui;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class RenameRoutineDialog extends JDialog implements ActionListener {
	
	private static final long serialVersionUID = -2397395850025454800L;
	
	private JTextField fileName;
	private JButton cancelButton;
	private JButton saveButton;
	private JPanel southPanel;
	private JPanel northPanel;
	private JPanel mainPanel;
	
	private File routinesFolder = new File(System.getProperty("user.home") + "/Desktop/Autonomous/");
	
	private Manager manager;
	private String originalName;
	
	public RenameRoutineDialog(Manager manager, String originalName) {
		
		this.manager = manager;
		this.originalName = originalName;
		
		mainPanel = new JPanel();
		getContentPane().add(mainPanel, BorderLayout.CENTER);
		mainPanel.setLayout(new BorderLayout(0, 0));
		
		northPanel = new JPanel();
		northPanel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "New File Name", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK));
		mainPanel.add(northPanel, BorderLayout.NORTH);
		northPanel.setLayout(new BorderLayout(0, 0));
		
		fileName = new JTextField();
		fileName.setText(originalName);
		northPanel.add(fileName);
		fileName.setColumns(10);
		
		southPanel = new JPanel();
		mainPanel.add(southPanel, BorderLayout.SOUTH);
		southPanel.setLayout(new GridLayout(1, 2, 0, 0));
		
		saveButton = new JButton("Save");
		southPanel.add(saveButton);
		
		cancelButton = new JButton("Cancel");
		southPanel.add(cancelButton);
		
		cancelButton.addActionListener(this);
		saveButton.addActionListener(this);
		
		this.pack();
		this.setLocationRelativeTo(null);
		this.setTitle("New Routine");
		this.setAlwaysOnTop(true);
		this.setVisible(true);
		fileName.requestFocus();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		Object src = e.getSource();
		
		if(src == cancelButton){
			
			this.dispose();
			
		}else if(src == saveButton){
			
			File file = new File(routinesFolder.getAbsolutePath()+ "/" + originalName + ".csv");
			File newName = new File(routinesFolder.getAbsolutePath()+ "/" + fileName.getText() + ".csv");
			
			try{
								
				if(newName.exists()){
					
					JDialog dialog = new JDialog();
					
					dialog.setAlwaysOnTop(true);
					
					JOptionPane.showMessageDialog(dialog, "File already exists.", "Can't rename!", JOptionPane.INFORMATION_MESSAGE);
					
					dialog.requestFocus();
					
				}else{
					
					try {
												
						file.renameTo(newName);
						
						manager.rescanFiles(newName.getName().substring(0, newName.getName().lastIndexOf(".csv")));
						
						this.dispose();
						
					} catch (Exception ex) {
						
						
						
					}
					
				}
			
			}catch(Exception ex){
				

				
			}
			
		}
		
	}
	
}
