package com.oms.serverapi.cdapi;

import com.oms.bean.CompactDisc;

import java.util.ArrayList;
import java.util.Map;

public interface ICDApi {
    public ArrayList<CompactDisc> getCds(Map<String, String> queryParams);
}
