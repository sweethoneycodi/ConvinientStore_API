package services;

import model.Applicant;
import model.Cashier;
import model.Store;

public interface ManagerService {
    String hireCashier(Applicant applicant);
    Cashier hireSalesCashier(Applicant applicant);
    void addToProductList(Store store);


}
