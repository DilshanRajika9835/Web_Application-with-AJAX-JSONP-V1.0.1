package lk.ijse.Spring.dto;/*@author:Dilshan Rajika Withanachchi*/

public class CustomerDto {
    private String id;
    private String firstname;
    private String lastname;
    private String address;
    private String contactno;
    private String country;

    public CustomerDto() {
    }

    private String city;

    public CustomerDto(String id, String firstname, String lastname, String address, String contactno, String country, String city, String zipcode) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
        this.contactno = contactno;
        this.country = country;
        this.city = city;
        this.zipcode = zipcode;
    }

    private String zipcode;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactno() {
        return contactno;
    }

    public void setContactno(String contactno) {
        this.contactno = contactno;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
}
