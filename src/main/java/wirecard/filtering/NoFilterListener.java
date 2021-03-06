package wirecard.filtering;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;
import org.springframework.stereotype.Component;

@Component
public class NoFilterListener implements MessageListener {

    @Override
    public void onMessage(final Message message) {
        String messageBody = new String(message.getBody());
        String mpa = (String) message.getMessageProperties().getHeaders().get("Mpa");

        System.out.println("NoFilterListener - [message] " + messageBody + " [header] " + mpa);
    }

}
