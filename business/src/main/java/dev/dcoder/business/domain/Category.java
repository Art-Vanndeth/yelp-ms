package dev.dcoder.business.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "categories")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String alias;

    private String description;

    private String icon;

    @ManyToOne(optional = true, fetch = FetchType.LAZY)
    private Category parentCategory;
}
