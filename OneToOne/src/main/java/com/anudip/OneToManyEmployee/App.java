package com.anudip.OneToManyEmployee;

import com.anudip.OneToManyEmployee.daoimpl.CitizenDaoImpl;


public class App 
{
    public static void main( String[] args )
    {
        CitizenDaoImpl cdao = new CitizenDaoImpl();
        cdao.addCitizen();  //   calling the addCitizen() method
        cdao.fetchCitizen();//   calling the fetchCitizen() method
    }
}
