package com.components;
import java.net.MalformedURLException;

import org.apache.solr.client.solrj.impl.CloudSolrServer;
import org.apache.solr.client.solrj.impl.LBHttpSolrClient;
import org.apache.solr.client.solrj.impl.LBHttpSolrServer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class LbHttpSolr {

	@SuppressWarnings("deprecation")
	LBHttpSolrServer solrServer;
	
	
	
	@Value("${spring.data.solr.zk-host}")
    private String zkHost;
	
	@Value("${solr.host}")
    private String solrHost;
	
	public LbHttpSolr() {
		super();
		this.solrServer = solrServer;
	}
	
	@SuppressWarnings("deprecation")
	@Bean
	public LBHttpSolrServer getLBHttpSolrServer() throws MalformedURLException
	{
		solrServer= new  LBHttpSolrServer("http://10.48.65.201:8001/solr/collection1","http://10.48.65.202:8002/solr/collection1","http://10.48.65.203:8003/solr/collection1","http://10.48.65.204:8004/solr/collection1");
		return solrServer;
	}
	
	
}

