package cn.doitedu.dynamic_rule.service;

import cn.doitedu.dynamic_rule.pojo.RuleParam;

import java.io.IOException;

/**
 * 用户画像数据查询服务接口
 */
public interface UserProfileQueryService {

    public boolean judgeProfileCondition(String deviceId, RuleParam ruleParam);

}
