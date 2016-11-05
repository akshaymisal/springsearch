package com.config;

import java.net.MalformedURLException;

import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.impl.CloudSolrClient;
import org.apache.solr.client.solrj.impl.LBHttpSolrServer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.solr.core.SolrTemplate;
import org.springframework.data.solr.repository.config.EnableSolrRepositories;

import com.components.LbHttpSolr;

@Configuration
public class SpringSolrConfig {
   /* @Value("${spring.data.solr.zk-host}")
    private String zkHost;*/
    @Bean
    public LBHttpSolrServer solrClient() throws MalformedURLException {
    	/*CloudSolrClient solrClient=new CloudSolrClient(zkHost);
    	solrClient.setDefaultCollection("collection1");*/
    	
        return new LbHttpSolr().getLBHttpSolrServer();
    }
    @Bean
    public SolrTemplate solrTemplate(@SuppressWarnings("deprecation") LBHttpSolrServer solrClient) throws Exception {
        return new SolrTemplate(solrClient);
    }
}