package com.shana.elasticsearch;

import java.util.ArrayList;
import java.util.List;

import org.springframework.util.StringUtils;

import com.shana.exception.ShanaException;
import com.shana.exception.ShanaInputParameterIsNullException;

public class ServerHelperImpl implements ServerHelper {
	private List<Server> serverList = new ArrayList<Server>();
	private List<Server> okServerList = new ArrayList<Server>();
	private ServerGetStrategy serverGetStrategy;

	@Override
	public void initServers(String servers) throws Exception {

		if (StringUtils.isEmpty(servers)) {
			throw new ShanaInputParameterIsNullException(servers);
		}

		if (serverList.size() > 0) {
			throw new ShanaException("init_has_done", "The init has done.", null);
		}
		String[] serverArray = servers.split(",");
		Server server = null;
		for (String serverHostIp : serverArray) {
			if (null == serverHostIp || serverHostIp.trim().isEmpty()) {
				throw new ShanaException("input_is_invalid",
						"The input servers is invalid,which value is " + servers + ".", null);
			}
			serverHostIp = serverHostIp.trim();
			String[] items = serverHostIp.split(":");
			if (items.length < 2)
				throw new ShanaException("input_is_invalid",
						"The input servers is invalid,which value is " + servers + ".", null);
			String host = items[0];
			if (null == host || host.trim().isEmpty()) {
				throw new ShanaException("input_is_invalid",
						"The input servers is invalid,which value is " + servers + ".", null);
			}
			Integer port = Integer.parseInt(items[1]);
			server = new Server();
			server.setHost(host);
			server.setPort(port);
			serverList.add(server);
		}
		okServerList.addAll(serverList);
	}

	@Override
	public Server getOkServer() {

		return serverGetStrategy.getServer(okServerList);
	}

	@Override
	public void feedbackErrorServer(Server server) {
		okServerList.forEach(okServer -> {
			if (okServer.getHost().equals(server.getHost()) && okServer.getPort() == server.getPort())
				okServerList.remove(okServer);
		});
	}

	@Override
	public void feedbackErrorServer(String server) throws Exception {
		if (null == server || server.trim().isEmpty()) {
			throw new ShanaException("input_is_invalid",
					"The input server is invalid,which value is " + server + ".", null);
		}
		server = server.trim();
		String[] items = server.split(":");
		if (items.length < 2)
			throw new ShanaException("input_is_invalid",
					"The input server is invalid,which value is " + server + ".", null);
		String host = items[0];
		if (null == host || host.trim().isEmpty()) {
			throw new ShanaException("input_is_invalid",
					"The input server is invalid,which value is " + server + ".", null);
		}
		Integer port = Integer.parseInt(items[1]);
		okServerList.forEach(okServer -> {
			if (okServer.getHost().equals(host) && okServer.getPort() == port)
				okServerList.remove(okServer);
		});
	}

}
