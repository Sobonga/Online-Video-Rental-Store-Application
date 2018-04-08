package online.rental.video.dto;

public class RequestTableDTO {
    private int id;
    private int video_id;
    private int customer_id;
    private int customer_rent_id;
    private String request_status;
    private String request_type;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getVideo_id() {
        return video_id;
    }

    public void setVideo_id(int video_id) {
        this.video_id = video_id;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public int getCustomer_rent_id() {
        return customer_rent_id;
    }

    public void setCustomer_rent_id(int customer_rent_id) {
        this.customer_rent_id = customer_rent_id;
    }

    public String getRequest_status() {
        return request_status;
    }

    public void setRequest_status(String request_status) {
        this.request_status = request_status;
    }

    public String getRequest_type() {
        return request_type;
    }

    public void setRequest_type(String request_type) {
        this.request_type = request_type;
    }
}
