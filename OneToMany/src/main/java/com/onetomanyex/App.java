package com.onetomanyex;

import com.onetomanyex.daoimpl.DepertmentDaoImpl;


public class App 
{
    public static void main( String[] args )
    {
        DepertmentDaoImpl dim = new DepertmentDaoImpl();
        dim.addDept();
    }
}
