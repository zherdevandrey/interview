package com.example.spring.scope;


import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Data
@Component
@RequiredArgsConstructor
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class SingletonBean implements ScopeBeanInterface{

    @Lookup
    public PrototypeBean prototypeBean() {
        return null;
    }

}
