// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CommandProtos.proto

package org.xiaoxiancai.imhere.common.protos.business;

public final class CommandProtos {
  private CommandProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  /**
   * Protobuf enum {@code org.xiaoxiancai.imhere.server.business.protos.Command}
   */
  public enum Command
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>UPDATE_FRIENDLIST = 0;</code>
     */
    UPDATE_FRIENDLIST(0, 0),
    /**
     * <code>UPDATE_INFOLIST = 1;</code>
     */
    UPDATE_INFOLIST(1, 1),
    ;

    /**
     * <code>UPDATE_FRIENDLIST = 0;</code>
     */
    public static final int UPDATE_FRIENDLIST_VALUE = 0;
    /**
     * <code>UPDATE_INFOLIST = 1;</code>
     */
    public static final int UPDATE_INFOLIST_VALUE = 1;


    public final int getNumber() { return value; }

    public static Command valueOf(int value) {
      switch (value) {
        case 0: return UPDATE_FRIENDLIST;
        case 1: return UPDATE_INFOLIST;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Command>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static com.google.protobuf.Internal.EnumLiteMap<Command>
        internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Command>() {
            public Command findValueByNumber(int number) {
              return Command.valueOf(number);
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
      return org.xiaoxiancai.imhere.common.protos.business.CommandProtos.getDescriptor().getEnumTypes().get(0);
    }

    private static final Command[] VALUES = values();

    public static Command valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int index;
    private final int value;

    private Command(int index, int value) {
      this.index = index;
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:org.xiaoxiancai.imhere.server.business.protos.Command)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023CommandProtos.proto\022-org.xiaoxiancai.i" +
      "mhere.server.business.protos*5\n\007Command\022" +
      "\025\n\021UPDATE_FRIENDLIST\020\000\022\023\n\017UPDATE_INFOLIS" +
      "T\020\001B>\n-org.xiaoxiancai.imhere.common.pro" +
      "tos.businessB\rCommandProtos"
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