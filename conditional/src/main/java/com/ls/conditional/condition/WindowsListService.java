package com.ls.conditional.condition;

/**
 * @author liushuang 2017/8/31
 */
public class WindowsListService implements ListService {
    @Override
    public String showListCmd() {
        return "dir";
    }
}
