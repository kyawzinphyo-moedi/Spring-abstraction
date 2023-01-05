package main;

import config.ProjectConfig;
import model.Comment;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import proxies.CommentNotificationProxy;
import proxies.EmailCommentNotificationProxy;
import repositories.DbCommentRepository;
import service.CommentService;

public class Main {
    public static void main(String[] args) {
        var content=new AnnotationConfigApplicationContext(ProjectConfig.class);
        content.registerShutdownHook();
        var comment=new Comment();
        comment.setAuthor(":"+"Robert Leopardskin");
        comment.setText(":"+"Hello Barcelona");
       var commentService=content.getBean(CommentService.class);
       commentService.publishComment(comment);
    }
}
