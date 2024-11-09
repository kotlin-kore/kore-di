package org.kore.di.api.type

interface ConditionResolver {
    fun check(): Boolean
}