package com.itheima.pojo;

/**
 * @author wangchen
 */
public class BlackList {
    private int clientId;
    private String clientName;
    private int cityCode;

    @Override
    public String toString() {
        return "BlackList{" +
                "clientID=" + clientId +
                ", clientName='" + clientName + '\'' +
                ", cityCode=" + cityCode +
                '}';
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }
}
