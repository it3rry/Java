package com.terr.springcloud.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

// 所有的实体类务必实现序列化
@Data
@NoArgsConstructor
@Accessors(chain = true) // 链式写法
public class Dept implements Serializable {// 实体类  orm=>对象关系映射 mysql中的表对应这个类--dept  (类表关系映射)


    private Long deptno;  // 主键
    private String dname; //部门名称

    private String db_source; // 来自哪个数据库  一个服务对应一个数据库

    public Dept(String dname) {
        this.dname = dname;
    }
}
