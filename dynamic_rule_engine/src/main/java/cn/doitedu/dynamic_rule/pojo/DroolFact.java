package cn.doitedu.dynamic_rule.pojo;


import cn.doitedu.dynamic_rule.service.QueryRouterV4;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 封装要insert到drools kiesession中数据的fact实体
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DroolFact {

    private LogBean logBean;

    private RuleParam ruleParam;

    private QueryRouterV4 queryRouterV4;

    private boolean match;


}
