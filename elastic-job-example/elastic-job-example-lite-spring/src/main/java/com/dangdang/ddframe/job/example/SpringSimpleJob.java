package com.dangdang.ddframe.job.example;

import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.simple.SimpleJob;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 * Created by caolongqiang on 2017/5/12.
 */
public class SpringSimpleJob implements SimpleJob {
//    @Resource
//    private FooRepository fooRepository;

    public SpringSimpleJob() {
    }

    public void execute(ShardingContext shardingContext) {
        System.out.println(String.format("Item: %s | Time: %s | Thread: %s | %s", new Object[]{Integer.valueOf(shardingContext.getShardingItem()), (new SimpleDateFormat("HH:mm:ss")).format(new Date()), Long.valueOf(Thread.currentThread().getId()), "SIMPLE"}));
//        List data = this.fooRepository.findTodoData(shardingContext.getShardingParameter(), 10);
//        Iterator var3 = data.iterator();
//
//        while(var3.hasNext()) {
//            Foo each = (Foo)var3.next();
//            this.fooRepository.setCompleted(each.getId());
//        }

    }
}
