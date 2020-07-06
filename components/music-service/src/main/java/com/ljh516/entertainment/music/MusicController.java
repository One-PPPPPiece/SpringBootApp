package com.ljh516.entertainment.music;

import javax.ws.rs.core.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/entertainment/music")
public class MusicController {

    @GetMapping(path = "/music/all")
    public ResponseEntity getAllMusics() {
        return ResponseEntity.status(Response.Status.ACCEPTED.getStatusCode()).body("Music Body");
    }
}
