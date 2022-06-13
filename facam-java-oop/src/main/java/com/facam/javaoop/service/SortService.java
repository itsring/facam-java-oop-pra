package com.facam.javaoop.service;

import com.facam.javaoop.logic.JavaSort;
import com.facam.javaoop.logic.Sort;

import java.util.List;

public class SortService {

    private final Sort<String> sort;

    public SortService(Sort<String> sort){
        this.sort = sort;
        System.out.println("[±¸ÇöÃ¼] : " + sort.getClass().getName());
    }

    public List<String> doSort(List<String> list){
        Sort<String> sort = new JavaSort<>();
        return sort.sort(list);
    }
}
