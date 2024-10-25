package cn.doitedu.dynamic_rule.service;


import cn.doitedu.dynamic_rule.pojo.LogBean;
import cn.doitedu.dynamic_rule.pojo.RuleParam;
import org.apache.flink.api.common.state.ListState;

/**
 * 用户行为次序列条件查询服务接口
 */
public interface UserActionSequenceQueryService {

    public boolean queryActionSequence(String deviceId, RuleParam ruleParam) throws Exception;
}
