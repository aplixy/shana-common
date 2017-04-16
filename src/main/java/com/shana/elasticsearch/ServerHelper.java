package com.shana.elasticsearch;

public interface ServerHelper {

	/**
	 * 
	 * @param servers
	 * 格式 ip1:port1,ip2:port2
	 * @throws Exception 
	 */
	public void initServers(String servers) throws Exception;
	
	public Server getOkServer();
	public void feedbackErrorServer(Server server);
	
	/**
	 * 
	 * @param server
	 * 格式 ip:port
	 * @throws Exception 
	 */
	public void feedbackErrorServer(String server) throws Exception;

}
