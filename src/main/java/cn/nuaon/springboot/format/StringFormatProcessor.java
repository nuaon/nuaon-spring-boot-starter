package cn.nuaon.springboot.format;

public class StringFormatProcessor implements FormatProcessor
{
    public <T> String format(T obj)
    {
        return obj.toString();
    }
}
