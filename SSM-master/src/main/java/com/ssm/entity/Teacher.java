package com.ssm.entity;

/**
 * Created by Administrator on 2016/6/27.
 */
//老师表
public class Teacher {
    private long tid ;
    private String tname ; //姓名
    private String job ; //职务

    public long getTid() {
        return tid;
    }

    public void setTid(long tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "tid=" + tid +
                ", tname='" + tname + '\'' +
                ", job='" + job + '\'' +
                '}';
    }
}
