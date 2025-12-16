package com.loose.cupling;

import com.loose.cupling.UserManager;

public class LooseCoupligExample {

    public static void main(String[] args){
        UserDataProvider databaseProvider =new UserDatabaseProvider();
        UserManager userManagerwithDB= new UserManager(databaseProvider);
        System.out.println(userManagerwithDB.getUserInfo());


        UserDataProvider webServiceProvider= new WebServiceDataprovider();
        UserManager userManagerWithWS= new UserManager(webServiceProvider);
        System.out.println(userManagerWithWS.getUserInfo());

        UserDataProvider newDatabaseProvider = new NewDatabaseProvider();
        UserManager userManagerWithNewDB= new UserManager(newDatabaseProvider);
        System.out.println(userManagerWithNewDB.getUserInfo());





    }




}
