package online.rental.video.dto;

import java.util.List;

public class VideoDTO {
    private int id;
    private String movietitle;
    private String description;
    private Double rentalPrice;
    private List<VideoStatusDTO> videoStatus;
}
