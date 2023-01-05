package proxies;

import model.Comment;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public interface CommentNotificationProxy {
    void sendEmail(Comment comment);
}
