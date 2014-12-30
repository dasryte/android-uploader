// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: /Users/klee/Projects/Nightscout/android-uploader/core/src/main/java/com/nightscout/core/protobuf/G4Download.proto
package com.nightscout.core.model;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

import static com.squareup.wire.Message.Datatype.DOUBLE;
import static com.squareup.wire.Message.Datatype.UINT64;
import static com.squareup.wire.Message.Label.REQUIRED;

public final class CookieMonsterG4Cal extends Message {

    public static final Double DEFAULT_SLOPE = 0D;
    public static final Double DEFAULT_INTERCEPT = 0D;
    public static final Double DEFAULT_SCALE = 0D;
    public static final Double DEFAULT_DECAY = 0D;
    public static final Long DEFAULT_SYS_TIMESTAMP_SEC = 0L;
    public static final Long DEFAULT_DISP_TIMESTAMP_SEC = 0L;

    @ProtoField(tag = 1, type = DOUBLE, label = REQUIRED)
    public final Double slope;

    @ProtoField(tag = 2, type = DOUBLE)
    public final Double intercept;

    @ProtoField(tag = 3, type = DOUBLE)
    public final Double scale;

    @ProtoField(tag = 4, type = DOUBLE)
    public final Double decay;

    @ProtoField(tag = 5, type = UINT64)
    public final Long sys_timestamp_sec;

    /**
     * system timestamp of the record
     */
    @ProtoField(tag = 6, type = UINT64)
    public final Long disp_timestamp_sec;

    public CookieMonsterG4Cal(Double slope, Double intercept, Double scale, Double decay, Long sys_timestamp_sec, Long disp_timestamp_sec) {
        this.slope = slope;
        this.intercept = intercept;
        this.scale = scale;
        this.decay = decay;
        this.sys_timestamp_sec = sys_timestamp_sec;
        this.disp_timestamp_sec = disp_timestamp_sec;
    }

    private CookieMonsterG4Cal(Builder builder) {
        this(builder.slope, builder.intercept, builder.scale, builder.decay, builder.sys_timestamp_sec, builder.disp_timestamp_sec);
        setBuilder(builder);
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) return true;
        if (!(other instanceof CookieMonsterG4Cal)) return false;
        CookieMonsterG4Cal o = (CookieMonsterG4Cal) other;
        return equals(slope, o.slope)
                && equals(intercept, o.intercept)
                && equals(scale, o.scale)
                && equals(decay, o.decay)
                && equals(sys_timestamp_sec, o.sys_timestamp_sec)
                && equals(disp_timestamp_sec, o.disp_timestamp_sec);
    }

    @Override
    public int hashCode() {
        int result = hashCode;
        if (result == 0) {
            result = slope != null ? slope.hashCode() : 0;
            result = result * 37 + (intercept != null ? intercept.hashCode() : 0);
            result = result * 37 + (scale != null ? scale.hashCode() : 0);
            result = result * 37 + (decay != null ? decay.hashCode() : 0);
            result = result * 37 + (sys_timestamp_sec != null ? sys_timestamp_sec.hashCode() : 0);
            result = result * 37 + (disp_timestamp_sec != null ? disp_timestamp_sec.hashCode() : 0);
            hashCode = result;
        }
        return result;
    }

    public static final class Builder extends Message.Builder<CookieMonsterG4Cal> {

        public Double slope;
        public Double intercept;
        public Double scale;
        public Double decay;
        public Long sys_timestamp_sec;
        public Long disp_timestamp_sec;

        public Builder() {
        }

        public Builder(CookieMonsterG4Cal message) {
            super(message);
            if (message == null) return;
            this.slope = message.slope;
            this.intercept = message.intercept;
            this.scale = message.scale;
            this.decay = message.decay;
            this.sys_timestamp_sec = message.sys_timestamp_sec;
            this.disp_timestamp_sec = message.disp_timestamp_sec;
        }

        public Builder slope(Double slope) {
            this.slope = slope;
            return this;
        }

        public Builder intercept(Double intercept) {
            this.intercept = intercept;
            return this;
        }

        public Builder scale(Double scale) {
            this.scale = scale;
            return this;
        }

        public Builder decay(Double decay) {
            this.decay = decay;
            return this;
        }

        public Builder sys_timestamp_sec(Long sys_timestamp_sec) {
            this.sys_timestamp_sec = sys_timestamp_sec;
            return this;
        }

        /**
         * system timestamp of the record
         */
        public Builder disp_timestamp_sec(Long disp_timestamp_sec) {
            this.disp_timestamp_sec = disp_timestamp_sec;
            return this;
        }

        @Override
        public CookieMonsterG4Cal build() {
            checkRequiredFields();
            return new CookieMonsterG4Cal(this);
        }
    }
}
