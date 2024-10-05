package org.example;

import java.util.List;

public class TaxManagerImpl implements TaxManager{

    @Override
    public double getSalaryPostTaxDeduction(double salary, List<TaxSlab> taxSlabs) {
        double taxDeductions = 0.0;
        double percentage = 0.01;
        double effectiveSalary;

        for(TaxSlab taxSlab : taxSlabs) {
            if(salary <= taxSlab.getMinRange()) {
                break;
            }

            else{
                if(salary > taxSlab.getMaxRange()) {
                    effectiveSalary = taxSlab.getMaxRange() - taxSlab.getMinRange();
                }
                else {
                    effectiveSalary = salary - taxSlab.getMinRange();
                }
            }

            double effectiveRate = taxSlab.getTaxRate() * percentage;
            taxDeductions += (effectiveSalary * effectiveRate);

        }

        return salary - taxDeductions;
    }

}
