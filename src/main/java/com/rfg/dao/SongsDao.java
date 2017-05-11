package com.rfg.dao;

import com.marklogic.client.document.GenericDocumentManager;
import com.marklogic.client.document.JSONDocumentManager;
import com.marklogic.client.document.XMLDocumentManager;
import com.marklogic.client.io.*;
import com.marklogic.client.query.MatchDocumentSummary;
import com.marklogic.client.query.QueryManager;
import com.marklogic.client.query.StringQueryDefinition;
import com.rfg.model.SongsSearchResult;
import com.rfg.model.TopSong;
import org.json.JSONObject;
import org.json.XML;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.w3c.dom.Document;

import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by markvincent9 on 4/25/17.
 */

@Repository
public class SongsDao {

    @Autowired
    private QueryManager queryManager;

    public JSONObject search(String query, Long start){
        StringQueryDefinition queryDef = queryManager
                .newStringDefinition("top-songs-search-opt");
        
        queryDef.setCriteria(query);
        String result = "";
        if(start == null) {
            result = queryManager.search(queryDef, new StringHandle()).get();
        } else {
            result = queryManager.search(queryDef, new StringHandle(), start).get();
        }
        
        return XML.toJSONObject(result);
    }
    

}
