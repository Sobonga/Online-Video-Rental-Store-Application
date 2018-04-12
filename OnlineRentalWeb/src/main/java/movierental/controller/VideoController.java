package movierental.controller;

import online.rental.video.dto.VideoDTO;
import online.rental.video.util.HibernateUtil;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class VideoController {

    public static boolean Videos(HttpServletRequest request, HttpServletResponse response){
        VideoDTO video = new VideoDTO();
        video.setMovietitle(request.getParameter("movietitle"));
        video.setDescription(request.getParameter("description"));
        video.setRentalPrice(Double.parseDouble(request.getParameter("rentalPrice")));
//        video.setVideoStatus();

        HibernateUtil.save(video);

        return false ;
    }
}
