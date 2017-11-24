package org.plxc.activemq.demo;

import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

/**
 * <p>Description: 接受消息监听类</p>
 * <p>Company: wisdragon</p>
 *
 * @author vander
 * @author 2017/11/24
 */
public class RevMessageListener implements MessageListener {

    @Override
    public void onMessage(Message message) {
        //取消息内容
        TextMessage textMessage = (TextMessage) message;
        try {
            String text = textMessage.getText();
            //等待发送者那边事物提交
            Thread.sleep(100);
            System.out.println(text);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
