// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: appwish.proto

package io.appwish.grpc;

public interface AppWishListOrBuilder extends
    // @@protoc_insertion_point(interface_extends:wishservice.AppWishList)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .wishservice.AppWish appWish = 1;</code>
   */
  java.util.List<io.appwish.grpc.AppWish> 
      getAppWishList();
  /**
   * <code>repeated .wishservice.AppWish appWish = 1;</code>
   */
  io.appwish.grpc.AppWish getAppWish(int index);
  /**
   * <code>repeated .wishservice.AppWish appWish = 1;</code>
   */
  int getAppWishCount();
  /**
   * <code>repeated .wishservice.AppWish appWish = 1;</code>
   */
  java.util.List<? extends io.appwish.grpc.AppWishOrBuilder> 
      getAppWishOrBuilderList();
  /**
   * <code>repeated .wishservice.AppWish appWish = 1;</code>
   */
  io.appwish.grpc.AppWishOrBuilder getAppWishOrBuilder(
      int index);
}
