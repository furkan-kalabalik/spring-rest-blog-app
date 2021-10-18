package com.fk97.springrestblogapp.configuration;

import com.fk97.springrestblogapp.entity.BlogPost;
import com.fk97.springrestblogapp.repository.BlogPostRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.sql.Date;
import java.util.Calendar;

@Configuration
public class LoadDatabase {
    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(BlogPostRepository blogPostRepository)
    {
        return args -> {
            log.info("Preloading " + blogPostRepository.save(
                    new BlogPost("First Post", "Content 1", "Furkan Kalabalik", new Date(Calendar.getInstance().getTime().getTime()))));
            log.info("Preloading " + blogPostRepository.save(
                    new BlogPost("Second Post", "Content 2", "Furkan Kalabalik", new Date(Calendar.getInstance().getTime().getTime()))));
        };
    }
}
