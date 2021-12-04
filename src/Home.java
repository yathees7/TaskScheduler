import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
import java.awt.event.*;

public class Home{
	
	public Home(){
		
		JFrame frame = new JFrame(); 
		 
        JMenuBar menuBar = new JMenuBar();
        menuBar.setBackground(new Color(205,182,93));
        menuBar.setLayout(new GridLayout());
        
        Font big = new Font("Serif", Font.BOLD, 17);
        
        JButton homeBar = new JButton("Home");
        JButton dashBoard = new JButton("Dashboard");
        JButton vesselAgent = new JButton("Vessel Agent");
        JButton vesselAgentUpdation = new JButton("Vessel Agent Updation");
        JButton aboutUs = new JButton("About Us");
        JButton contact = new JButton("Contact");
        
        homeBar.setFont(big);
        dashBoard.setFont(big);       
        vesselAgent.setFont(big);       
        vesselAgentUpdation.setFont(big);
        aboutUs.setFont(big);
        contact.setFont(big);
        
        
        homeBar.setBackground(new Color(205,182,93));
        homeBar.setForeground(new Color(171,49,9));
        dashBoard.setBackground(new Color(205,182,93));
        dashBoard.setForeground(new Color(171,49,9));
        vesselAgent.setBackground(new Color(205,182,93));
        vesselAgent.setForeground(new Color(171,49,9));
        vesselAgentUpdation.setBackground(new Color(205,182,93));
        vesselAgentUpdation.setForeground(new Color(171,49,9));
        aboutUs.setBackground(new Color(205,182,93));
        aboutUs.setForeground(new Color(171,49,9));
        contact.setBackground(new Color(205,182,93));
        contact.setForeground(new Color(171,49,9));
        
        JLabel label1 = new JLabel("1. At present, Adani operates more than 45 Berths PAN India and approximately 4000 Vessels calling"
        		+ "at our Port.");
        JLabel label2 = new JLabel("2. The vessel agents share the ETA by which Port Authorities manage the resource and estimates"
        		+ "the TAT.");
        JLabel label3 = new JLabel("3. Vessel TAT are dependent on various Factors like the productivity, resource allocated, Tide etc.");
        JLabel label4 = new JLabel("4. The solution should be such that the Port Authorities are able to effectively predict the Optimum");
        JLabel label5 = new JLabel("TAT which yields maximum revenue by clearly optimizing the resources used.");
        JLabel label6 = new JLabel("");
        label1.setBounds(20,100,1500,100);
        label2.setBounds(20,150,1500,100);
        label3.setBounds(20,200,1500,100);
        label4.setBounds(20,250,1500,100);
        label5.setBounds(20,300,1500,100);
        label6.setBounds(20,350,1500,100);
        
        JTable table = new JTable();
        
 
        String column[]={"SI.NO","Vessel ID","Estimated Time of Arrival","Allocated Berth","Update"}; 
        DefaultTableModel daDefaultTableModel = new DefaultTableModel(0,0);
        daDefaultTableModel.setColumnIdentifiers(column);
        daDefaultTableModel.addRow(new Object[] {"01","Test2","Test3"});
        daDefaultTableModel.addRow(new Object[] {"02","Test2","Test3"});
        daDefaultTableModel.addRow(new Object[] {"03","Test2","Test3"});
        daDefaultTableModel.addRow(new Object[] {"04","Test2","Test3"});
        daDefaultTableModel.addRow(new Object[] {"05","Test2","Test3"});
        daDefaultTableModel.addRow(new Object[] {"06","Test2","Test3"});
        daDefaultTableModel.addRow(new Object[] {"07","Test2","Test3"});
        daDefaultTableModel.addRow(new Object[] {"08","Test2","Test3"});
        daDefaultTableModel.addRow(new Object[] {"09","Test2","Test3"});
        daDefaultTableModel.addRow(new Object[] {"10","Test2","Test3"});
        daDefaultTableModel.addRow(new Object[] {"11","Test2","Test3"});
        daDefaultTableModel.addRow(new Object[] {"12","Test2","Test3"});
        daDefaultTableModel.addRow(new Object[] {"13","Test2","Test3"});
        daDefaultTableModel.addRow(new Object[] {"14","Test2","Test3"});
        daDefaultTableModel.addRow(new Object[] {"15","Test2","Test3"});
        table.setModel(daDefaultTableModel);

        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(700, 150, 750, 212);
        frame.getContentPane().add(scrollPane);
        
        frame.add(menuBar);
        frame.add(label1);
        frame.add(label2);
        frame.add(label3);
        frame.add(label4);
        frame.add(label5);
        frame.add(label6);
 
              
        menuBar.add(homeBar);
        menuBar.add(dashBoard);
        menuBar.add(vesselAgent);
        menuBar.add(vesselAgentUpdation);
        menuBar.add(aboutUs);
        menuBar.add(contact);
        menuBar.add(Box.createRigidArea(new Dimension(100,50)));
        
            
        frame.setTitle("Home");
        frame.setSize(600,600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setJMenuBar(menuBar);
        frame.getContentPane().setBackground(new Color(239,228,183));
      
        homeBar.addActionListener(new ActionListener() {
        	@Override
        	public void actionPerformed(ActionEvent e) {
        		new Home();
        		
        	}
        });
        
        dashBoard.addActionListener(new ActionListener() {
        	@Override
        	public void actionPerformed(ActionEvent e) {
        		new DashBoard();
        		
        	}
        });
        
        vesselAgent.addActionListener(new ActionListener() {
        	@Override
        	public void actionPerformed(ActionEvent e) {
        		new VesselAgent();
        		
        	}
        });
        
        vesselAgentUpdation.addActionListener(new ActionListener() {
        	@Override
        	public void actionPerformed(ActionEvent e) {
        		new VesselAgentUpdation();
        		
        	}
        });
        
        aboutUs.addActionListener(new ActionListener() {
        	@Override
        	public void actionPerformed(ActionEvent e) {
        		new AboutUs();
        		
        	}
        });
        
        contact.addActionListener(new ActionListener() {
        	@Override
        	public void actionPerformed(ActionEvent e) {
        		new Contact();
        		
        	}
        });

	}

	public static void main(String[] args){	 
       new Home();	 
	}


}
