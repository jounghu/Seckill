package com.seckill.dao;

import com.seckill.entity.SecKill;
import com.sun.xml.internal.ws.spi.db.DatabindingException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Jayson on 2017/5/1.
 * email:1358199510@qq.com
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/spring-dao.xml")
public class SecKillDaoTest {

    @Resource
    private SecKillDao seckillDao;

    @Test
    public void reduce() throws Exception {
        long seckill_id = 1000;
        Date kill_time = new Date();
        int reduce = seckillDao.reduce(seckill_id, kill_time);
        System.out.println(reduce);
    }

    @Test
    public void queryById() throws Exception {
        long id = 1001;
        SecKill secKill = seckillDao.queryById(id);
        System.out.println(secKill);
    }

    @Test
    public void queryAll() throws Exception {
        int startIndex = 0;
        int size = 10;
        List<SecKill> secKills = seckillDao.queryAll(startIndex, size);
        for (SecKill s:secKills){
            System.out.println(s);
        }

    }

}