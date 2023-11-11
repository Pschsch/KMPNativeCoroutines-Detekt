package com.pschsch.detektrules.kmpnativecoroutines

import io.gitlab.arturbosch.detekt.api.Debt
import io.gitlab.arturbosch.detekt.api.Issue
import io.gitlab.arturbosch.detekt.api.Severity

@Suppress("FunctionName")
internal fun ExposedToObjCIssue(
    id: String
) = Issue(
    id = id,
    severity = Severity.Minor,
    description = "Suspend functions should not be exported to ObjC without @NativeCoroutines annotation",
    debt = Debt.FIVE_MINS
)
