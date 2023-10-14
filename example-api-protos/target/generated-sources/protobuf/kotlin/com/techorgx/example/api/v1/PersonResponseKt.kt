// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: com/techorgx/api/example.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package com.techorgx.example.api.v1;

@kotlin.jvm.JvmName("-initializepersonResponse")
public inline fun personResponse(block: com.techorgx.example.api.v1.PersonResponseKt.Dsl.() -> kotlin.Unit): com.techorgx.example.api.v1.PersonResponse =
  com.techorgx.example.api.v1.PersonResponseKt.Dsl._create(com.techorgx.example.api.v1.PersonResponse.newBuilder()).apply { block() }._build()
/**
 * Protobuf type `PersonResponse`
 */
public object PersonResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: com.techorgx.example.api.v1.PersonResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: com.techorgx.example.api.v1.PersonResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): com.techorgx.example.api.v1.PersonResponse = _builder.build()

    /**
     * `.Person person = 1;`
     */
    public var person: com.techorgx.example.api.v1.Person
      @JvmName("getPerson")
      get() = _builder.getPerson()
      @JvmName("setPerson")
      set(value) {
        _builder.setPerson(value)
      }
    /**
     * `.Person person = 1;`
     */
    public fun clearPerson() {
      _builder.clearPerson()
    }
    /**
     * `.Person person = 1;`
     * @return Whether the person field is set.
     */
    public fun hasPerson(): kotlin.Boolean {
      return _builder.hasPerson()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun com.techorgx.example.api.v1.PersonResponse.copy(block: com.techorgx.example.api.v1.PersonResponseKt.Dsl.() -> kotlin.Unit): com.techorgx.example.api.v1.PersonResponse =
  com.techorgx.example.api.v1.PersonResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val com.techorgx.example.api.v1.PersonResponseOrBuilder.personOrNull: com.techorgx.example.api.v1.Person?
  get() = if (hasPerson()) getPerson() else null

