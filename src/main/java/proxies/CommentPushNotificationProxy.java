package proxies;

import model.Comment;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class CommentPushNotificationProxy implements CommentNotificationProxy{
    @Override
    public void sendEmail(Comment comment) {
        System.out.println("Comment Push Notification Proxy"+ comment.getText());
    }
}
