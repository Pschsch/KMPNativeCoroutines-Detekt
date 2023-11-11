package com.pschsch.detektrules.kmpnativecoroutines

import io.gitlab.arturbosch.detekt.api.Config
import io.gitlab.arturbosch.detekt.api.Rule

class SuspendExposedToObjC(config: Config) : Rule(config) {

    override val issue = ExposedToObjCIssue("SuspendExposedToObjC")

}
