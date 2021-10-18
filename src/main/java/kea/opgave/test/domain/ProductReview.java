package kea.opgave.test.domain;


import javax.persistence.*;

@Entity
@Table( name = "product_reviews")
public class ProductReview {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn( name = "product_id", nullable = false)
    private Product product;

    protected ProductReview(){ }
}
