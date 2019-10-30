package com.mutong.common;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 自己用于传递给前端的参数
 */
@ApiModel(value = "LayuiJson返回值",description = "用于后端向前端传递参数")
public class LayuiJson {
    public static int CODE_OK = 200;
    public static int CODE_SERVER_ERR = 9000;

    @ApiModelProperty("操作正常/异常")
    private boolean flag;
    @ApiModelProperty("返回状态码")
    private Integer code;
    @ApiModelProperty("提示信息")
    private String message;
    @ApiModelProperty("返回数据")
    private Object data;


    /**
     * 自动填装layuiJson
     * @param message   提示信息
     */
    public static LayuiJson newErrorInstance(String message){
        LayuiJson layuiJson = new LayuiJson();
        layuiJson.setFlag(false);
        layuiJson.setCode(CODE_SERVER_ERR);
        layuiJson.setMessage(message);
        return layuiJson;
    }

    /**
     * 自动填装layuiJson
     * @param code  状态
     * @param message   提示信息
     */
    public static LayuiJson newErrorInstance(Integer code,String message){
        LayuiJson layuiJson = new LayuiJson();
        layuiJson.setFlag(false);
        layuiJson.setCode(code);
        layuiJson.setMessage(message);
        return layuiJson;
    }

    /**
     * 自动填装layuiJson
     * @param code  状态
     * @param message   提示信息
     * @param data   错误数据
     */
    public static LayuiJson newErrorInstance(Integer code,String message,Object data){
        LayuiJson layuiJson = new LayuiJson();
        layuiJson.setFlag(false);
        layuiJson.setCode(code);
        layuiJson.setMessage(message);
        layuiJson.setData(data);
        return layuiJson;
    }


    /**
     * 自动填装layuiJson
     * @param message   提示信息
     */
    public static LayuiJson newInstance(String message){
        LayuiJson layuiJson = new LayuiJson();
        layuiJson.setMessage(message);
        layuiJson.setFlag(true);
        layuiJson.setCode(CODE_OK);
        return layuiJson;
    }

    /**
     * 自动填装layuiJson
     * @param data  数据
     */
    public static LayuiJson newInstance(Object data){
        LayuiJson layuiJson = new LayuiJson();
        layuiJson.setData(data);
        layuiJson.setFlag(true);
        layuiJson.setCode(CODE_OK);
        return layuiJson;
    }

    /**
     * 自动填装layuiJson
     * @param message   提示信息
     * @param data  数据
     */
    public static LayuiJson newInstance(String message,Object data){
        LayuiJson layuiJson = new LayuiJson();
        layuiJson.setMessage(message);
        layuiJson.setData(data);
        layuiJson.setFlag(true);
        layuiJson.setCode(CODE_OK);
        return layuiJson;
    }
    /**
     * 自动填装layuiJson
     * @param message   提示信息
     */
    public static LayuiJson newInstance(Integer code,String message){
        LayuiJson layuiJson = new LayuiJson();
        layuiJson.setCode(code);
        layuiJson.setMessage(message);
        layuiJson.setFlag(true);
        return layuiJson;
    }
    /**
     * 自动填装layuiJson
     * @param code  状态
     * @param message   提示信息
     * @param data  数据
     */
    public static LayuiJson newInstance(Integer code,String message,Object data){
        LayuiJson layuiJson = new LayuiJson();
        layuiJson.setCode(code);
        layuiJson.setMessage(message);
        layuiJson.setData(data);
        layuiJson.setFlag(true);
        return layuiJson;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
