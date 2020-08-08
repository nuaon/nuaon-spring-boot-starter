package cn.nuaon.springboot.format;

public interface FormatProcessor
{
    public <T> String format(T obj);
}
