package com.example.spring.scope;

import lombok.Data;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Data
@Component
@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class PrototypeBean implements ScopeBeanInterface {

    private String name = "test";
}
