package services.impl;

import enums.Qualification;
import enums.Role;
import model.Applicant;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManagerImpTest {

    @Test
    void hireCashier() {
    }


    @Test
    void toHireCashier() {
        Applicant applicant1 = new Applicant(Qualification.MSC, Role.CASHIER);
        ManagerImp boss = new ManagerImp();
        String result = boss.hireCashier(applicant1);
        Assertions.assertEquals("You are eligible for the role",result);




       Applicant applicant2 = new Applicant(Qualification.HND,Role.MANAGER);
        ManagerImp boss2 = new ManagerImp();
//        String result2 = boss2.hireCashier(applicant2);
//        Assertions.assertEquals("not eligible",result2);

        var thrown = Assertions.assertThrows(RuntimeException.class, ()-> boss2.hireCashier(applicant2), "not eligible");
       Assertions.assertTrue(thrown.getMessage().contains("not eligible"));


    }
}