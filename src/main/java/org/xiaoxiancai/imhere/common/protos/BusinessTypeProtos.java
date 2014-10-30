// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BusinessTypeProtos.proto

package org.xiaoxiancai.imhere.common.protos;

public final class BusinessTypeProtos {
  private BusinessTypeProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  /**
   * Protobuf enum {@code org.xiaoxiancai.imhere.common.protos.BusinessType}
   *
   * <pre>
   * 业务类型
   * </pre>
   */
  public enum BusinessType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>REGISTER = 0;</code>
     *
     * <pre>
     * 注册
     * </pre>
     */
    REGISTER(0, 0),
    /**
     * <code>UPDATE = 1;</code>
     *
     * <pre>
     * 更新
     * </pre>
     */
    UPDATE(1, 1),
    /**
     * <code>LOCATE = 2;</code>
     *
     * <pre>
     * 定位
     * </pre>
     */
    LOCATE(2, 2),
    ;

    /**
     * <code>REGISTER = 0;</code>
     *
     * <pre>
     * 注册
     * </pre>
     */
    public static final int REGISTER_VALUE = 0;
    /**
     * <code>UPDATE = 1;</code>
     *
     * <pre>
     * 更新
     * </pre>
     */
    public static final int UPDATE_VALUE = 1;
    /**
     * <code>LOCATE = 2;</code>
     *
     * <pre>
     * 定位
     * </pre>
     */
    public static final int LOCATE_VALUE = 2;


    public final int getNumber() { return value; }

    public static BusinessType valueOf(int value) {
      switch (value) {
        case 0: return REGISTER;
        case 1: return UPDATE;
        case 2: return LOCATE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<BusinessType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static com.google.protobuf.Internal.EnumLiteMap<BusinessType>
        internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<BusinessType>() {
            public BusinessType findValueByNumber(int number) {
              return BusinessType.valueOf(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(index);
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return org.xiaoxiancai.imhere.common.protos.BusinessTypeProtos.getDescriptor().getEnumTypes().get(0);
    }

    private static final BusinessType[] VALUES = values();

    public static BusinessType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int index;
    private final int value;

    private BusinessType(int index, int value) {
      this.index = index;
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:org.xiaoxiancai.imhere.common.protos.BusinessType)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030BusinessTypeProtos.proto\022$org.xiaoxian" +
      "cai.imhere.common.protos*8\n\014BusinessType" +
      "\022\014\n\010REGISTER\020\000\022\n\n\006UPDATE\020\001\022\n\n\006LOCATE\020\002\032\002" +
      "\020\001B:\n$org.xiaoxiancai.imhere.common.prot" +
      "osB\022BusinessTypeProtos"
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
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}
