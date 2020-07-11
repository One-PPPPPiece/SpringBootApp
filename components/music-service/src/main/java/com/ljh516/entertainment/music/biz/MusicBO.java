package com.ljh516.entertainment.music.biz;

import com.ljh516.entertainment.music.db.entity.Music;
import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class MusicBO {

    private static final Logger log = LoggerFactory.getLogger(MusicBO.class);

    public List<Music> getAllMusic() {
        Music music =
                new Music()
                        .toBuilder()
                        .author("Jay")
                        .id(123456789L)
                        .timeLength(102032893L)
                        .title("黑色毛衣")
                        .build();
        List<Music> list = new ArrayList<>();
        list.add(music);
        return list;
    }
}
