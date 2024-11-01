package dev.dcoder.business.domain;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.util.List;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "businesses")
public class Business {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String alias;

    @Column(unique = true, nullable = false)
    private String username;

    @Column(unique = true, nullable = false, columnDefinition = "TEXT")
    private String brand;

    @Column(unique = true, columnDefinition = "TEXT")
    private String customBrand;

    private String logo;
    private String cover;
    private String thumbnail;

    @Column(columnDefinition = "TEXT")
    private String about;

    @Column(unique = true, nullable = false, length = 30)
    private String phoneNumber;

    @ManyToOne
    private Country country;

    @ManyToOne
    private City city;

    @Column(columnDefinition = "TEXT")
    private String address1;

    @Column(columnDefinition = "TEXT")
    private String address2;

    @Column(columnDefinition = "TEXT")
    private String address3;

    @Column(nullable = false, length = 32)
    private String zipCode;

    private Boolean isOpening24Hours;

    @JdbcTypeCode(SqlTypes.JSON)
    private List<OpeningHour> openingHours;

    @JdbcTypeCode(SqlTypes.JSON)
    private List<AdditionalInformation> additionalInformation;

    @ManyToMany
    @JoinTable(
            name = "businesses_categories",
            joinColumns = @JoinColumn(name = "business_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id"))
    private List<Category> categories;

    @Column(unique = true, length = 150)
    private String website;

    @Column(unique = true, nullable = false, length = 100)
    private String email;

    private Boolean isClaimed;
    private Boolean isClosed;
    private Boolean isApproved;
    private Boolean isSearchable;
    private String googleMap;
    private Double price;

    @Column(precision = 10, scale = 6)
    private Double latitude;

    @Column(precision = 10, scale = 6)
    private Double longitude;

    @ManyToMany
    @JoinTable(
            name = "businesses_transactions",
            joinColumns = @JoinColumn(name = "business_id"),
            inverseJoinColumns = @JoinColumn(name = "transaction_id"))
    private List<Transaction> transactions;





}
