package com.ljh516.entertainment.music;

import javax.ws.rs.core.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/music")
public class MusicController {

    Logger log = LoggerFactory.getLogger(MusicController.class);

    @GetMapping(path = "/music/all", produces = "application/json")
    public ResponseEntity getAllMusic() {
        log.info("inside getAllMusic");
        return ResponseEntity.status(Response.Status.ACCEPTED.getStatusCode()).body("Music Body");
    }
}
