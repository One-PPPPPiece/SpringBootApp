package com.ljh516.entertainment.music.intf;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.ljh516.entertainment.music.common.Constants;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonRootName("music")
@JsonIgnoreProperties(ignoreUnknown = true)
@ApiModel(
        value = "CreateMusicRequest",
        description = "This is the request object for create music service")
public class CreateMusicRequest {

    @ApiModelProperty(value = "Name or title of the music", example = "Fade to Black")
    @NotNull(message = Constants.CANNOT_BE_EMPTY)
    private String name;

    @ApiModelProperty(value = "Artist of the music", example = "Metallica")
    @NotNull(message = Constants.CANNOT_BE_EMPTY)
    private String artist;

    @ApiModelProperty(value = "Who created this record", example = "Music App")
    @NotNull(message = Constants.CANNOT_BE_EMPTY)
    private String createdBy;

    @ApiModelProperty(value = "Who last updated this record", example = "Music App")
    @NotNull(message = Constants.CANNOT_BE_EMPTY)
    private String lastUpdatedBy;

    @ApiModelProperty(value = "Is this promotion active or not", example = "true")
    @NotNull(message = Constants.CANNOT_BE_EMPTY)
    private Boolean active;
}
