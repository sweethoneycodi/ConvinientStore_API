package model;

import enums.Qualification;
import enums.Role;

public class Applicant extends Person{
    private Qualification qualification;
    private Role role;

    public Applicant(Qualification qualification, Role role) {
        super();
        this.qualification = qualification;
        this.role = role;
    }

    public Applicant(String name, String phoneNumber, String email, Qualification qualification, Role role) {
        super(name, phoneNumber, email);
        this.qualification = qualification;
        this.role = role;
    }

    public Applicant(Role role) {
        this.role = role;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Applicant(Qualification qualification) {
        this.qualification = qualification;
    }

    public Qualification getQualification() {
        return qualification;
    }

    public void setQualification(Qualification qualification) {
        this.qualification = qualification;
    }

    @Override
    public String toString() {
        return "Applicant{" +
                "qualification=" + qualification +
                ", role=" + role +
                '}';
    }
}
