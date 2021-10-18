package kea.opgave.test.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table( name = "products")
public class Product{

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    @Column( name = "product_id")
    private Long id;

    @Column( name = "product_name", nullable = false)
    private String name;

    @Column( name = "product_price", nullable = false)
    private double price;

    @OneToMany( mappedBy = "product")
    List<ProductReview> productReviews;

    protected Product(){ }

}
