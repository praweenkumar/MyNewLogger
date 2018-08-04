package com.myloggerpackage;

import java.util.Date;
import java.util.logging.LogRecord;

import java.util.Date;
import java.util.Formatter;
import java.util.logging.LogRecord;

public class MyLoggerFormatter extends java.util.logging.Formatter{

    @Override
    public String format(LogRecord record) {
        return record.getThreadID()+"::"+record.getSourceClassName()+"::"
                +record.getSourceMethodName()+"::"
                +new Date(record.getMillis())+"::"
                +record.getMessage()+"\n";
    }
}
