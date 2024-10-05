package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

class TaxManagerImplTest {

    TaxSlabHandler taxSlabHandler;

    @BeforeEach
    void init() {
        taxSlabHandler = new TaxSlabHandlerImpl();
    }

    @Test
    void getSalaryPostTaxDeduction() {
        TaxSlab taxSlab1 = new TaxSlab(0, 500000, 5);
        TaxSlab taxSlab2 = new TaxSlab(500000, 1000000, 10);
        TaxSlab taxSlab3 = new TaxSlab(1000000, 20);

        taxSlabHandler.addTaxSlab(taxSlab1);
        taxSlabHandler.addTaxSlab(taxSlab2);
        taxSlabHandler.addTaxSlab(taxSlab3);


        List<TaxSlab> taxSlabs = taxSlabHandler.getTaxSlabs();

        TaxManagerImpl taxManager = new TaxManagerImpl();
        var salary = 600000;
        var netPaySalary = taxManager.getSalaryPostTaxDeduction(salary, taxSlabs);

        Assertions.assertEquals(565000, netPaySalary);
    }

}