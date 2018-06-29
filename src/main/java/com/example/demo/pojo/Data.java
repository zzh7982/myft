/**
  * Copyright 2018 bejson.com 
  */
package com.example.demo.pojo;
import java.util.List;

/**
 * Auto-generated: 2018-06-29 17:6:37
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class Data {

    private List<Double> ticker;
    private String type;
    private long seq;
    public void setTicker(List<Double> ticker) {
         this.ticker = ticker;
     }
     public List<Double> getTicker() {
         return ticker;
     }

    public void setType(String type) {
         this.type = type;
     }
     public String getType() {
         return type;
     }

    public void setSeq(long seq) {
         this.seq = seq;
     }
     public long getSeq() {
         return seq;
     }

}