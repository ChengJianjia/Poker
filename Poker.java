package Homework;

public class Poker {
    private String tag;     
    private String num;       

    public Poker()
    {

    }
    public Poker(String tag, String num)
    {
        this.num = num;
        this.tag = tag;
    }

    public String getNum()
    {
        return num;
    }

    public void setNum(String num)
    {
        this.num = num;
    }

    public void setTag(String tag)
    {
        this.tag = tag;
    }

    public String getTag()
    {
        return tag;
    }

    public String toString()
    {
        return " tag: " + this.tag +" num: " + this.num;
    }

}
