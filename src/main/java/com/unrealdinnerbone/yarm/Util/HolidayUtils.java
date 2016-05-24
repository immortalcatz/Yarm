package com.unrealdinnerbone.yarm.Util;

import java.util.Calendar;

public class HolidayUtils {
    public static Boolean isNewYears = false;
    public static Boolean isAprilFirst = false;
    public static Boolean isHalloween = false;
    public static Boolean isChristmas = false;

    public static void checkDates () {

        dateChecker();
        if (isNewYears == true) {
            LogHelper.info("Happy New Year");
        }
        else if (isAprilFirst == true) {
            LogHelper.info("Happy April Fools Day");
        }
        else if (isHalloween == true) {
            LogHelper.info("Happy Halloween");
        }
        else if (isChristmas == true) {
            LogHelper.info("Merry Christmas");
        }
        else {
            LogHelper.info(":( Today is not a Holiday");
        }

    }

    public static void dateChecker () {

        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());

        switch (calendar.get(2)) {
            case 0: {
                if (calendar.get(5) == 1) {
                    isNewYears = true;
                }
                break;
            }
            case 3: {
                if (calendar.get(5) == 1) {
                    isAprilFirst = true;
                }
                break;
            }
            case 9: {
                if (calendar.get(5) == 31) {
                    isHalloween = true;
                }
                break;
            }
            case 11: {
                if (calendar.get(5) == 25) {
                    isChristmas = true;
                }
                break;
            }
        }
    }
}
