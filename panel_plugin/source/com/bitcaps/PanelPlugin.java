package com.bitcaps;

import org.java.plugin.Plugin;

import antipasto.Plugins.Api.*;
import antipasto.Plugins.*;

import java.awt.*; 
import javax.swing.*; 
import java.util.*;
import java.awt.event.*;

public class PanelPlugin extends PluginBase implements IPluginSection{
	
	public JLabel statuslabel;
	public JButton closeme;

	EditorApi __api = new EditorApi ();

	protected void doStart() throws Exception {
		System.out.println("PANEL STARTED");
		initPanel();
	}

	protected void doStop() throws Exception {
		System.out.println("PANEL ENDED");		
	} 

	protected void postInit()
	{
		System.out.println("POST INIT");
	}

	public void handleEvent(EventObject event){
		System.out.println("HANDLED:"+event.toString());
	}

	void initPanel(){
		JFrame jf = new JFrame("I am a Plugin");
		jf.setLayout(new FlowLayout());
		statuslabel = new JLabel("Super Basic Plug using API ...");
		jf.add(statuslabel); 

		closeme = new JButton("close main app");
		ActionListener al = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			            __api.exit();
			}
      		};

		closeme.addActionListener(al);

		jf.add(closeme); 


		jf.setSize(300,100);
		//pack();
		jf.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		jf.setVisible(true);

		jf.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				__api.exit();
			}
		});	
	}
	
}
