package com.uchoice.ucenter.biz.common;

import java.util.Date;
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by ${admin} on 2017/6/17.
 */
public final class RoleIdSequence {
    //timestamp+random(4)+atomicLong.get()
    private static AtomicLong sequence = new AtomicLong();
    public static synchronized long roleIdSequence(){
        StringBuilder builder = new StringBuilder();
        builder.append(new Date().getTime()).append(new Random(1000).nextInt()).append(sequence.incrementAndGet());
        return Long.valueOf(builder.toString());
    }
    private RoleIdSequence(){
        super();
    }
}
