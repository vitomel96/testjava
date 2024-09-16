package cibernacion.test.domain.employee;

import java.time.LocalDate;

public class EmployeeEntity {

    private String id;
    private String name;
    private String idCard;
    private String photo;
    private LocalDate dateOfEntry;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public LocalDate getDateOfEntry() {
        return dateOfEntry;
    }

    public void setDateOfEntry(LocalDate dateOfEntry) {
        this.dateOfEntry = dateOfEntry;
    }
}
