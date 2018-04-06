package com.tatar.algorithmrtc.di;

import com.tatar.algorithmrtc.di.modules.RandomGeneratorModule;
import com.tatar.algorithmrtc.di.modules.RandomModule;
import com.tatar.algorithmrtc.inputhelper.InputGenerator;
import dagger.Component;

@Component(modules = {RandomModule.class, RandomGeneratorModule.class})
public interface AppComponent {
    InputGenerator getInputGenerator();
}
