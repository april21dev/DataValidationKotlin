package com.april21dev.datavalidation_annotation.model

data class ValidationResult(
    var isValid: Boolean = true,
    val invalidFieldNameAndTags: MutableList<FieldNameAndTag> = mutableListOf()
)