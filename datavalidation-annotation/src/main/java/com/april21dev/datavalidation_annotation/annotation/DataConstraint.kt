package com.april21dev.datavalidation_annotation.annotation

/**
 * Model Class Annotation
 * Any classes that need validation should be annotated with this
 */
@Target(AnnotationTarget.CLASS)
annotation class DataValidation

/**
 * Nested field
 * Nested model fields should be annotated with this. If not, ignored
 */
@Target(AnnotationTarget.FIELD)
annotation class Nested

/**
 * Not null constraint
 */
@Target(AnnotationTarget.FIELD)
annotation class NotNull(
    val tag: String
)

/**
 * String field minimum length constraint
 */
@Target(AnnotationTarget.FIELD)
annotation class MinLength(
    val length: Int,
    val tag: String
)

/**
 * String field maximum length constraint
 */
@Target(AnnotationTarget.FIELD)
annotation class MaxLength(
    val length: Int,
    val tag: String
)

/**
 * String field regex match constraint
 */
@Target(AnnotationTarget.FIELD)
annotation class Regex(
    val regex: String,
    val tag: String
)

/**
 * Number minimum value
 */
@Target(AnnotationTarget.FIELD)
annotation class MinValue(
    val value: Long,
    val tag: String
)

/**
 * Number maximum value
 */
@Target(AnnotationTarget.FIELD)
annotation class MaxValue(
    val value: Long,
    val tag: String
)