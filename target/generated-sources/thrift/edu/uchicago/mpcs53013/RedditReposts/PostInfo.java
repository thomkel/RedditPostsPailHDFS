/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package edu.uchicago.mpcs53013.RedditReposts;

import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PostInfo implements org.apache.thrift.TBase<PostInfo, PostInfo._Fields>, java.io.Serializable, Cloneable, Comparable<PostInfo> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("PostInfo");

  private static final org.apache.thrift.protocol.TField REDDIT_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("reddit_id", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField IMAGE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("image_id", org.apache.thrift.protocol.TType.I16, (short)2);
  private static final org.apache.thrift.protocol.TField TITLE_FIELD_DESC = new org.apache.thrift.protocol.TField("title", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField SUBREDDIT_FIELD_DESC = new org.apache.thrift.protocol.TField("subreddit", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField NUMBER_OF_COMMENTS_FIELD_DESC = new org.apache.thrift.protocol.TField("number_of_comments", org.apache.thrift.protocol.TType.I16, (short)5);
  private static final org.apache.thrift.protocol.TField USERNAME_FIELD_DESC = new org.apache.thrift.protocol.TField("username", org.apache.thrift.protocol.TType.STRING, (short)6);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new PostInfoStandardSchemeFactory());
    schemes.put(TupleScheme.class, new PostInfoTupleSchemeFactory());
  }

  public String reddit_id; // required
  public short image_id; // required
  public String title; // optional
  public String subreddit; // optional
  public short number_of_comments; // optional
  public String username; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    REDDIT_ID((short)1, "reddit_id"),
    IMAGE_ID((short)2, "image_id"),
    TITLE((short)3, "title"),
    SUBREDDIT((short)4, "subreddit"),
    NUMBER_OF_COMMENTS((short)5, "number_of_comments"),
    USERNAME((short)6, "username");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // REDDIT_ID
          return REDDIT_ID;
        case 2: // IMAGE_ID
          return IMAGE_ID;
        case 3: // TITLE
          return TITLE;
        case 4: // SUBREDDIT
          return SUBREDDIT;
        case 5: // NUMBER_OF_COMMENTS
          return NUMBER_OF_COMMENTS;
        case 6: // USERNAME
          return USERNAME;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __IMAGE_ID_ISSET_ID = 0;
  private static final int __NUMBER_OF_COMMENTS_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private _Fields optionals[] = {_Fields.TITLE,_Fields.SUBREDDIT,_Fields.NUMBER_OF_COMMENTS,_Fields.USERNAME};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.REDDIT_ID, new org.apache.thrift.meta_data.FieldMetaData("reddit_id", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.IMAGE_ID, new org.apache.thrift.meta_data.FieldMetaData("image_id", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I16)));
    tmpMap.put(_Fields.TITLE, new org.apache.thrift.meta_data.FieldMetaData("title", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SUBREDDIT, new org.apache.thrift.meta_data.FieldMetaData("subreddit", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.NUMBER_OF_COMMENTS, new org.apache.thrift.meta_data.FieldMetaData("number_of_comments", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I16)));
    tmpMap.put(_Fields.USERNAME, new org.apache.thrift.meta_data.FieldMetaData("username", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(PostInfo.class, metaDataMap);
  }

  public PostInfo() {
  }

  public PostInfo(
    String reddit_id,
    short image_id)
  {
    this();
    this.reddit_id = reddit_id;
    this.image_id = image_id;
    setImage_idIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public PostInfo(PostInfo other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetReddit_id()) {
      this.reddit_id = other.reddit_id;
    }
    this.image_id = other.image_id;
    if (other.isSetTitle()) {
      this.title = other.title;
    }
    if (other.isSetSubreddit()) {
      this.subreddit = other.subreddit;
    }
    this.number_of_comments = other.number_of_comments;
    if (other.isSetUsername()) {
      this.username = other.username;
    }
  }

  public PostInfo deepCopy() {
    return new PostInfo(this);
  }

  @Override
  public void clear() {
    this.reddit_id = null;
    setImage_idIsSet(false);
    this.image_id = 0;
    this.title = null;
    this.subreddit = null;
    setNumber_of_commentsIsSet(false);
    this.number_of_comments = 0;
    this.username = null;
  }

  public String getReddit_id() {
    return this.reddit_id;
  }

  public PostInfo setReddit_id(String reddit_id) {
    this.reddit_id = reddit_id;
    return this;
  }

  public void unsetReddit_id() {
    this.reddit_id = null;
  }

  /** Returns true if field reddit_id is set (has been assigned a value) and false otherwise */
  public boolean isSetReddit_id() {
    return this.reddit_id != null;
  }

  public void setReddit_idIsSet(boolean value) {
    if (!value) {
      this.reddit_id = null;
    }
  }

  public short getImage_id() {
    return this.image_id;
  }

  public PostInfo setImage_id(short image_id) {
    this.image_id = image_id;
    setImage_idIsSet(true);
    return this;
  }

  public void unsetImage_id() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __IMAGE_ID_ISSET_ID);
  }

  /** Returns true if field image_id is set (has been assigned a value) and false otherwise */
  public boolean isSetImage_id() {
    return EncodingUtils.testBit(__isset_bitfield, __IMAGE_ID_ISSET_ID);
  }

  public void setImage_idIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __IMAGE_ID_ISSET_ID, value);
  }

  public String getTitle() {
    return this.title;
  }

  public PostInfo setTitle(String title) {
    this.title = title;
    return this;
  }

  public void unsetTitle() {
    this.title = null;
  }

  /** Returns true if field title is set (has been assigned a value) and false otherwise */
  public boolean isSetTitle() {
    return this.title != null;
  }

  public void setTitleIsSet(boolean value) {
    if (!value) {
      this.title = null;
    }
  }

  public String getSubreddit() {
    return this.subreddit;
  }

  public PostInfo setSubreddit(String subreddit) {
    this.subreddit = subreddit;
    return this;
  }

  public void unsetSubreddit() {
    this.subreddit = null;
  }

  /** Returns true if field subreddit is set (has been assigned a value) and false otherwise */
  public boolean isSetSubreddit() {
    return this.subreddit != null;
  }

  public void setSubredditIsSet(boolean value) {
    if (!value) {
      this.subreddit = null;
    }
  }

  public short getNumber_of_comments() {
    return this.number_of_comments;
  }

  public PostInfo setNumber_of_comments(short number_of_comments) {
    this.number_of_comments = number_of_comments;
    setNumber_of_commentsIsSet(true);
    return this;
  }

  public void unsetNumber_of_comments() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __NUMBER_OF_COMMENTS_ISSET_ID);
  }

  /** Returns true if field number_of_comments is set (has been assigned a value) and false otherwise */
  public boolean isSetNumber_of_comments() {
    return EncodingUtils.testBit(__isset_bitfield, __NUMBER_OF_COMMENTS_ISSET_ID);
  }

  public void setNumber_of_commentsIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __NUMBER_OF_COMMENTS_ISSET_ID, value);
  }

  public String getUsername() {
    return this.username;
  }

  public PostInfo setUsername(String username) {
    this.username = username;
    return this;
  }

  public void unsetUsername() {
    this.username = null;
  }

  /** Returns true if field username is set (has been assigned a value) and false otherwise */
  public boolean isSetUsername() {
    return this.username != null;
  }

  public void setUsernameIsSet(boolean value) {
    if (!value) {
      this.username = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case REDDIT_ID:
      if (value == null) {
        unsetReddit_id();
      } else {
        setReddit_id((String)value);
      }
      break;

    case IMAGE_ID:
      if (value == null) {
        unsetImage_id();
      } else {
        setImage_id((Short)value);
      }
      break;

    case TITLE:
      if (value == null) {
        unsetTitle();
      } else {
        setTitle((String)value);
      }
      break;

    case SUBREDDIT:
      if (value == null) {
        unsetSubreddit();
      } else {
        setSubreddit((String)value);
      }
      break;

    case NUMBER_OF_COMMENTS:
      if (value == null) {
        unsetNumber_of_comments();
      } else {
        setNumber_of_comments((Short)value);
      }
      break;

    case USERNAME:
      if (value == null) {
        unsetUsername();
      } else {
        setUsername((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case REDDIT_ID:
      return getReddit_id();

    case IMAGE_ID:
      return Short.valueOf(getImage_id());

    case TITLE:
      return getTitle();

    case SUBREDDIT:
      return getSubreddit();

    case NUMBER_OF_COMMENTS:
      return Short.valueOf(getNumber_of_comments());

    case USERNAME:
      return getUsername();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case REDDIT_ID:
      return isSetReddit_id();
    case IMAGE_ID:
      return isSetImage_id();
    case TITLE:
      return isSetTitle();
    case SUBREDDIT:
      return isSetSubreddit();
    case NUMBER_OF_COMMENTS:
      return isSetNumber_of_comments();
    case USERNAME:
      return isSetUsername();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof PostInfo)
      return this.equals((PostInfo)that);
    return false;
  }

  public boolean equals(PostInfo that) {
    if (that == null)
      return false;

    boolean this_present_reddit_id = true && this.isSetReddit_id();
    boolean that_present_reddit_id = true && that.isSetReddit_id();
    if (this_present_reddit_id || that_present_reddit_id) {
      if (!(this_present_reddit_id && that_present_reddit_id))
        return false;
      if (!this.reddit_id.equals(that.reddit_id))
        return false;
    }

    boolean this_present_image_id = true;
    boolean that_present_image_id = true;
    if (this_present_image_id || that_present_image_id) {
      if (!(this_present_image_id && that_present_image_id))
        return false;
      if (this.image_id != that.image_id)
        return false;
    }

    boolean this_present_title = true && this.isSetTitle();
    boolean that_present_title = true && that.isSetTitle();
    if (this_present_title || that_present_title) {
      if (!(this_present_title && that_present_title))
        return false;
      if (!this.title.equals(that.title))
        return false;
    }

    boolean this_present_subreddit = true && this.isSetSubreddit();
    boolean that_present_subreddit = true && that.isSetSubreddit();
    if (this_present_subreddit || that_present_subreddit) {
      if (!(this_present_subreddit && that_present_subreddit))
        return false;
      if (!this.subreddit.equals(that.subreddit))
        return false;
    }

    boolean this_present_number_of_comments = true && this.isSetNumber_of_comments();
    boolean that_present_number_of_comments = true && that.isSetNumber_of_comments();
    if (this_present_number_of_comments || that_present_number_of_comments) {
      if (!(this_present_number_of_comments && that_present_number_of_comments))
        return false;
      if (this.number_of_comments != that.number_of_comments)
        return false;
    }

    boolean this_present_username = true && this.isSetUsername();
    boolean that_present_username = true && that.isSetUsername();
    if (this_present_username || that_present_username) {
      if (!(this_present_username && that_present_username))
        return false;
      if (!this.username.equals(that.username))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_reddit_id = true && (isSetReddit_id());
    builder.append(present_reddit_id);
    if (present_reddit_id)
      builder.append(reddit_id);

    boolean present_image_id = true;
    builder.append(present_image_id);
    if (present_image_id)
      builder.append(image_id);

    boolean present_title = true && (isSetTitle());
    builder.append(present_title);
    if (present_title)
      builder.append(title);

    boolean present_subreddit = true && (isSetSubreddit());
    builder.append(present_subreddit);
    if (present_subreddit)
      builder.append(subreddit);

    boolean present_number_of_comments = true && (isSetNumber_of_comments());
    builder.append(present_number_of_comments);
    if (present_number_of_comments)
      builder.append(number_of_comments);

    boolean present_username = true && (isSetUsername());
    builder.append(present_username);
    if (present_username)
      builder.append(username);

    return builder.toHashCode();
  }

  @Override
  public int compareTo(PostInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetReddit_id()).compareTo(other.isSetReddit_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetReddit_id()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.reddit_id, other.reddit_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetImage_id()).compareTo(other.isSetImage_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetImage_id()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.image_id, other.image_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTitle()).compareTo(other.isSetTitle());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTitle()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.title, other.title);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSubreddit()).compareTo(other.isSetSubreddit());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSubreddit()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.subreddit, other.subreddit);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetNumber_of_comments()).compareTo(other.isSetNumber_of_comments());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNumber_of_comments()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.number_of_comments, other.number_of_comments);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetUsername()).compareTo(other.isSetUsername());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUsername()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.username, other.username);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("PostInfo(");
    boolean first = true;

    sb.append("reddit_id:");
    if (this.reddit_id == null) {
      sb.append("null");
    } else {
      sb.append(this.reddit_id);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("image_id:");
    sb.append(this.image_id);
    first = false;
    if (isSetTitle()) {
      if (!first) sb.append(", ");
      sb.append("title:");
      if (this.title == null) {
        sb.append("null");
      } else {
        sb.append(this.title);
      }
      first = false;
    }
    if (isSetSubreddit()) {
      if (!first) sb.append(", ");
      sb.append("subreddit:");
      if (this.subreddit == null) {
        sb.append("null");
      } else {
        sb.append(this.subreddit);
      }
      first = false;
    }
    if (isSetNumber_of_comments()) {
      if (!first) sb.append(", ");
      sb.append("number_of_comments:");
      sb.append(this.number_of_comments);
      first = false;
    }
    if (isSetUsername()) {
      if (!first) sb.append(", ");
      sb.append("username:");
      if (this.username == null) {
        sb.append("null");
      } else {
        sb.append(this.username);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (reddit_id == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'reddit_id' was not present! Struct: " + toString());
    }
    // alas, we cannot check 'image_id' because it's a primitive and you chose the non-beans generator.
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class PostInfoStandardSchemeFactory implements SchemeFactory {
    public PostInfoStandardScheme getScheme() {
      return new PostInfoStandardScheme();
    }
  }

  private static class PostInfoStandardScheme extends StandardScheme<PostInfo> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, PostInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // REDDIT_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.reddit_id = iprot.readString();
              struct.setReddit_idIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // IMAGE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I16) {
              struct.image_id = iprot.readI16();
              struct.setImage_idIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // TITLE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.title = iprot.readString();
              struct.setTitleIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // SUBREDDIT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.subreddit = iprot.readString();
              struct.setSubredditIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // NUMBER_OF_COMMENTS
            if (schemeField.type == org.apache.thrift.protocol.TType.I16) {
              struct.number_of_comments = iprot.readI16();
              struct.setNumber_of_commentsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // USERNAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.username = iprot.readString();
              struct.setUsernameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      if (!struct.isSetImage_id()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'image_id' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, PostInfo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.reddit_id != null) {
        oprot.writeFieldBegin(REDDIT_ID_FIELD_DESC);
        oprot.writeString(struct.reddit_id);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(IMAGE_ID_FIELD_DESC);
      oprot.writeI16(struct.image_id);
      oprot.writeFieldEnd();
      if (struct.title != null) {
        if (struct.isSetTitle()) {
          oprot.writeFieldBegin(TITLE_FIELD_DESC);
          oprot.writeString(struct.title);
          oprot.writeFieldEnd();
        }
      }
      if (struct.subreddit != null) {
        if (struct.isSetSubreddit()) {
          oprot.writeFieldBegin(SUBREDDIT_FIELD_DESC);
          oprot.writeString(struct.subreddit);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetNumber_of_comments()) {
        oprot.writeFieldBegin(NUMBER_OF_COMMENTS_FIELD_DESC);
        oprot.writeI16(struct.number_of_comments);
        oprot.writeFieldEnd();
      }
      if (struct.username != null) {
        if (struct.isSetUsername()) {
          oprot.writeFieldBegin(USERNAME_FIELD_DESC);
          oprot.writeString(struct.username);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class PostInfoTupleSchemeFactory implements SchemeFactory {
    public PostInfoTupleScheme getScheme() {
      return new PostInfoTupleScheme();
    }
  }

  private static class PostInfoTupleScheme extends TupleScheme<PostInfo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, PostInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.reddit_id);
      oprot.writeI16(struct.image_id);
      BitSet optionals = new BitSet();
      if (struct.isSetTitle()) {
        optionals.set(0);
      }
      if (struct.isSetSubreddit()) {
        optionals.set(1);
      }
      if (struct.isSetNumber_of_comments()) {
        optionals.set(2);
      }
      if (struct.isSetUsername()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetTitle()) {
        oprot.writeString(struct.title);
      }
      if (struct.isSetSubreddit()) {
        oprot.writeString(struct.subreddit);
      }
      if (struct.isSetNumber_of_comments()) {
        oprot.writeI16(struct.number_of_comments);
      }
      if (struct.isSetUsername()) {
        oprot.writeString(struct.username);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, PostInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.reddit_id = iprot.readString();
      struct.setReddit_idIsSet(true);
      struct.image_id = iprot.readI16();
      struct.setImage_idIsSet(true);
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.title = iprot.readString();
        struct.setTitleIsSet(true);
      }
      if (incoming.get(1)) {
        struct.subreddit = iprot.readString();
        struct.setSubredditIsSet(true);
      }
      if (incoming.get(2)) {
        struct.number_of_comments = iprot.readI16();
        struct.setNumber_of_commentsIsSet(true);
      }
      if (incoming.get(3)) {
        struct.username = iprot.readString();
        struct.setUsernameIsSet(true);
      }
    }
  }

}
