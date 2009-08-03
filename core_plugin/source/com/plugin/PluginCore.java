package com.plugin;


import org.java.plugin.ObjectFactory;
import org.java.plugin.PluginManager;
import org.java.plugin.Plugin;
import org.java.plugin.PluginManager.PluginLocation;
import org.java.plugin.registry.Extension;
import org.java.plugin.registry.ExtensionPoint;
import org.java.plugin.registry.PluginDescriptor;
import org.java.plugin.standard.StandardPluginLocation;
import org.java.plugin.PluginLifecycleException;
import org.java.plugin.util.ExtendedProperties;


import org.java.plugin.Plugin;

public class PluginCore extends Plugin {

	protected void doStart() throws Exception {
		System.out.println("CORE STARTED");		
	}

	protected void doStop() throws Exception {
		System.out.println("CORE ENDED");
	}

}
