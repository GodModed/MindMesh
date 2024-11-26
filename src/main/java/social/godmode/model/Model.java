package social.godmode.model;

import lombok.AllArgsConstructor;
import social.godmode.model.providers.OpenAIProvider;

import java.net.URL;

@AllArgsConstructor
public enum Model {
    GPT4O(OpenAIProvider.class, "gpt-4o", OpenAIProvider.API_ENDPOINT);

    private final Class<? extends Provider> providerClass;
    private final String name;
    private final URL apiEndpoint;
}
