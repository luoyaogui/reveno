package org.reveno.atp.metrics;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConfigurationImpl implements Configuration {

	protected boolean sendToGraphite = false;
	public boolean sendToGraphite() {
		return sendToGraphite;
	}
	@Override
	public Configuration sendToGraphite(boolean sendToGraphite) {
		this.sendToGraphite = sendToGraphite;
		return this;
	}
	
	protected boolean sendToLog = true;
	public boolean sendToLog() {
		return sendToLog;
	}
	@Override
	public Configuration sendToLog(boolean sendToLog) {
		this.sendToLog = sendToLog;
		return this;
	}
	
	protected String graphiteServer;
	public String graphiteServer() {
		return graphiteServer;
	}
	@Override
	public Configuration graphiteServer(String graphiteServer) {
		this.graphiteServer = graphiteServer;
		return this;
	}
	
	protected int graphitePort = 2003;
	public int graphitePort() {
		return graphitePort;
	}
	@Override
	public Configuration graphitePort(int graphitePort) {
		this.graphitePort = graphitePort;
		return this;
	}
	
	protected String instanceName = "default";
	public String instanceName() {
		return instanceName;
	}
	@Override
	public Configuration instanceName(String instanceName) {
		this.instanceName = instanceName;
		return this;
	}
	
	protected String hostName;
	public String hostName() {
		return hostName;
	}
	@Override
	public Configuration hostName(String hostName) {
		this.hostName = hostName;
		return this;
	}
	
	public ConfigurationImpl() {
		try {
			this.hostName = InetAddress.getLocalHost().getHostName();
		} catch (UnknownHostException e) {
			log.error(e.getMessage(), e);
		}
	}
	
	protected static final Logger log = LoggerFactory.getLogger(ConfigurationImpl.class);
	
}