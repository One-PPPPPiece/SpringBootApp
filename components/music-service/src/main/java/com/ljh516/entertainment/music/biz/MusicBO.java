package com.ljh516.entertainment.music.biz;

import com.ljh516.entertainment.music.db.MusicDAO;
import com.ljh516.entertainment.music.db.entity.Music;
import com.ljh516.entertainment.music.intf.CreateMusicRequest;
import java.util.Calendar;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicBO {

    private static final Logger log = LoggerFactory.getLogger(MusicBO.class);

    @Autowired MusicDAO musicDAO;

    public List<Music> getAllMusic() {
        return musicDAO.getAllMusics();
    }

    public Music createMusic(CreateMusicRequest createMusicRequest) {
        Music music = getMusicFromRequest(createMusicRequest);
        return musicDAO.insert(music);
    }

    private Music getMusicFromRequest(CreateMusicRequest request) {
        return Music.builder()
                .name(request.getName())
                .artist(request.getArtist())
                .active(request.getActive())
                .deleted(Boolean.FALSE)
                .createBy(request.getCreatedBy())
                .lastUpdatedBy(request.getLastUpdatedBy())
                .createdDate(Calendar.getInstance())
                .lastUpdatedDate(Calendar.getInstance())
                .build();
    }
}
