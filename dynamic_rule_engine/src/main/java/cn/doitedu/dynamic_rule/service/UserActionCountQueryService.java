package cn.doitedu.dynamic_rule.service;

import cn.doitedu.dynamic_rule.pojo.LogBean;
import cn.doitedu.dynamic_rule.pojo.RuleAtomicParam;
import cn.doitedu.dynamic_rule.pojo.RuleParam;
import org.apache.flink.api.common.state.ListState;

/**
 * 用户行为次数类条件查询服务接口
 */
public interface UserActionCountQueryService {

    public boolean queryActionCounts(String deviceId, RuleParam ruleParam) throws Exception;

    public boolean queryActionCounts(String deviceId, RuleAtomicParam atomicParam,String ruleId) throws Exception;

}
