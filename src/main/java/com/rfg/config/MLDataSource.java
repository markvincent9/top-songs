package com.rfg.config;

import com.marklogic.client.DatabaseClient;
import com.marklogic.client.DatabaseClientFactory;
import com.marklogic.client.document.GenericDocumentManager;
import com.marklogic.client.document.JSONDocumentManager;
import com.marklogic.client.document.XMLDocumentManager;
import com.marklogic.client.query.QueryManager;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by markvincent9 on 4/25/17.
 */

@Configuration
public class MLDataSource {

    @Value("${marklogic.host}")
    private String host;

    @Value("${marklogic.port}")
    private int port;

    @Value("${marklogic.user}")
    private String username;

    @Value("${marklogic.password}")
    private String password;


    @Bean
    public DatabaseClient getDatabaseClient() {
        return DatabaseClientFactory.newClient(host, port, username, password,
                DatabaseClientFactory.Authentication.DIGEST);
    }

    @Bean
    public QueryManager getQueryManager() {
        return getDatabaseClient().newQueryManager();
    }

    @Bean
    public JSONDocumentManager getJSONDocumentManager() {
        return getDatabaseClient().newJSONDocumentManager();
    }

    @Bean
    public XMLDocumentManager getXMLDocumentManager() {
        return getDatabaseClient().newXMLDocumentManager();
    }

    @Bean
    public GenericDocumentManager getGenericDocumentManager() {
        return getDatabaseClient().newDocumentManager();
    }
}
