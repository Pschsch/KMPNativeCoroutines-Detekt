package com.pschsch.detektrules.kmpnativecoroutines

import io.gitlab.arturbosch.detekt.api.Config
import io.gitlab.arturbosch.detekt.api.RuleSet
import io.gitlab.arturbosch.detekt.api.RuleSetProvider

class PschschKMPNativeCoroutinesRuleSetProvider : RuleSetProvider {

    override val ruleSetId: String = "PschschKMPNativeCoroutinesRuleSet"

    override fun instance(config: Config) = RuleSet(
        ruleSetId,
        listOf()
    )

}
