package com.shana.elasticsearch;

public interface DataHandler {
	
	/**
	 * 
	 * @param servers
	 * 格式 ip1:port1,ip2:port2
	 */
	public void initServers(String servers);
	
	public Object execute(Command command);


}
