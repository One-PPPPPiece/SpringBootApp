package com.ljh516.entertainment.music.db.repository;

import com.ljh516.entertainment.music.db.entity.Music;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MusicRepository extends CrudRepository<Music, Long> {}
