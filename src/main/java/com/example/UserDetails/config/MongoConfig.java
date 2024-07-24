package com.example.UserDetails.config;


import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;

@Configuration
public class MongoConfig {

    @Bean
    public MongoClient mongoClient() {
        // Replace with your MongoDB connection string
        String connectionString = "mongodb+srv://anshdwivedi2002:PapaRanjit%40420@cluster0.vvi5y1i.mongodb.net/Profiles";
        return MongoClients.create(connectionString);
    }

    @Bean
    public MongoTemplate mongoTemplate() {
        return new MongoTemplate(mongoClient(), "Profiles");
    }
}
