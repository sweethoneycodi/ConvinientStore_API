package services.impl;

import enums.Qualification;
import enums.Role;
import model.Cashier;
import model.Staff;
import services.ManagerService;
import model.Applicant;
import model.Store;

public class ManagerImp implements ManagerService {
    private static int id = 1000;
    @Override
    public String hireCashier(Applicant applicant) {
        if (applicant.getRole() == Role.CASHIER && applicant.getQualification() == Qualification.MSC) {
            System.out.println("You are eligible for the role");
            return "You are eligible for the role";
        } else
            throw new RuntimeException("not eligible");
    }

    @Override
    public Cashier hireSalesCashier(Applicant applicant) {
        if (applicant.getRole() == Role.CASHIER && applicant.getQualification() == Qualification.MSC) {
            Staff staff = new Staff(applicant.getName(), applicant.getPhoneNumber(),applicant.getEmail(), String.valueOf(id), Role.CASHIER);
            id++;
            return new Cashier(staff);
        }
        return null;
    }

    @Override
    public void addToProductList(Store store) {

    }
}
