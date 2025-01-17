/**
 * NOTE: This class is auto generated by the Swagger Gradle Codegen for the following API: JUnit Tests
 *
 * More info on this tool is available on https://github.com/Yelp/swagger-gradle-codegen
 */

package com.yelp.codegen.generatecodesamples.models

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import java.math.BigDecimal

/**
 * @property booleanProperty
 * @property enumProperty
 * @property integerProperty
 * @property numberProperty
 * @property stringProperty
 */
@JsonClass(generateAdapter = true)
data class RequiredTypeResponses(
    @Json(name = "boolean_property") @field:Json(name = "boolean_property") val booleanProperty: Boolean,
    @Json(name = "enum_property") @field:Json(name = "enum_property") val enumProperty: RequiredTypeResponses.EnumPropertyEnum,
    @Json(name = "integer_property") @field:Json(name = "integer_property") val integerProperty: Int,
    @Json(name = "number_property") @field:Json(name = "number_property") val numberProperty: BigDecimal,
    @Json(name = "string_property") @field:Json(name = "string_property") val stringProperty: String
) {
    /**
     * Values: VALUE1, VALUE2
     */
    @JsonClass(generateAdapter = false)
    enum class EnumPropertyEnum(val value: String) {
        @Json(name = "VALUE1") VALUE1("VALUE1"),
        @Json(name = "VALUE2") VALUE2("VALUE2")
    }
}
