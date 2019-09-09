package com.zhang.boot2.config;

import com.zhang.boot2.entity.IEnum;
import org.springframework.core.convert.converter.Converter;
import org.springframework.core.convert.converter.ConverterFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component
public class EnumConvertFactory implements ConverterFactory<String, IEnum> {
    @Override
    public <T extends IEnum> Converter<String, T> getConverter(Class<T> targerType) {
        return new StringToIEnum<>(targerType);
    }

    private static class StringToIEnum<T extends IEnum> implements Converter<String, T> {
        private Class<T> targetType;

        public StringToIEnum(Class<T> targetType) {
            this.targetType = targetType;
        }

        @Override
        public T convert(String s) {
            if (StringUtils.isEmpty(s)) {
                return null;
            }
            return (T) EnumConvertFactory.getIEnum(targetType, s);
        }

    }

    private static <T extends IEnum> Object getIEnum(Class<T> targetType, String source) {
        for (T enumObj : targetType.getEnumConstants()) {
            if (source.equals(String.valueOf(enumObj.getCode()))) {
                return enumObj;
            }
        }
        return null;
    }
}
