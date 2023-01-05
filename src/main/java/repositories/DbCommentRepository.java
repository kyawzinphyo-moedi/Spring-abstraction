package repositories;

import model.Comment;
import org.springframework.stereotype.Component;

//@Component
public class DbCommentRepository implements CommentRepository{
    @Override
    public void storeComment(Comment comment) {
        System.out.println("Stored Comment" + comment.getText());
    }
}
