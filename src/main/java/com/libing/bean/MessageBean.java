/*
 * Copyright (c) 2015 Sohu TV. All rights reserved.
 */
package com.libing.bean;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * <P>
 * Description:
 * </p>
 * @author "libing"
 * @version 1.0
 * @Date 2015年12月19日上午11:33:37
 */
public class MessageBean {

    private String moduleName;
    private int pageSize;
    private String userName;
    private String password = "";

    private List<String> someList;
    private Set<String> someSet;
    private Map<String, Object> someMap;
    private Properties someProps;

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<String> getSomeList() {
        return someList;
    }

    public void setSomeList(List<String> someList) {
        this.someList = someList;
    }

    public Set<String> getSomeSet() {
        return someSet;
    }

    public void setSomeSet(Set<String> someSet) {
        this.someSet = someSet;
    }

    public Map<String, Object> getSomeMap() {
        return someMap;
    }

    public void setSomeMap(Map<String, Object> someMap) {
        this.someMap = someMap;
    }

    public Properties getSomeProps() {
        return someProps;
    }

    public void setSomeProps(Properties someProps) {
        this.someProps = someProps;
    }

    public String execute() {
        System.out.println("moduleName=" + moduleName);
        System.out.println("pageSize=" + pageSize);
        System.out.println("userName=" + userName);
        System.out.println("password=" + password);

        System.out.println("------List信息如下------");
        for (String s : someList) {
            System.out.println(s);
        }

        System.out.println("------Set信息如下------");
        for (String s : someSet) {
            System.out.println(s);
        }

        System.out.println("------Map信息如下------");
        Set<String> keys = someMap.keySet();
        for (String key : keys) {
            System.out.println(key + "=" + someMap.get(key));
        }

        System.out.println("------Properties信息如下------");
        Set<Object> keys1 = someProps.keySet();
        for (Object key : keys1) {
            System.out.println(key + "=" + someProps.getProperty(key.toString()));
        }

        return "success";
    }
}
