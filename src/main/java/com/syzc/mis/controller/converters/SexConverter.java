package com.syzc.mis.controller.converters;

import com.syzc.mis.entity.enumtype.Sex;
import org.springframework.core.convert.converter.Converter;

public class SexConverter implements Converter<String, Sex> {
    @Override
    public Sex convert(String source) {
        try {
            return Sex.get(Integer.parseInt(source));
        } catch (NumberFormatException e) {
            return null;
        }
    }
}