/**
 * Autogenerated by Thrift Compiler (0.12.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.hbase.thrift2.generated;


/**
 * Thrift wrapper around
 * org.apache.hadoop.hbase.io.compress.Algorithm
 */
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.12.0)", date = "2019-01-27")
public enum TCompressionAlgorithm implements org.apache.thrift.TEnum {
  LZO(0),
  GZ(1),
  NONE(2),
  SNAPPY(3),
  LZ4(4),
  BZIP2(5),
  ZSTD(6);

  private final int value;

  private TCompressionAlgorithm(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  @org.apache.thrift.annotation.Nullable
  public static TCompressionAlgorithm findByValue(int value) { 
    switch (value) {
      case 0:
        return LZO;
      case 1:
        return GZ;
      case 2:
        return NONE;
      case 3:
        return SNAPPY;
      case 4:
        return LZ4;
      case 5:
        return BZIP2;
      case 6:
        return ZSTD;
      default:
        return null;
    }
  }
}
