//package com.tian;
//
//import com.weibo.api.motan.common.MotanConstants;
//import com.weibo.api.motan.util.MotanSwitcherUtil;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//
//public class DemoRpcServer {
//
//    /**
//     * 启动服务的方法
//     * @param args
//     * @throws InterruptedException
//     */
//        public static void main(String[] args) throws InterruptedException {
//
//        new ClassPathXmlApplicationContext("classpath:motan_demo_server.xml");
//
//        // 改成用配置中心的形式,则要添加一个心跳控制
//        MotanSwitcherUtil.setSwitcherValue(MotanConstants.REGISTRY_HEARTBEAT_SWITCHER, true);
//
//        System.out.println("server start...");
//    }
//}
