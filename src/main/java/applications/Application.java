package applications;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.solr.repository.config.EnableSolrRepositories;

@SpringBootApplication
@EnableSolrRepositories("com.repository")
@ComponentScan(basePackages={"com.config","com.services","com.repository","com.controllers","com.components"})

public class Application implements CommandLineRunner {

	public final static Logger log = LoggerFactory.getLogger(Application.class);
	

	public static void main(String args[]) {
		SpringApplication.run(Application.class);
		System.out.println("Writing for JPA");
	
		// System.out.println(repository.findByName("akshay"));
	}


	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}

	/*@Override
	public void run(String... args) throws Exception {
		log.info("started");
		System.out.println("started");	
		
	//	System.out.println(repository.findOne("S220550293010669").toString());
		Page<ERoll> detailsPage=repository.searchByDetails("akshay","","*","Maharashtra","Nagpur","Ramtek", new PageRequest(0, 10));
		System.out.println(detailsPage.getContent().toString());
		
		Page<ERoll> epicPage=repository.searchByEPIC("ZFV5786629", "*", new PageRequest(0, 10));
		System.out.println(epicPage.getContent().toString());
		log.info("ended");
		System.out.println("ended");	
	};*/
}