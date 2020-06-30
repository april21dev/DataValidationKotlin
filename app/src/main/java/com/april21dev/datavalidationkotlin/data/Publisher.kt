package com.april21dev.datavalidationkotlin.data

import com.april21dev.datavalidation_annotation.annotation.DataValidation
import com.april21dev.datavalidation_annotation.annotation.MaxLength

@DataValidation
data class Publisher(
    @MaxLength(10, "publisher name is too long")
    val name: String
)