package com.loose.cupling;

public class WebServiceDataprovider implements UserDataProvider{
    @Override
    public String getUserDetails(){
        return "Fetching Data From webService";

    }
}
