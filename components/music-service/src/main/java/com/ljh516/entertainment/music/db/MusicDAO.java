package com.ljh516.entertainment.music.db;

import com.ljh516.entertainment.music.db.entity.Music;
import com.ljh516.entertainment.music.db.entity.MusicRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MusicDAO {

    @Autowired
    MusicRepository musicRepository;

    private static final Logger log = LoggerFactory.getLogger(MusicDAO.class);

    public List<Music> getAllMusics() {
        
    }

}
