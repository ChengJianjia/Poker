package Homework;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import Homework.Poker;
import Homework.PokerCompare;

/** 
* PokerCompare Tester. 
* 
* @author <Authors name> 
* @since <pre>ÎåÔÂ 10, 2019</pre> 
* @version 1.0 
*/ 
public class PokerCompareTest {
    @Test
    public void compare() {
        PokerCompare poker = new PokerCompare();
        
        String res1 = poker.compare("2H 3D 6S 7C JD", "2C 3H 4S 6C QH");
        Assert.assertEquals("White wins - high card: Q", res1);

        String res2 = poker.compare("2H 4S 4C 2D 4H", "2S 8S AS QS 6S");
        Assert.assertEquals("Black wins - Full House", res2);
       
        String res3 = poker.compare("4H 3D 5S 8C KD", "2C 3H 4S 8C KH");
        Assert.assertEquals("Black wins - high card: 5", res3);

        String res4 = poker.compare("2H 3D 5S 9C KD", "2D 3H 5C 9S KH");
        Assert.assertEquals("Tie", res4);
       
        String res5 = poker.compare("2H 4S 4C 6D 7H", "2S 8S AS QS 6S");
        Assert.assertEquals("White wins - Flush", res5);
        
        String res6 = poker.compare("2H 3D 4D 5D 6D", "2S 3S 4S 5S 6S");
        Assert.assertEquals("White wins - Straight flush", res6);
    }
} 
