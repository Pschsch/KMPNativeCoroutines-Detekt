package com.pschsch.detektrules.kmpnativecoroutines

import io.gitlab.arturbosch.detekt.api.Config
import io.gitlab.arturbosch.detekt.api.Rule

class FlowExposedToObjC(config: Config) : Rule(config) {

    override val issue = ExposedToObjCIssue("FlowExposedToObjC")

}
