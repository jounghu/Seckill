package com.seckill.entity;

import java.util.Date;

/**
 * Created by Jayson on 2017/5/1.
 * email:1358199510@qq.com
 */
public class SecKill {

    /*
        秒杀id
     */
    private long secKillId;

    /*
        秒杀名字
     */
    private String name;

    /*
        秒杀库存
     */
    private int number;


    /*
        开始时间
     */
    private Date startTime;

    /*
       结束时间
     */
    private Date endTime;

    /*
     秒杀的创建时间
     */
    private Date createTime;

    @Override
    public String toString() {
        return "SecKill{" +
                "secKillId=" + secKillId +
                ", name='" + name + '\'' +
                ", number=" + number +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", createTime=" + createTime +
                '}';
    }

    public long getSecKillId() {
        return secKillId;
    }

    public void setSecKillId(long secKillId) {
        this.secKillId = secKillId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
