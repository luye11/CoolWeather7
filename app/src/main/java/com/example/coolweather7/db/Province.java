package com.example.coolweather7.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2017/5/3.
 */

public class Province extends DataSupport{


    public int id;
    public String provinceName;
    public int provinceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
