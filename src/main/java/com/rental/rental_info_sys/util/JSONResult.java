package com.rental.rental_info_sys.util;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author 12030
 * @version V1.0
 * @ProjectName:IntelliJ IDEA
 * @PackageName: com.etm.springbootetm.util
 * @ClassName: JSONResult
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @date 2020/3/4 22:35
 * @Copyright 迷笛age版权所有
 */
@Data
@Accessors(chain = true)
public class JSONResult implements Serializable {
    //响应码
    private int code;
    //响应信息
    private String msg;
    //响应数据
    private Object data;

    private JSONResult(int code, String msg, Object data){
        this.code=code;
        this.msg=msg;
        this.data=data;
    }

    public static JSONResult retSuc(Object data){
        return new JSONResult(200,"查询成功",data);
    }


    public static JSONResult retSuc(int code,String msg){
        return new JSONResult(code,msg,null);
    }

    public static JSONResult retErr(int code,String msg){
        return new JSONResult(code,msg,null);
    }
}
