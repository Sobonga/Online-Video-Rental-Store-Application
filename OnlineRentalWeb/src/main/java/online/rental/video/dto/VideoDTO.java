package online.rental.video.dto;

import java.util.List;

public class VideoDTO extends Dto {
    private int id;
    private String movietitle;
    private String description;
    private Double rentalPrice;
    private List<VideoStatusDTO> videoStatus;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMovietitle() {
        return movietitle;
    }

    public void setMovietitle(String movietitle) {
        this.movietitle = movietitle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getRentalPrice() {
        return rentalPrice;
    }

    public void setRentalPrice(Double rentalPrice) {
        this.rentalPrice = rentalPrice;
    }

    public List<VideoStatusDTO> getVideoStatus() {
        return videoStatus;
    }

    public void setVideoStatus(List<VideoStatusDTO> videoStatus) {
        this.videoStatus = videoStatus;
    }
}
