package com.jidu.aladdin.common;


/**
 * 自己用于传递给前端的参数
 */
public class LayuiJson {
    public static int CODE_OK = 200;
    public static int CODE_SERVER_ERR = 9000;
    public static int CODE_MISSING_PARAM = 9001;

    private boolean flag;
    private Integer code = CODE_OK;
    private String message;
    private Object data;


    /**
     * 自动填装layuiJson
     * @param message   提示信息
     */
    public static LayuiJson newErrorInstance(String message){
        LayuiJson layuiJson = new LayuiJson();
        layuiJson.setFlag(false);
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
        return layuiJson;
    }

    /**
     * 自动填装layuiJson
     * @param data  数据
     */
    public static LayuiJson newInstance(Object data){
        LayuiJson layuiJson = new LayuiJson();
        layuiJson.setData(data);
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
