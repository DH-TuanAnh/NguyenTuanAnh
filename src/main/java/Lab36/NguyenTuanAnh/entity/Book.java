package Lab36.NguyenTuanAnh.entity;

import Lab36.NguyenTuanAnh.validator.annotation.ValidCategoryId;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import jakarta.validation.constraints.*;
@Getter
@Setter
@Data
@Entity
@Table(name = "book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title")
    @NotEmpty(message = "Title must not be empty")
    @Size(max = 50, min = 1, message = "Title must be less than 50 character")
    private String title;

    @Column(name = "author")
    private String author;

    @Column(name = "price")
    @NotNull(message = "Price is required")
    private Double price;

    @ManyToOne
    @JoinColumn(name = "category_id")
    @ValidCategoryId
    private Category category;
}
