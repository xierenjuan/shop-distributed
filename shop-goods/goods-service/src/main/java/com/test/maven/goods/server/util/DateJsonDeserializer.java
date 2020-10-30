package com.test.maven.goods.server.util;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.test.maven.goods.server.exception.custom.DataException;
import org.apache.commons.lang.StringUtils;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 时间反序列化工具类
 */
public class DateJsonDeserializer extends JsonDeserializer<Date>
{
    public static final SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    public static final SimpleDateFormat formatYMD=new SimpleDateFormat("yyyy-MM-dd");
	public Date deserialize(JsonParser jsonParser, DeserializationContext deserializationContext)throws IOException,JsonProcessingException{

		if(StringUtils.isBlank(jsonParser.getText()))
			throw new DataException("不能为空");

		try{
			return format.parse(jsonParser.getText());
		}
		catch(ParseException e){
			try {
				return formatYMD.parse(jsonParser.getText());
			} catch (ParseException e1) {
				throw new DataException("解析失败");
			}
		} 
	}
}