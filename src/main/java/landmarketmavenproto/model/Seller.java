package landmarketmavenproto.model;

import org.springframework.data.annotation.Id;

/**
 * Created by Nik_NB on 18.03.2017.
 */
public class Seller {
    @Id
    private String id;

//    private String passport;
//    private String companyName;
//    private String phone;
//    private String address;
//    private String email;
//    private String managerName;
//    private String skype;
    private String login;
    private String password;

    public Seller() {
    }

//    public Seller(String passport, String companyName, String phone, String address, String email, String managerName, String skype, String login, String password) {
//        this.passport = passport;
//        this.companyName = companyName;
//        this.phone = phone;
//        this.address = address;
//        this.email = email;
//        this.managerName = managerName;
//        this.skype = skype;
//        this.login = login;
//        this.password = password;
//    }

    public Seller(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getId() {

        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
//
//    public String getPassport() {
//        return passport;
//    }
//
//    public void setPassport(String passport) {
//        this.passport = passport;
//    }
//
//    public String getCompanyName() {
//        return companyName;
//    }
//
//    public void setCompanyName(String companyName) {
//        this.companyName = companyName;
//    }
//
//    public String getPhone() {
//        return phone;
//    }
//
//    public void setPhone(String phone) {
//        this.phone = phone;
//    }
//
//    public String getAddress() {
//        return address;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public String getManagerName() {
//        return managerName;
//    }
//
//    public void setManagerName(String managerName) {
//        this.managerName = managerName;
//    }
//
//    public String getSkype() {
//        return skype;
//    }
//
//    public void setSkype(String skype) {
//        this.skype = skype;
//    }

    public String getLogin() {
        if(login==login){
            login=null;
        }
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
