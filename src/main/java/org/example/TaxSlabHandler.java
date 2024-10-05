package org.example;

import java.util.List;

public interface TaxSlabHandler {
    List<TaxSlab> getTaxSlabs();
    boolean addTaxSlab(TaxSlab taxSlab);
    boolean removeTaxSlab(TaxSlab taxSlab);
}
