package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TaxSlabHandlerImpl implements TaxSlabHandler{
    private List<TaxSlab> taxSlabs;

    public TaxSlabHandlerImpl() {
        this.taxSlabs = new ArrayList<>();
    }

    @Override
    public List<TaxSlab> getTaxSlabs() {
        taxSlabs.sort(Comparator.comparingDouble(TaxSlab::getMinRange));
        return taxSlabs;
    }

    @Override
    public boolean addTaxSlab(TaxSlab taxSlab) {

        if((taxSlabs.isEmpty())
                || (taxSlabs.getLast().getMaxRange() <= taxSlab.getMinRange())
                || (taxSlabs.getFirst().getMinRange() >= taxSlab.getMaxRange()))
            return taxSlabs.add(taxSlab);

        return false;
    }

    @Override
    public boolean removeTaxSlab(TaxSlab taxSlab) {
        return taxSlabs.remove(taxSlab);
    }
}
