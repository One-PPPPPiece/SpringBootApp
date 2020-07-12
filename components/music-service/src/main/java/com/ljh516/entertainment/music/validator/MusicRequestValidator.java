package com.ljh516.entertainment.music.validator;

import com.ljh516.entertainment.music.intf.CreateMusicRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ResponseStatusException;

@Component
public class MusicRequestValidator {

    public void validateCreateMusicRequest(CreateMusicRequest createMusicRequest)
            throws ResponseStatusException {
        // TODO add extra validation here
    }
}
