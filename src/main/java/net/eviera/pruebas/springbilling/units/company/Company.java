package net.eviera.pruebas.springbilling.units.company;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Company {

    @Id
    private Long id;
    private String razonSocial;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", razonSocial='" + razonSocial + '\'' +
                '}';
    }
}
