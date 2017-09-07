package com.wind.log;

/**
 * Created by H on 2017/9/5.
 */

public class CostBean {

//    private int costView;
    public String costType;
    public String costDate;
    public String costMoney;


    public CostBean(String costType, String costDate, String costMoney) {
//        this.costView = costView;
        this.costType = costType;
        this.costDate = costDate;
        this.costMoney = costMoney;
    }

//    public int getCostView() {
//        return costView;
//    }

    public String getCostType() {
        return costType;
    }

    public String getCostDate() {
        return costDate;
    }

    public String getcostMoney() {
        return costMoney;
    }



}


