package com.nwu.studentsupport.utils;

import java.util.Date;

/**
 * Created Jahangir Hossain.
 */
public class DateManager {

    private Date mDateFrom;
    private Date mDateTo;

    private static DateManager ourInstance = new DateManager();

    public static DateManager getInstance() {
        return ourInstance;
    }

    private DateManager() {
        mDateFrom = com.nwu.studentsupport.utils.DateUtils.getFirstDateOfCurrentMonth();
        mDateTo = com.nwu.studentsupport.utils.DateUtils.getLastDateOfCurrentMonth();
    }

    public Date getDateFrom() {
        return mDateFrom;
    }

    public void setDateFrom(Date mDateFrom) {
        this.mDateFrom = mDateFrom;
    }

    public Date getDateTo() {
        return mDateTo;
    }

    public void setDateTo(Date mDateTo) {
        this.mDateTo = mDateTo;
    }

}
