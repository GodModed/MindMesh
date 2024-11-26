package social.godmode.conversation;

import lombok.Getter;

@Getter
public record ConversationMessage(String request, String response) {
}
