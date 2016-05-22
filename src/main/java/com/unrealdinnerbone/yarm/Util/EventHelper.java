package com.unrealdinnerbone.yarm.Util;


import java.util.Calendar;

public class EventHelper
{
    public static Boolean IsNewYears = false;
    public static Boolean IsAprilFirst = false;
    public static Boolean IsHollwen = false;
    public static Boolean IsChirstmas = false;
    public static Boolean IsTest = false;

    public EventHelper()
    {
        DateChecker();
    }

    public static void DateChecker()
    {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());

        switch(calendar.get(2)) //month
        {
            case 1:
            {
                if(calendar.get(5) == 1)
                {
                    IsNewYears = true;
                }
                break;
            }
            case 4:
            {
                if(calendar.get(5) == 1)
                {
                    IsAprilFirst = true;
                }
                if(calendar.get(5) == 16)
                {
                    IsTest = true;
                }
                break;
            }
            case 10:
            {
                if(calendar.get(5) == 31)
                {
                    IsHollwen = true;
                }
                break;
            }
            case 12:
            {
                if(calendar.get(5) == 25)
                {
                    IsChirstmas = true;
                }
                break;
            }
        }
    }
}
//Todo Make This Work And Make it Used


