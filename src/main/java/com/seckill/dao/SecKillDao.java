package com.seckill.dao;

import com.seckill.entity.SecKill;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

/**
 * Created by Jayson on 2017/5/1.
 * email:1358199510@qq.com
 */
public interface SecKillDao {
    /**
     * 减少库存
     * @param seckill_id
     * @param kill_time
     * @return
     */
    int reduce(@Param("seckill_id") long seckill_id, @Param("kill_time") Date kill_time);

    SecKill queryById(long seckill_id);

    List<SecKill> queryAll(@Param("startIndex") int startIndex, @Param("size") int size);

}
