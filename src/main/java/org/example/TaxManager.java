package org.example;

import java.util.List;

public interface TaxManager {

    double getSalaryPostTaxDeduction(double salary, List<TaxSlab> taxSlabs);
}
