package net.eviera.pruebas.springbilling.units.document;

import net.eviera.pruebas.springbilling.units.company.Company;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;
import java.util.Date;

@Entity
public class Document {

    @Id
    private Long id;
    private String type;
    private String status;
    @ManyToOne
    private Company payer;
    private String legalDocRef;
    private Date issueDate;
    private Date creationDate;
    private BigDecimal dueAmount;
    private BigDecimal totalAmount;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Company getPayer() {
        return payer;
    }

    public void setPayer(Company payer) {
        this.payer = payer;
    }

    public String getLegalDocRef() {
        return legalDocRef;
    }

    public void setLegalDocRef(String legalDocRef) {
        this.legalDocRef = legalDocRef;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public BigDecimal getDueAmount() {
        return dueAmount;
    }

    public void setDueAmount(BigDecimal dueAmount) {
        this.dueAmount = dueAmount;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    @Override
    public String toString() {
        return "Document{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", status='" + status + '\'' +
                ", payer=" + payer +
                ", legalDocRef='" + legalDocRef + '\'' +
                ", issueDate=" + issueDate +
                ", creationDate=" + creationDate +
                ", dueAmount=" + dueAmount +
                ", totalAmount=" + totalAmount +
                '}';
    }

}
