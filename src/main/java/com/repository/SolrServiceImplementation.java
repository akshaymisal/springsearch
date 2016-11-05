package com.repository;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Map;

import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocumentList;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.components.ERoll;
import com.components.LbHttpSolr;
import com.services.SolrService;

@Repository
public class SolrServiceImplementation implements SolrService {

	@Autowired
	LbHttpSolr solrServer;

	SolrQuery solrQuery;
	QueryResponse response;
	String JSONResponse;
	String JSONDocs;

	@Autowired
	SolrJPAServiceRepository jpaRepository;
	
	@Override
	public String searchByDetails(String name, String rln_name, String age, String state, String district, String ac,
			int page_no) throws MalformedURLException, SolrServerException, IOException {
		
		return getSolrResponse("name:"+name+"^5 OR name_phonetic:"+name, page_no);
		// TODO Auto-generated method stub

	}

	@Override
	public String searchByEPIC(String EPIC) throws MalformedURLException, SolrServerException, IOException {
		// TODO Auto-generated method stub

		return getSolrResponse("epic_no:"+EPIC, 1);
	}

	public String getSolrResponse(String query, int page_no)
			throws MalformedURLException, SolrServerException, IOException {
		solrQuery = new SolrQuery();
		// solrQuery.setQuery("name:"+name+"^5 OR name_phonetic:"+name);
		solrQuery.setQuery(query);
		solrQuery.setStart(10 * (page_no - 1));
		solrQuery.setRows(15);
		solrQuery.setParam("wt", "json");
		response = new QueryResponse();
		response = solrServer.getLBHttpSolrServer().query(solrQuery);

		SolrDocumentList documentList = response.getResults();
		documentList.toString();

		JSONObject jsonData = new JSONObject();
		JSONResponse = "{\"response\":{" + "\"docs\":[";
		
		JSONDocs = "";
		for (Map singleDoc : documentList) {
			JSONDocs = JSONDocs + "," + new JSONObject(singleDoc);
		}
		JSONDocs = JSONDocs.replaceFirst(",", "");
		JSONResponse = JSONResponse + JSONDocs + "]" + "," + "\"numFound\":" + documentList.getNumFound()
				+ ",\"start\":" + documentList.getStart() + "}}";

		return JSONResponse.toString();

	}

	@Override
	public String familyDetailsSearch(String EPIC)
			throws MalformedURLException, SolrServerException, IOException {
		// TODO Auto-generated method stub
		ERoll eroll=jpaRepository.searchEPICDetails(EPIC);
		eroll.toString();
		
		
		return eroll.toString();
	}

	

}
