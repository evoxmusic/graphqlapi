// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: appwish.proto

package io.appwish.grpc;

public final class GRPC {
  private GRPC() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_wishservice_AllAppWishQuery_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_wishservice_AllAppWishQuery_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_wishservice_AppWishQuery_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_wishservice_AppWishQuery_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_wishservice_AllAppWishReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_wishservice_AllAppWishReply_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_wishservice_AppWishReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_wishservice_AppWishReply_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_wishservice_AppWishList_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_wishservice_AppWishList_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_wishservice_AppWish_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_wishservice_AppWish_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rappwish.proto\022\013wishservice\"\021\n\017AllAppWi" +
      "shQuery\"\032\n\014AppWishQuery\022\n\n\002id\030\001 \001(\t\"@\n\017A" +
      "llAppWishReply\022-\n\013appWishList\030\001 \001(\0132\030.wi" +
      "shservice.AppWishList\"5\n\014AppWishReply\022%\n" +
      "\007appWish\030\001 \001(\0132\024.wishservice.AppWish\"4\n\013" +
      "AppWishList\022%\n\007appWish\030\001 \003(\0132\024.wishservi" +
      "ce.AppWish\"P\n\007AppWish\022\n\n\002id\030\001 \001(\t\022\r\n\005tit" +
      "le\030\002 \001(\t\022\023\n\013description\030\003 \001(\t\022\025\n\rcoverIm" +
      "ageUrl\030\004 \001(\t2\245\001\n\016AppWishService\022M\n\rGetAl" +
      "lAppWish\022\034.wishservice.AllAppWishQuery\032\034" +
      ".wishservice.AllAppWishReply\"\000\022D\n\nGetApp" +
      "Wish\022\031.wishservice.AppWishQuery\032\031.wishse" +
      "rvice.AppWishReply\"\000B\031\n\017io.appwish.grpcB" +
      "\004GRPCP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_wishservice_AllAppWishQuery_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_wishservice_AllAppWishQuery_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_wishservice_AllAppWishQuery_descriptor,
        new java.lang.String[] { });
    internal_static_wishservice_AppWishQuery_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_wishservice_AppWishQuery_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_wishservice_AppWishQuery_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_wishservice_AllAppWishReply_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_wishservice_AllAppWishReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_wishservice_AllAppWishReply_descriptor,
        new java.lang.String[] { "AppWishList", });
    internal_static_wishservice_AppWishReply_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_wishservice_AppWishReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_wishservice_AppWishReply_descriptor,
        new java.lang.String[] { "AppWish", });
    internal_static_wishservice_AppWishList_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_wishservice_AppWishList_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_wishservice_AppWishList_descriptor,
        new java.lang.String[] { "AppWish", });
    internal_static_wishservice_AppWish_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_wishservice_AppWish_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_wishservice_AppWish_descriptor,
        new java.lang.String[] { "Id", "Title", "Description", "CoverImageUrl", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
