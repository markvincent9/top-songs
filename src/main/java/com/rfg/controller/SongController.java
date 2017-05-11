package com.rfg.controller;

import com.rfg.dao.SongsDao;
import com.rfg.model.SongsSearchResult;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.print.attribute.standard.Media;
import java.util.List;

/**
 * Created by markvincent9 on 4/26/17.
 */

@RestController
@RequestMapping("/songs")
public class SongController {
    
    @Autowired
    private SongsDao songsDao;
    
    @RequestMapping(method = RequestMethod.GET)
    public String search(@RequestParam(required = true, value = "q") String query,
            @RequestParam(value = "start") Long start){
        return songsDao.search(query, start).toString();
    }
}
