// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/techorgx/api/example.proto

package com.techorgx.example.api.v1;

public final class ExampleDataApiProto {
  private ExampleDataApiProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Person_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Person_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PersonRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PersonRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PersonResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PersonResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036com/techorgx/api/example.proto\"1\n\006Pers" +
      "on\022\014\n\004name\030\001 \001(\t\022\n\n\002id\030\002 \001(\005\022\r\n\005email\030\003 " +
      "\001(\t\"\"\n\rPersonRequest\022\021\n\tperson_id\030\001 \001(\005\"" +
      ")\n\016PersonResponse\022\027\n\006person\030\001 \001(\0132\007.Pers" +
      "on2:\n\nExampleApi\022,\n\tGetPerson\022\016.PersonRe" +
      "quest\032\017.PersonResponseB4\n\033com.techorgx.e" +
      "xample.api.v1B\023ExampleDataApiProtoP\001b\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Person_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Person_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Person_descriptor,
        new java.lang.String[] { "Name", "Id", "Email", });
    internal_static_PersonRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_PersonRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PersonRequest_descriptor,
        new java.lang.String[] { "PersonId", });
    internal_static_PersonResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_PersonResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PersonResponse_descriptor,
        new java.lang.String[] { "Person", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
