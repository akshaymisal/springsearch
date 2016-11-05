package com.repository;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;

import org.apache.solr.client.solrj.SolrServerException;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.solr.repository.Boost;
import org.springframework.data.solr.repository.Query;
import org.springframework.data.solr.repository.SolrCrudRepository;
import org.springframework.stereotype.Repository;


import com.components.ERoll;

@Repository
public interface SolrJPAServiceRepository extends SolrCrudRepository<ERoll, String>
{
	
	/*@Query("name:?0 AND rln_name:*?1* AND age:?2 AND state:?3 AND district:?4 AND ac_name:?5" )
	Page<ERoll> searchByDetails(@Boost(2) String name,String rln_name,String age,String state,String district,String ac, Pageable pageable);
	*/
	/*@Query("epic_no:?0 AND state:?1")
	Page<ERoll> searchByEPIC(@Boost(2) String EPIC,String state,Pageable pageable);*/
	
	@Query("epic_no:?0")
	public ERoll searchEPICDetails(String EPIC);
}