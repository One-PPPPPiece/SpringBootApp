package com.ljh516.entertainment.music;

import com.ljh516.entertainment.music.biz.MusicBO;
import com.ljh516.entertainment.music.db.entity.Music;
import com.ljh516.entertainment.music.intf.CreateMusicRequest;
import com.ljh516.entertainment.music.validator.MusicRequestValidator;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.validation.Valid;
import javax.ws.rs.core.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@Api(
        value = "Music",
        tags = {"Music"})
@RestController
public class MusicController {

    @Autowired MusicBO musicBO;
    @Autowired MusicRequestValidator validator;

    private static final Logger log = LoggerFactory.getLogger(MusicController.class);

    @ApiOperation(value = "Create a music", notes = "Create a music", produces = "application/json")
    @ApiResponses(
            value = {
                @ApiResponse(code = 201, message = "Success creating music"),
                @ApiResponse(code = 400, message = "Failed creating music")
            })
    @PostMapping(
            path = "/entertainment/music",
            consumes = "application/json",
            produces = "application/json")
    public ResponseEntity createMusic(@Valid @RequestBody CreateMusicRequest createMusicRequest)
            throws ResponseStatusException {
        log.info("Start creating music");
        validator.validateCreateMusicRequest(createMusicRequest);
        Music music = musicBO.createMusic(createMusicRequest);
        log.info("Done creating music");
        return ResponseEntity.status(Response.Status.CREATED.getStatusCode()).body(music);
    }

    @GetMapping(path = "/entertainment/music/all", produces = "application/json")
    public ResponseEntity getAllMusic() {
        log.info("getting all my favourite musics");
        List<Music> musicList = musicBO.getAllMusic();
        Map<String, List<Music>> response = new HashMap<>();
        response.put("GetAllMusicResponse", musicList);
        return ResponseEntity.status(Response.Status.ACCEPTED.getStatusCode()).body(response);
    }
}
