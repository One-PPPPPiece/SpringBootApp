CREATE TABLE musics(
    id BIGSERIAL PRIMARY KEY,
    name VARCHAR(126) NOT NULL,
    artist VARCHAR(126) NOT NULL,
    active BOOLEAN DEFAULT '1' NOT NULL,
    deleted BOOLEAN DEFAULT '0' NOT NULL,
    created_date TIMESTAMP DEFAULT NOW() NOT NULL,
    created_by VARCHAR(126) NOT NULL,
    last_updated_date TIMESTAMP DEFAULT NOW() NOT NULL,
    last_updated_by VARCHAR(126) NOT NULL
);

COMMENT ON TABLE musics IS 'Table to store all the music information';

INSERT INTO musics
(id, name, artist, created_by, last_updated_by)
VALUES
(1, 'Fade to Black', 'Metallica', 'Music App', 'Music App');