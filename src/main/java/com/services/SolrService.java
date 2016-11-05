package com.services;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;

import org.apache.solr.client.solrj.SolrServerException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.solr.repository.Boost;
import org.springframework.data.solr.repository.Query;
import org.springframework.data.solr.repository.SolrCrudRepository;
import org.springframework.stereotype.Service;

@Service
public interface SolrService 
{
	
	
	public String searchByDetails(String name,String rln_name,String age,String state,String district,String ac, int page_no) throws MalformedURLException, SolrServerException, IOException;
	
	public String searchByEPIC(String EPIC) throws MalformedURLException, SolrServerException, IOException ;
	
	public String familyDetailsSearch(String EPIC) throws MalformedURLException, SolrServerException, IOException ;
	
	
}