package com.oms.bean.shipping.implement;

import com.oms.bean.shipping.ShippingFee;

public class OtherShippingFee implements ShippingFee {
    @Override
    public float calculate(float weight) {
        int sodu = 0;

        if (weight > 0.5) {
            sodu = (int) ((weight-0.5)/0.5);
            sodu += weight%sodu>0?1:0;
        }

        return 30000 + sodu*2500;
    }
}
