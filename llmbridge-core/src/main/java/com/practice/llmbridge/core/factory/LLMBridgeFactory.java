package com.practice.llmbridge.core.factory;

import com.practice.llmbridge.core.DefaultLLMBridge;
import com.practice.llmbridge.core.api.LLMBridge;
import com.practice.llmbridge.core.exception.LLMBridgeException;
import com.practice.llmbridge.core.provider.LLMProvider;
import com.practice.llmbridge.core.provider.ProviderType;

import java.util.EnumMap;
import java.util.Map;
import java.util.ServiceLoader;

public final class LLMBridgeFactory{
    private static final Map<ProviderType, LLMProvider> PROVIDERS = new EnumMap<ProviderType, LLMProvider>(ProviderType.class);

    static {
        ServiceLoader<LLMProvider> serviceLoader = ServiceLoader.load(LLMProvider.class);
        for(LLMProvider provider : serviceLoader){
            PROVIDERS.put(provider.getType(), provider);
        }
    }

    private LLMBridgeFactory(){}

    public static LLMBridge defaultLLMBridge(){
        if(PROVIDERS.isEmpty()){
            throw new LLMBridgeException("No LLM providers found!");
        }
        return new DefaultLLMBridge(PROVIDERS.values().iterator().next());
    }

    public static LLMBridge forProvider(ProviderType providerType){
        LLMProvider provider = PROVIDERS.get(providerType);
        if(provider == null){
            throw new LLMBridgeException("No LLM provider found for type " + providerType);
        }
        return new DefaultLLMBridge(provider);
    }

}
