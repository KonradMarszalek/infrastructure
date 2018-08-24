package com.atlassian.performance.tools.infrastructure

import java.net.URI
import javax.json.Json
import javax.json.JsonObject

data class VisitableJira(
    val address: URI
) {
    constructor(
        json: JsonObject
    ) : this(
        address = URI(json.getString("address"))
    )

    fun toJson() = Json.createObjectBuilder()
        .add("address", address.toString())
        .build()
        .toString()
}