package com.wind.log;

/**
 * Created by H on 2017/9/5.
 */

public class CostBean {

//    private int costView;
    private String costTitle;
    private String costDate;
    private String costMoney;


    public CostBean(String costTitle, String costDate, String costMoney) {
//        this.costView = costView;
        this.costTitle = costTitle;
        this.costDate = costDate;
        this.costMoney = costMoney;
    }

//    public int getCostView() {
//        return costView;
//    }

    public String getCostTitle() {
        return costTitle;
    }

    public String getCostDate() {
        return costDate;
    }

    public String getcostMoney() {
        return costMoney;
    }



}


