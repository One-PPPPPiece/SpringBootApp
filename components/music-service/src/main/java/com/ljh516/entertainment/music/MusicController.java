package com.ljh516.entertainment.music;

import com.ljh516.entertainment.music.biz.MusicBO;
import com.ljh516.entertainment.music.db.entity.Music;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MusicController {

    @Autowired MusicBO musicBO;

    private static final Logger log = LoggerFactory.getLogger(MusicController.class);

    @GetMapping(path = "/entertainment/music/all", produces = "application/json")
    public ResponseEntity getAllMusic() {
        log.info("getting all my favourite musics");
        List<Music> musicList = musicBO.getAllMusic();
        Map<String, List<Music>> response = new HashMap<>();
        response.put("GetAllMusicResponse", musicList);
        return ResponseEntity.status(Response.Status.ACCEPTED.getStatusCode()).body(response);
    }
}
