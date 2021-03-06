package lk.kmartsuper.asset.invoice.entity;

import com.fasterxml.jackson.annotation.JsonFilter;
import lk.kmartsuper.asset.item.entity.ItemBatch;
import lk.kmartsuper.util.audit.AuditEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonFilter("InvoiceItemQuantity")
public class InvoiceItemQuantity extends AuditEntity {
    private String quantity;

    @ManyToOne
    private ItemBatch itemBatch;

    @ManyToOne
    private Invoice invoice;

}
