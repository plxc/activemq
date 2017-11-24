package org.plxc.activemq.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

import javax.annotation.Resource;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

/**
 * <p>Description: 发送消息</p>
 * <p>Company: wisdragon</p>
 *
 * @author vander
 * @author 2017/11/24
 */
public class SendMessage {

    @Autowired
    private JmsTemplate jmsTemplate;
    @Resource
    private Destination queueDestination;

    public void sendMessage(){

        jmsTemplate.send(queueDestination, new MessageCreator() {
            @Override
            public Message createMessage(Session session) throws JMSException {
                session.createTextMessage("send message");
                return null;
            }
        });
    }

}
