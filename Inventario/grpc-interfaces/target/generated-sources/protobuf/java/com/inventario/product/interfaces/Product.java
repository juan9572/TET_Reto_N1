// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: product.proto

package com.inventario.product.interfaces;

/**
 * Protobuf type {@code com.inventario.product.interfaces.Product}
 */
public final class Product extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.inventario.product.interfaces.Product)
    ProductOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Product.newBuilder() to construct.
  private Product(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Product() {
    name_ = "";
    description_ = "";
    seller_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Product();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.inventario.product.interfaces.InventarioInterface.internal_static_com_inventario_product_interfaces_Product_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.inventario.product.interfaces.InventarioInterface.internal_static_com_inventario_product_interfaces_Product_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.inventario.product.interfaces.Product.class, com.inventario.product.interfaces.Product.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   * <code>string name = 1;</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DESCRIPTION_FIELD_NUMBER = 2;
  private volatile java.lang.Object description_;
  /**
   * <code>string description = 2;</code>
   * @return The description.
   */
  @java.lang.Override
  public java.lang.String getDescription() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      description_ = s;
      return s;
    }
  }
  /**
   * <code>string description = 2;</code>
   * @return The bytes for description.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDescriptionBytes() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      description_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PRICE_FIELD_NUMBER = 3;
  private double price_;
  /**
   * <code>double price = 3;</code>
   * @return The price.
   */
  @java.lang.Override
  public double getPrice() {
    return price_;
  }

  public static final int STOCK_QUANTITY_FIELD_NUMBER = 4;
  private int stockQuantity_;
  /**
   * <code>int32 stock_quantity = 4;</code>
   * @return The stockQuantity.
   */
  @java.lang.Override
  public int getStockQuantity() {
    return stockQuantity_;
  }

  public static final int SELLER_FIELD_NUMBER = 5;
  private volatile java.lang.Object seller_;
  /**
   * <code>string seller = 5;</code>
   * @return The seller.
   */
  @java.lang.Override
  public java.lang.String getSeller() {
    java.lang.Object ref = seller_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      seller_ = s;
      return s;
    }
  }
  /**
   * <code>string seller = 5;</code>
   * @return The bytes for seller.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSellerBytes() {
    java.lang.Object ref = seller_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      seller_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(description_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, description_);
    }
    if (java.lang.Double.doubleToRawLongBits(price_) != 0) {
      output.writeDouble(3, price_);
    }
    if (stockQuantity_ != 0) {
      output.writeInt32(4, stockQuantity_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(seller_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, seller_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(description_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, description_);
    }
    if (java.lang.Double.doubleToRawLongBits(price_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(3, price_);
    }
    if (stockQuantity_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, stockQuantity_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(seller_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, seller_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.inventario.product.interfaces.Product)) {
      return super.equals(obj);
    }
    com.inventario.product.interfaces.Product other = (com.inventario.product.interfaces.Product) obj;

    if (!getName()
        .equals(other.getName())) return false;
    if (!getDescription()
        .equals(other.getDescription())) return false;
    if (java.lang.Double.doubleToLongBits(getPrice())
        != java.lang.Double.doubleToLongBits(
            other.getPrice())) return false;
    if (getStockQuantity()
        != other.getStockQuantity()) return false;
    if (!getSeller()
        .equals(other.getSeller())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + DESCRIPTION_FIELD_NUMBER;
    hash = (53 * hash) + getDescription().hashCode();
    hash = (37 * hash) + PRICE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getPrice()));
    hash = (37 * hash) + STOCK_QUANTITY_FIELD_NUMBER;
    hash = (53 * hash) + getStockQuantity();
    hash = (37 * hash) + SELLER_FIELD_NUMBER;
    hash = (53 * hash) + getSeller().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.inventario.product.interfaces.Product parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.inventario.product.interfaces.Product parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.inventario.product.interfaces.Product parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.inventario.product.interfaces.Product parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.inventario.product.interfaces.Product parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.inventario.product.interfaces.Product parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.inventario.product.interfaces.Product parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.inventario.product.interfaces.Product parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.inventario.product.interfaces.Product parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.inventario.product.interfaces.Product parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.inventario.product.interfaces.Product parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.inventario.product.interfaces.Product parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.inventario.product.interfaces.Product prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code com.inventario.product.interfaces.Product}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.inventario.product.interfaces.Product)
      com.inventario.product.interfaces.ProductOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.inventario.product.interfaces.InventarioInterface.internal_static_com_inventario_product_interfaces_Product_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.inventario.product.interfaces.InventarioInterface.internal_static_com_inventario_product_interfaces_Product_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.inventario.product.interfaces.Product.class, com.inventario.product.interfaces.Product.Builder.class);
    }

    // Construct using com.inventario.product.interfaces.Product.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      name_ = "";

      description_ = "";

      price_ = 0D;

      stockQuantity_ = 0;

      seller_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.inventario.product.interfaces.InventarioInterface.internal_static_com_inventario_product_interfaces_Product_descriptor;
    }

    @java.lang.Override
    public com.inventario.product.interfaces.Product getDefaultInstanceForType() {
      return com.inventario.product.interfaces.Product.getDefaultInstance();
    }

    @java.lang.Override
    public com.inventario.product.interfaces.Product build() {
      com.inventario.product.interfaces.Product result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.inventario.product.interfaces.Product buildPartial() {
      com.inventario.product.interfaces.Product result = new com.inventario.product.interfaces.Product(this);
      result.name_ = name_;
      result.description_ = description_;
      result.price_ = price_;
      result.stockQuantity_ = stockQuantity_;
      result.seller_ = seller_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.inventario.product.interfaces.Product) {
        return mergeFrom((com.inventario.product.interfaces.Product)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.inventario.product.interfaces.Product other) {
      if (other == com.inventario.product.interfaces.Product.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (!other.getDescription().isEmpty()) {
        description_ = other.description_;
        onChanged();
      }
      if (other.getPrice() != 0D) {
        setPrice(other.getPrice());
      }
      if (other.getStockQuantity() != 0) {
        setStockQuantity(other.getStockQuantity());
      }
      if (!other.getSeller().isEmpty()) {
        seller_ = other.seller_;
        onChanged();
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              name_ = input.readStringRequireUtf8();

              break;
            } // case 10
            case 18: {
              description_ = input.readStringRequireUtf8();

              break;
            } // case 18
            case 25: {
              price_ = input.readDouble();

              break;
            } // case 25
            case 32: {
              stockQuantity_ = input.readInt32();

              break;
            } // case 32
            case 42: {
              seller_ = input.readStringRequireUtf8();

              break;
            } // case 42
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <code>string name = 1;</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string name = 1;</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string name = 1;</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string name = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <code>string name = 1;</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object description_ = "";
    /**
     * <code>string description = 2;</code>
     * @return The description.
     */
    public java.lang.String getDescription() {
      java.lang.Object ref = description_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        description_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string description = 2;</code>
     * @return The bytes for description.
     */
    public com.google.protobuf.ByteString
        getDescriptionBytes() {
      java.lang.Object ref = description_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        description_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string description = 2;</code>
     * @param value The description to set.
     * @return This builder for chaining.
     */
    public Builder setDescription(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      description_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string description = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearDescription() {
      
      description_ = getDefaultInstance().getDescription();
      onChanged();
      return this;
    }
    /**
     * <code>string description = 2;</code>
     * @param value The bytes for description to set.
     * @return This builder for chaining.
     */
    public Builder setDescriptionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      description_ = value;
      onChanged();
      return this;
    }

    private double price_ ;
    /**
     * <code>double price = 3;</code>
     * @return The price.
     */
    @java.lang.Override
    public double getPrice() {
      return price_;
    }
    /**
     * <code>double price = 3;</code>
     * @param value The price to set.
     * @return This builder for chaining.
     */
    public Builder setPrice(double value) {
      
      price_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double price = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearPrice() {
      
      price_ = 0D;
      onChanged();
      return this;
    }

    private int stockQuantity_ ;
    /**
     * <code>int32 stock_quantity = 4;</code>
     * @return The stockQuantity.
     */
    @java.lang.Override
    public int getStockQuantity() {
      return stockQuantity_;
    }
    /**
     * <code>int32 stock_quantity = 4;</code>
     * @param value The stockQuantity to set.
     * @return This builder for chaining.
     */
    public Builder setStockQuantity(int value) {
      
      stockQuantity_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 stock_quantity = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearStockQuantity() {
      
      stockQuantity_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object seller_ = "";
    /**
     * <code>string seller = 5;</code>
     * @return The seller.
     */
    public java.lang.String getSeller() {
      java.lang.Object ref = seller_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        seller_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string seller = 5;</code>
     * @return The bytes for seller.
     */
    public com.google.protobuf.ByteString
        getSellerBytes() {
      java.lang.Object ref = seller_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        seller_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string seller = 5;</code>
     * @param value The seller to set.
     * @return This builder for chaining.
     */
    public Builder setSeller(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      seller_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string seller = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearSeller() {
      
      seller_ = getDefaultInstance().getSeller();
      onChanged();
      return this;
    }
    /**
     * <code>string seller = 5;</code>
     * @param value The bytes for seller to set.
     * @return This builder for chaining.
     */
    public Builder setSellerBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      seller_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:com.inventario.product.interfaces.Product)
  }

  // @@protoc_insertion_point(class_scope:com.inventario.product.interfaces.Product)
  private static final com.inventario.product.interfaces.Product DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.inventario.product.interfaces.Product();
  }

  public static com.inventario.product.interfaces.Product getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Product>
      PARSER = new com.google.protobuf.AbstractParser<Product>() {
    @java.lang.Override
    public Product parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<Product> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Product> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.inventario.product.interfaces.Product getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

