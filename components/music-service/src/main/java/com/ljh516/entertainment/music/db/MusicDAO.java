package com.ljh516.entertainment.music.db;

import com.ljh516.entertainment.music.db.entity.Music;
import com.ljh516.entertainment.music.db.repository.MusicRepository;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class MusicDAO {

    @Autowired MusicRepository musicRepository;

    private static final Logger log = LoggerFactory.getLogger(MusicDAO.class);

    public List<Music> getAllMusics() {
        return (List<Music>) musicRepository.findAll();
    }

    @Transactional()
    public Music insert(Music music) {
        musicRepository.save(music);
        log.info("Music insert into DB success, musicId={}", music.getId());
        return music;
    }
}
