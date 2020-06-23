package com.simplerobot.component.springboot.configuration;

import com.forte.qqrobot.SimpleRobotApplication;
import com.forte.qqrobot.depend.DependGetter;
import com.forte.qqrobot.sender.MsgSender;
import com.forte.qqrobot.utils.CQCodeUtil;
import com.simbot.component.mirai.MiraiApp;
import com.simbot.component.mirai.MiraiConfiguration;
import com.simplerobot.core.springboot.configuration.SpringBootDependGetter;

/**
 * @author <a href="https://github.com/ForteScarlet"> ForteScarlet </a>
 */
@SimpleRobotApplication(resources = "application.properties")
public class MiraiSpringBootBeanFactoryApp implements MiraiApp {

    private DependGetter dependGetter;


    public MiraiSpringBootBeanFactoryApp(SpringBootDependGetter dependGetter){
        this.dependGetter = dependGetter;
    }

    @Override
    public void before(MiraiConfiguration configuration) {
        // 整合Spring的DependGetter
        configuration.setDependGetter(dependGetter);
    }

    @Override
    public void after(CQCodeUtil cqCodeUtil, MsgSender sender) { }
}
