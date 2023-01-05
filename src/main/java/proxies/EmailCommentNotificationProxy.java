package proxies;

import model.Comment;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("email")
public class EmailCommentNotificationProxy implements CommentNotificationProxy{
    @Override
    public void sendEmail(Comment comment) {
        System.out.println("Sending email notification for comment" + comment.getText());
    }
}
