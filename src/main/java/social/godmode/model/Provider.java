package social.godmode.model;

import com.google.gson.JsonObject;
import social.godmode.conversation.Conversation;

import java.util.Map;
import java.util.Set;

public abstract class Provider {

    public abstract boolean sendMessage(Conversation conversation, String message);

    public JsonObject sendHttpRequest(String url, String method, JsonObject body, Map<String, String> headers) {

    }

}
