package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import proxies.CommentNotificationProxy;
import proxies.EmailCommentNotificationProxy;
import repositories.CommentRepository;
import repositories.DbCommentRepository;
import service.CommentService;

@Configuration
@ComponentScan(basePackages = {"proxies","repositories","service"})
public class ProjectConfig {
    @Bean
    public CommentRepository commentRepository(){
        return new DbCommentRepository();
    }
    @Bean
    public CommentNotificationProxy commentNotificationProxy(){
        return new EmailCommentNotificationProxy();
    }
    @Bean
    public CommentService commentService(CommentRepository commentRepository,CommentNotificationProxy commentNotificationProxy){
        return new CommentService(commentRepository,commentNotificationProxy);
    }
}
