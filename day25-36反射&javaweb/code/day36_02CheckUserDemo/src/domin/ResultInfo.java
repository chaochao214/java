package domin;

/**
 * @Author: twc
 * @Date 2019/5/6 20:23
 **/
public class ResultInfo {
     private  Object data;
     private boolean flag;
     private String errorMsg;

    @Override
    public String toString() {
        return "ResultInfo{" +
                "data=" + data +
                ", flag=" + flag +
                ", errorMsg='" + errorMsg + '\'' +
                '}';
    }

    public ResultInfo() {
    }

    public ResultInfo(boolean flag) {
        this.flag = flag;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }
}
