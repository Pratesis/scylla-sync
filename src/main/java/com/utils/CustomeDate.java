/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.chart.PieChart;

/**
 *
 * @author pratesis
 */
public class CustomeDate {
    
    public static String toString(Date today) {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String reportDate = df.format(today);
        return reportDate;
    }
    
    public static Date toDate(String string) {
        Date date = null;
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        try {
            date = format.parse(string);
        } catch (ParseException ex) {
            Logger.getLogger(CustomeDate.class.getName()).log(Level.SEVERE, null, ex);
        }
        return date;
    }
    
}
