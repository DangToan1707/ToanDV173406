package com.oms.serverapi;

import com.oms.bean.Book;
import com.oms.bean.CompactDisc;
import com.oms.bean.DigitalVideoDisc;
import com.oms.bean.Media;

import java.util.ArrayList;
import java.util.Map;


public interface IMediaAPI {
    public ArrayList<Media> getAllMedias();
}
