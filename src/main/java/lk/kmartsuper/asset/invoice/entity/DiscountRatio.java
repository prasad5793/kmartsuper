package lk.kmartsuper.asset.invoice.entity;

import com.fasterxml.jackson.annotation.JsonFilter;
import lk.kmartsuper.util.audit.AuditEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonFilter("DiscountRatio")
public class DiscountRatio extends AuditEntity {

    @Column(nullable = false, length = 45)
    private String name;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal amount;

    @OneToMany(mappedBy = "discountRatio")
    private List<Invoice> invoices;

}