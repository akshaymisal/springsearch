package com.controllers;


import java.io.IOException;
import java.net.MalformedURLException;

import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.LBHttpSolrServer;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PagedResourcesAssembler;
import org.springframework.hateoas.PagedResources;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.repository.SolrServiceImplementation;
import com.services.SolrService;

@RestController
public class SearchController {

	@Autowired
	SolrService repository;
	
	@Autowired
	SolrServiceImplementation solrService;
	
	
	
	@RequestMapping(value="/search",produces=MediaType.APPLICATION_JSON_VALUE)
	public String  searchbyDetails(@RequestParam(value="name")String name,@RequestParam(value="search_type")String search_type,@RequestParam(value="epic",required=false)String EPIC,@RequestParam(value="page")int page) throws SolrServerException, IOException
	{
		System.out.println("Entered");
		/*Page<ERoll> detailsPage= repository.searchByDetails(name,"","*","*","*","*", new PageRequest(page, 10));
		System.out.println(detailsPage.getContent().toString());*/
		
		if(search_type.equals("details"))
		 return solrService.searchByDetails(name, "*", "*", "*", "*", "*", 1);
		if(search_type.equals("epic"))
			return solrService.searchByEPIC(EPIC);
		if(search_type.equals("familyDetails"))
			return solrService.familyDetailsSearch(EPIC);
		
		return null;
	
		
	}
	
	
}
