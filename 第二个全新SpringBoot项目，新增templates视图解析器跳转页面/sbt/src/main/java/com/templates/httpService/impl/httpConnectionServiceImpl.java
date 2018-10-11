package com.templates.httpService.impl;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Map;

import com.templates.httpService.httpConnectionService;

/***
 * 
 * @author zhouzy
 *http请求实现层
 */
public class httpConnectionServiceImpl implements httpConnectionService{
    @Override
    public Map<String, String> getConputerInformaction() {
        InetAddress address;//获取本机的InetAddress实例
        try {
            address = InetAddress.getLocalHost();
            address.getHostName();//获取计算机名
            address.getHostAddress();//获取IP地址
            byte[] bytes = address.getAddress();//获取字节数组形式的IP地址,以点分隔的四部分

            InetAddress address2 =InetAddress.getByName("其他主机名");//获取其他主机的InetAddress实例
            InetAddress address3 =InetAddress.getByName("IP地址");
            
        } catch (UnknownHostException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }


}
