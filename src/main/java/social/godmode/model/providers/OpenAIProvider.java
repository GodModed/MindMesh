package social.godmode.model.providers;

import social.godmode.conversation.Conversation;
import social.godmode.model.Provider;

import java.net.URI;
import java.net.URL;

public class OpenAIProvider extends Provider {

    public static final URL API_ENDPOINT;

    static {
        try {
            API_ENDPOINT = new URI("https://api.openai.com/v1").toURL();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    @Override
    public boolean sendMessage(Conversation conversation, String message) {
            conversation.
    }
}
