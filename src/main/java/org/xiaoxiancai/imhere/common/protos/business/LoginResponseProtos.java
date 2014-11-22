// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: LoginResponse.proto

package org.xiaoxiancai.imhere.common.protos.business;

public final class LoginResponseProtos {
  private LoginResponseProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface LoginResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:org.xiaoxiancai.imhere.server.business.protos.LoginResponse)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required bool isSuccess = 1;</code>
     *
     * <pre>
     * 登录成功否
     * </pre>
     */
    boolean hasIsSuccess();
    /**
     * <code>required bool isSuccess = 1;</code>
     *
     * <pre>
     * 登录成功否
     * </pre>
     */
    boolean getIsSuccess();

    /**
     * <code>required int32 status = 2;</code>
     *
     * <pre>
     * 状态码
     * </pre>
     */
    boolean hasStatus();
    /**
     * <code>required int32 status = 2;</code>
     *
     * <pre>
     * 状态码
     * </pre>
     */
    int getStatus();

    /**
     * <code>optional string message = 3;</code>
     *
     * <pre>
     * 附加信息
     * </pre>
     */
    boolean hasMessage();
    /**
     * <code>optional string message = 3;</code>
     *
     * <pre>
     * 附加信息
     * </pre>
     */
    java.lang.String getMessage();
    /**
     * <code>optional string message = 3;</code>
     *
     * <pre>
     * 附加信息
     * </pre>
     */
    com.google.protobuf.ByteString
        getMessageBytes();

    /**
     * <code>repeated .org.xiaoxiancai.imhere.server.business.protos.Command commands = 4;</code>
     *
     * <pre>
     * 需要执行的命令 
     * </pre>
     */
    java.util.List<org.xiaoxiancai.imhere.common.protos.business.CommandProtos.Command> getCommandsList();
    /**
     * <code>repeated .org.xiaoxiancai.imhere.server.business.protos.Command commands = 4;</code>
     *
     * <pre>
     * 需要执行的命令 
     * </pre>
     */
    int getCommandsCount();
    /**
     * <code>repeated .org.xiaoxiancai.imhere.server.business.protos.Command commands = 4;</code>
     *
     * <pre>
     * 需要执行的命令 
     * </pre>
     */
    org.xiaoxiancai.imhere.common.protos.business.CommandProtos.Command getCommands(int index);
  }
  /**
   * Protobuf type {@code org.xiaoxiancai.imhere.server.business.protos.LoginResponse}
   */
  public static final class LoginResponse extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:org.xiaoxiancai.imhere.server.business.protos.LoginResponse)
      LoginResponseOrBuilder {
    // Use LoginResponse.newBuilder() to construct.
    private LoginResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private LoginResponse(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final LoginResponse defaultInstance;
    public static LoginResponse getDefaultInstance() {
      return defaultInstance;
    }

    public LoginResponse getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private LoginResponse(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              isSuccess_ = input.readBool();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              status_ = input.readInt32();
              break;
            }
            case 26: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000004;
              message_ = bs;
              break;
            }
            case 32: {
              int rawValue = input.readEnum();
              org.xiaoxiancai.imhere.common.protos.business.CommandProtos.Command value = org.xiaoxiancai.imhere.common.protos.business.CommandProtos.Command.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(4, rawValue);
                } else {
                if (!((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
                  commands_ = new java.util.ArrayList<org.xiaoxiancai.imhere.common.protos.business.CommandProtos.Command>();
                  mutable_bitField0_ |= 0x00000008;
                }
                commands_.add(value);
              }
              break;
            }
            case 34: {
              int length = input.readRawVarint32();
              int oldLimit = input.pushLimit(length);
              while(input.getBytesUntilLimit() > 0) {
                int rawValue = input.readEnum();
                org.xiaoxiancai.imhere.common.protos.business.CommandProtos.Command value = org.xiaoxiancai.imhere.common.protos.business.CommandProtos.Command.valueOf(rawValue);
                if (value == null) {
                  unknownFields.mergeVarintField(4, rawValue);
                  } else {
                  if (!((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
                    commands_ = new java.util.ArrayList<org.xiaoxiancai.imhere.common.protos.business.CommandProtos.Command>();
                    mutable_bitField0_ |= 0x00000008;
                  }
                  commands_.add(value);
                }
              }
              input.popLimit(oldLimit);
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
          commands_ = java.util.Collections.unmodifiableList(commands_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.xiaoxiancai.imhere.common.protos.business.LoginResponseProtos.internal_static_org_xiaoxiancai_imhere_server_business_protos_LoginResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.xiaoxiancai.imhere.common.protos.business.LoginResponseProtos.internal_static_org_xiaoxiancai_imhere_server_business_protos_LoginResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.xiaoxiancai.imhere.common.protos.business.LoginResponseProtos.LoginResponse.class, org.xiaoxiancai.imhere.common.protos.business.LoginResponseProtos.LoginResponse.Builder.class);
    }

    public static com.google.protobuf.Parser<LoginResponse> PARSER =
        new com.google.protobuf.AbstractParser<LoginResponse>() {
      public LoginResponse parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new LoginResponse(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<LoginResponse> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int ISSUCCESS_FIELD_NUMBER = 1;
    private boolean isSuccess_;
    /**
     * <code>required bool isSuccess = 1;</code>
     *
     * <pre>
     * 登录成功否
     * </pre>
     */
    public boolean hasIsSuccess() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required bool isSuccess = 1;</code>
     *
     * <pre>
     * 登录成功否
     * </pre>
     */
    public boolean getIsSuccess() {
      return isSuccess_;
    }

    public static final int STATUS_FIELD_NUMBER = 2;
    private int status_;
    /**
     * <code>required int32 status = 2;</code>
     *
     * <pre>
     * 状态码
     * </pre>
     */
    public boolean hasStatus() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required int32 status = 2;</code>
     *
     * <pre>
     * 状态码
     * </pre>
     */
    public int getStatus() {
      return status_;
    }

    public static final int MESSAGE_FIELD_NUMBER = 3;
    private java.lang.Object message_;
    /**
     * <code>optional string message = 3;</code>
     *
     * <pre>
     * 附加信息
     * </pre>
     */
    public boolean hasMessage() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional string message = 3;</code>
     *
     * <pre>
     * 附加信息
     * </pre>
     */
    public java.lang.String getMessage() {
      java.lang.Object ref = message_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          message_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string message = 3;</code>
     *
     * <pre>
     * 附加信息
     * </pre>
     */
    public com.google.protobuf.ByteString
        getMessageBytes() {
      java.lang.Object ref = message_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        message_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int COMMANDS_FIELD_NUMBER = 4;
    private java.util.List<org.xiaoxiancai.imhere.common.protos.business.CommandProtos.Command> commands_;
    /**
     * <code>repeated .org.xiaoxiancai.imhere.server.business.protos.Command commands = 4;</code>
     *
     * <pre>
     * 需要执行的命令 
     * </pre>
     */
    public java.util.List<org.xiaoxiancai.imhere.common.protos.business.CommandProtos.Command> getCommandsList() {
      return commands_;
    }
    /**
     * <code>repeated .org.xiaoxiancai.imhere.server.business.protos.Command commands = 4;</code>
     *
     * <pre>
     * 需要执行的命令 
     * </pre>
     */
    public int getCommandsCount() {
      return commands_.size();
    }
    /**
     * <code>repeated .org.xiaoxiancai.imhere.server.business.protos.Command commands = 4;</code>
     *
     * <pre>
     * 需要执行的命令 
     * </pre>
     */
    public org.xiaoxiancai.imhere.common.protos.business.CommandProtos.Command getCommands(int index) {
      return commands_.get(index);
    }

    private void initFields() {
      isSuccess_ = false;
      status_ = 0;
      message_ = "";
      commands_ = java.util.Collections.emptyList();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasIsSuccess()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasStatus()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBool(1, isSuccess_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, status_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBytes(3, getMessageBytes());
      }
      for (int i = 0; i < commands_.size(); i++) {
        output.writeEnum(4, commands_.get(i).getNumber());
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(1, isSuccess_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, status_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, getMessageBytes());
      }
      {
        int dataSize = 0;
        for (int i = 0; i < commands_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeEnumSizeNoTag(commands_.get(i).getNumber());
        }
        size += dataSize;
        size += 1 * commands_.size();
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static org.xiaoxiancai.imhere.common.protos.business.LoginResponseProtos.LoginResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.xiaoxiancai.imhere.common.protos.business.LoginResponseProtos.LoginResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.xiaoxiancai.imhere.common.protos.business.LoginResponseProtos.LoginResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.xiaoxiancai.imhere.common.protos.business.LoginResponseProtos.LoginResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.xiaoxiancai.imhere.common.protos.business.LoginResponseProtos.LoginResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.xiaoxiancai.imhere.common.protos.business.LoginResponseProtos.LoginResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static org.xiaoxiancai.imhere.common.protos.business.LoginResponseProtos.LoginResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static org.xiaoxiancai.imhere.common.protos.business.LoginResponseProtos.LoginResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static org.xiaoxiancai.imhere.common.protos.business.LoginResponseProtos.LoginResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.xiaoxiancai.imhere.common.protos.business.LoginResponseProtos.LoginResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(org.xiaoxiancai.imhere.common.protos.business.LoginResponseProtos.LoginResponse prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code org.xiaoxiancai.imhere.server.business.protos.LoginResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:org.xiaoxiancai.imhere.server.business.protos.LoginResponse)
        org.xiaoxiancai.imhere.common.protos.business.LoginResponseProtos.LoginResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.xiaoxiancai.imhere.common.protos.business.LoginResponseProtos.internal_static_org_xiaoxiancai_imhere_server_business_protos_LoginResponse_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.xiaoxiancai.imhere.common.protos.business.LoginResponseProtos.internal_static_org_xiaoxiancai_imhere_server_business_protos_LoginResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.xiaoxiancai.imhere.common.protos.business.LoginResponseProtos.LoginResponse.class, org.xiaoxiancai.imhere.common.protos.business.LoginResponseProtos.LoginResponse.Builder.class);
      }

      // Construct using org.xiaoxiancai.imhere.common.protos.business.LoginResponseProtos.LoginResponse.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        isSuccess_ = false;
        bitField0_ = (bitField0_ & ~0x00000001);
        status_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        message_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        commands_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.xiaoxiancai.imhere.common.protos.business.LoginResponseProtos.internal_static_org_xiaoxiancai_imhere_server_business_protos_LoginResponse_descriptor;
      }

      public org.xiaoxiancai.imhere.common.protos.business.LoginResponseProtos.LoginResponse getDefaultInstanceForType() {
        return org.xiaoxiancai.imhere.common.protos.business.LoginResponseProtos.LoginResponse.getDefaultInstance();
      }

      public org.xiaoxiancai.imhere.common.protos.business.LoginResponseProtos.LoginResponse build() {
        org.xiaoxiancai.imhere.common.protos.business.LoginResponseProtos.LoginResponse result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public org.xiaoxiancai.imhere.common.protos.business.LoginResponseProtos.LoginResponse buildPartial() {
        org.xiaoxiancai.imhere.common.protos.business.LoginResponseProtos.LoginResponse result = new org.xiaoxiancai.imhere.common.protos.business.LoginResponseProtos.LoginResponse(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.isSuccess_ = isSuccess_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.status_ = status_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.message_ = message_;
        if (((bitField0_ & 0x00000008) == 0x00000008)) {
          commands_ = java.util.Collections.unmodifiableList(commands_);
          bitField0_ = (bitField0_ & ~0x00000008);
        }
        result.commands_ = commands_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.xiaoxiancai.imhere.common.protos.business.LoginResponseProtos.LoginResponse) {
          return mergeFrom((org.xiaoxiancai.imhere.common.protos.business.LoginResponseProtos.LoginResponse)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.xiaoxiancai.imhere.common.protos.business.LoginResponseProtos.LoginResponse other) {
        if (other == org.xiaoxiancai.imhere.common.protos.business.LoginResponseProtos.LoginResponse.getDefaultInstance()) return this;
        if (other.hasIsSuccess()) {
          setIsSuccess(other.getIsSuccess());
        }
        if (other.hasStatus()) {
          setStatus(other.getStatus());
        }
        if (other.hasMessage()) {
          bitField0_ |= 0x00000004;
          message_ = other.message_;
          onChanged();
        }
        if (!other.commands_.isEmpty()) {
          if (commands_.isEmpty()) {
            commands_ = other.commands_;
            bitField0_ = (bitField0_ & ~0x00000008);
          } else {
            ensureCommandsIsMutable();
            commands_.addAll(other.commands_);
          }
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasIsSuccess()) {
          
          return false;
        }
        if (!hasStatus()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.xiaoxiancai.imhere.common.protos.business.LoginResponseProtos.LoginResponse parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.xiaoxiancai.imhere.common.protos.business.LoginResponseProtos.LoginResponse) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private boolean isSuccess_ ;
      /**
       * <code>required bool isSuccess = 1;</code>
       *
       * <pre>
       * 登录成功否
       * </pre>
       */
      public boolean hasIsSuccess() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required bool isSuccess = 1;</code>
       *
       * <pre>
       * 登录成功否
       * </pre>
       */
      public boolean getIsSuccess() {
        return isSuccess_;
      }
      /**
       * <code>required bool isSuccess = 1;</code>
       *
       * <pre>
       * 登录成功否
       * </pre>
       */
      public Builder setIsSuccess(boolean value) {
        bitField0_ |= 0x00000001;
        isSuccess_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required bool isSuccess = 1;</code>
       *
       * <pre>
       * 登录成功否
       * </pre>
       */
      public Builder clearIsSuccess() {
        bitField0_ = (bitField0_ & ~0x00000001);
        isSuccess_ = false;
        onChanged();
        return this;
      }

      private int status_ ;
      /**
       * <code>required int32 status = 2;</code>
       *
       * <pre>
       * 状态码
       * </pre>
       */
      public boolean hasStatus() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required int32 status = 2;</code>
       *
       * <pre>
       * 状态码
       * </pre>
       */
      public int getStatus() {
        return status_;
      }
      /**
       * <code>required int32 status = 2;</code>
       *
       * <pre>
       * 状态码
       * </pre>
       */
      public Builder setStatus(int value) {
        bitField0_ |= 0x00000002;
        status_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 status = 2;</code>
       *
       * <pre>
       * 状态码
       * </pre>
       */
      public Builder clearStatus() {
        bitField0_ = (bitField0_ & ~0x00000002);
        status_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object message_ = "";
      /**
       * <code>optional string message = 3;</code>
       *
       * <pre>
       * 附加信息
       * </pre>
       */
      public boolean hasMessage() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional string message = 3;</code>
       *
       * <pre>
       * 附加信息
       * </pre>
       */
      public java.lang.String getMessage() {
        java.lang.Object ref = message_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            message_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string message = 3;</code>
       *
       * <pre>
       * 附加信息
       * </pre>
       */
      public com.google.protobuf.ByteString
          getMessageBytes() {
        java.lang.Object ref = message_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          message_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string message = 3;</code>
       *
       * <pre>
       * 附加信息
       * </pre>
       */
      public Builder setMessage(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        message_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string message = 3;</code>
       *
       * <pre>
       * 附加信息
       * </pre>
       */
      public Builder clearMessage() {
        bitField0_ = (bitField0_ & ~0x00000004);
        message_ = getDefaultInstance().getMessage();
        onChanged();
        return this;
      }
      /**
       * <code>optional string message = 3;</code>
       *
       * <pre>
       * 附加信息
       * </pre>
       */
      public Builder setMessageBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        message_ = value;
        onChanged();
        return this;
      }

      private java.util.List<org.xiaoxiancai.imhere.common.protos.business.CommandProtos.Command> commands_ =
        java.util.Collections.emptyList();
      private void ensureCommandsIsMutable() {
        if (!((bitField0_ & 0x00000008) == 0x00000008)) {
          commands_ = new java.util.ArrayList<org.xiaoxiancai.imhere.common.protos.business.CommandProtos.Command>(commands_);
          bitField0_ |= 0x00000008;
        }
      }
      /**
       * <code>repeated .org.xiaoxiancai.imhere.server.business.protos.Command commands = 4;</code>
       *
       * <pre>
       * 需要执行的命令 
       * </pre>
       */
      public java.util.List<org.xiaoxiancai.imhere.common.protos.business.CommandProtos.Command> getCommandsList() {
        return java.util.Collections.unmodifiableList(commands_);
      }
      /**
       * <code>repeated .org.xiaoxiancai.imhere.server.business.protos.Command commands = 4;</code>
       *
       * <pre>
       * 需要执行的命令 
       * </pre>
       */
      public int getCommandsCount() {
        return commands_.size();
      }
      /**
       * <code>repeated .org.xiaoxiancai.imhere.server.business.protos.Command commands = 4;</code>
       *
       * <pre>
       * 需要执行的命令 
       * </pre>
       */
      public org.xiaoxiancai.imhere.common.protos.business.CommandProtos.Command getCommands(int index) {
        return commands_.get(index);
      }
      /**
       * <code>repeated .org.xiaoxiancai.imhere.server.business.protos.Command commands = 4;</code>
       *
       * <pre>
       * 需要执行的命令 
       * </pre>
       */
      public Builder setCommands(
          int index, org.xiaoxiancai.imhere.common.protos.business.CommandProtos.Command value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCommandsIsMutable();
        commands_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated .org.xiaoxiancai.imhere.server.business.protos.Command commands = 4;</code>
       *
       * <pre>
       * 需要执行的命令 
       * </pre>
       */
      public Builder addCommands(org.xiaoxiancai.imhere.common.protos.business.CommandProtos.Command value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCommandsIsMutable();
        commands_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated .org.xiaoxiancai.imhere.server.business.protos.Command commands = 4;</code>
       *
       * <pre>
       * 需要执行的命令 
       * </pre>
       */
      public Builder addAllCommands(
          java.lang.Iterable<? extends org.xiaoxiancai.imhere.common.protos.business.CommandProtos.Command> values) {
        ensureCommandsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, commands_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated .org.xiaoxiancai.imhere.server.business.protos.Command commands = 4;</code>
       *
       * <pre>
       * 需要执行的命令 
       * </pre>
       */
      public Builder clearCommands() {
        commands_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000008);
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:org.xiaoxiancai.imhere.server.business.protos.LoginResponse)
    }

    static {
      defaultInstance = new LoginResponse(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:org.xiaoxiancai.imhere.server.business.protos.LoginResponse)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_xiaoxiancai_imhere_server_business_protos_LoginResponse_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_org_xiaoxiancai_imhere_server_business_protos_LoginResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023LoginResponse.proto\022-org.xiaoxiancai.i" +
      "mhere.server.business.protos\032\023CommandPro" +
      "tos.proto\"\215\001\n\rLoginResponse\022\021\n\tisSuccess" +
      "\030\001 \002(\010\022\016\n\006status\030\002 \002(\005\022\017\n\007message\030\003 \001(\t\022" +
      "H\n\010commands\030\004 \003(\01626.org.xiaoxiancai.imhe" +
      "re.server.business.protos.CommandBD\n-org" +
      ".xiaoxiancai.imhere.common.protos.busine" +
      "ssB\023LoginResponseProtos"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.xiaoxiancai.imhere.common.protos.business.CommandProtos.getDescriptor(),
        }, assigner);
    internal_static_org_xiaoxiancai_imhere_server_business_protos_LoginResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_org_xiaoxiancai_imhere_server_business_protos_LoginResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_org_xiaoxiancai_imhere_server_business_protos_LoginResponse_descriptor,
        new java.lang.String[] { "IsSuccess", "Status", "Message", "Commands", });
    org.xiaoxiancai.imhere.common.protos.business.CommandProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
