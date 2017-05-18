package org.huajistudio.chessmaster;

import net.hakugyokurou.aeb.EventBus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ro.fortsoft.pf4j.JarPluginManager;
import ro.fortsoft.pf4j.PluginManager;

public class ChessMaster {
	private static final Logger LOGGER = LoggerFactory.getLogger("ChessMaster");
	private static final PluginManager PLUGIN_MANAGER = new JarPluginManager();
	private static final EventBus EVENT_BUS = new EventBus("ChessMaster");

	static {
		PLUGIN_MANAGER.loadPlugins();
		PLUGIN_MANAGER.startPlugins();
	}

	public static Logger getLogger() {
		return LOGGER;
	}

	public static PluginManager getPluginManager() {
		return PLUGIN_MANAGER;
	}

	public static EventBus getEventBus() {
		return EVENT_BUS;
	}

	public static void postEvent(Object event) {
		EVENT_BUS.post(event);
	}
}