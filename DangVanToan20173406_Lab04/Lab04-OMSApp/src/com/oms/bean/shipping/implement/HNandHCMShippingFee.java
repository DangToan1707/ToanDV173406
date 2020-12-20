package com.oms.bean.shipping.implement;

import com.oms.bean.shipping.ShippingFee;


public class HNandHCMShippingFee implements ShippingFee {
    @Override
    public float calculate(float weight) {
        int sodu = 0;

        if (weight > 3) {
            sodu = (int) ((weight-3)/0.5);
            sodu += weight%sodu>0?1:0;
        }

        return 22000 + sodu*2500;
    }
}
