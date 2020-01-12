package ImageHoster.controller;

import ImageHoster.model.Comment;
import ImageHoster.model.Image;
import ImageHoster.model.User;
import ImageHoster.service.CommentService;
import ImageHoster.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.Date;

@Controller
public class CommentController {

    @Autowired
    private ImageService imageService;

    @Autowired
    private CommentService commentService;

    // This method is called when request pattern is '/images/{imageId}/{imageTitle}/comments' and request is of type POST
    // Method called when used want to add comment on specific image
    // Receives path param from imageId and imageTitle
    // Set image, user adn comment in Comment model and sace comment in image
    @RequestMapping(value = "/images/{imageId}/{imageTitle}/comments", method = RequestMethod.POST)
    public String addImageComment(@PathVariable("imageId") Integer imageId, @PathVariable("imageTitle") String title, @RequestParam("comment") String comment, HttpSession session, Model model) {
        Image image = imageService.getImage(imageId);
        User user = (User) session.getAttribute("loggeduser");

        Comment newComment = new Comment();
        newComment.setImage(image);
        newComment.setUser(user);
        newComment.setText(comment);
        newComment.setCreatedDate(new Date());

        commentService.addComment(newComment);

        return "redirect:/images/" + image.getId() + "/" + image.getTitle();
    }
}
