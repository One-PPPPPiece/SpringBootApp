package com.ljh516.entertainment.music.db.entity;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import javax.persistence.*;
import java.util.Calendar;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
@Entity
@Table(name = "musics")
public class Music {
    @Id
    @GenericGenerator(
            name = "musics_id_seq",
            strategy = "sequence-identity",
            parameters = @Parameter(name = "sequence", value = "musics_id_seq"))
    @GeneratedValue(generator = "musics_id_seq")
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "artist")
    private String artist;

    @Column(name = "active")
    private Boolean active;

    @Column(name = "deleted")
    private Boolean deleted;

    @Column(name = "created_date")
    private Calendar createdDate;

    @Column(name = "created_by")
    private String createBy;

    @Column(name = "last_updated_date")
    private Calendar lastUpdatedDate;

    @Column(name = "last_updated_by")
    private String lastUpdatedBy;
}
