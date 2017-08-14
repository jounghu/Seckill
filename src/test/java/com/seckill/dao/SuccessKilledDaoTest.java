package com.seckill.dao;

import com.seckill.entity.SuccessKilled;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Jayson on 2017/5/1.
 * email:1358199510@qq.com
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/spring-dao.xml")
public class SuccessKilledDaoTest {

    @Resource
    SuccessKilledDao successKilledDao;

    @Test
    public void insert() throws Exception {
        long id = 1000L;
        long user_phone = 15001736187L;
        int insert = successKilledDao.insert(id, user_phone);
        System.out.println(insert);
    }

    @Test
    public void loadAll() throws Exception {
        List<SuccessKilled> successKilleds = successKilledDao.loadAll();
        for (SuccessKilled s:successKilleds){
            System.out.println(s);
        }

    }

    @Test
    public void loadById() throws Exception {
        long id = 1000L;
        long user_phone = 15001736187L;
        SuccessKilled successKilled = successKilledDao.loadById(id, user_phone);
        System.out.println(successKilled);
    }

}