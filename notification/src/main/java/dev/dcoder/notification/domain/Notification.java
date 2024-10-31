package dev.dcoder.notification.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "notifications")
public class Notification {
    @Id
    private String id;

    @Field(name = "user_id")
    private String userId;

    @Field(name = "title")
    private String title;

    @Field(name = "body")
    private String body;

    @Field(name = "type")
    private NotificationType type;

    @Field(name = "is_read")
    private Boolean isRead;

    @Field(name = "related_entity_id")
    private String relatedEntityId;

    @Field(name = "created_at")
    private LocalDateTime createdAt;

    @Field(name = "read_at")
    private LocalDateTime readAt;

    public enum NotificationType {
        REVIEW,
        RESERVATION,
        PROMOTION,
        SYSTEM,
        MESSAGE,
        FRIEND_REQUEST,
        ORDER_STATUS,
        RECOMMENDATION
    }
}