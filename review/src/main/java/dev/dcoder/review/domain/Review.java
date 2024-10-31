package dev.dcoder.review.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "reviews")
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(nullable = false)
    private String businessId;

    @Column(nullable = false)
    private String userId;

    @Column(nullable = false)
    private Double rating;

    @Column(length = 1000)
    private String comment;

    @Column(nullable = false)
    private Boolean recommended;

    @ElementCollection
    private List<String> imageUrls;

    @Column(nullable = false)
    private Integer helpfulCount;

    @Column(nullable = false)
    private LocalDateTime createdAt;

    @Column(nullable = false)
    private LocalDateTime updatedAt;
}
