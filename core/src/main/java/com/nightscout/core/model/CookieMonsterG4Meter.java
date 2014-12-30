// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: /Users/klee/Projects/Nightscout/android-uploader/core/src/main/java/com/nightscout/core/protobuf/G4Download.proto
package com.nightscout.core.model;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

import static com.squareup.wire.Message.Datatype.UINT32;
import static com.squareup.wire.Message.Datatype.UINT64;
import static com.squareup.wire.Message.Label.REQUIRED;

public final class CookieMonsterG4Meter extends Message {

    public static final Integer DEFAULT_METER_BG_MGDL = 0;
    public static final Integer DEFAULT_METER_TIME = 0;
    public static final Long DEFAULT_SYS_TIMESTAMP_SEC = 0L;
    public static final Long DEFAULT_DISP_TIMESTAMP_SEC = 0L;

    @ProtoField(tag = 1, type = UINT32, label = REQUIRED)
    public final Integer meter_bg_mgdl;

    @ProtoField(tag = 2, type = UINT32)
    public final Integer meter_time;

    @ProtoField(tag = 3, type = UINT64)
    public final Long sys_timestamp_sec;

    /**
     * system timestamp of the record
     */
    @ProtoField(tag = 4, type = UINT64)
    public final Long disp_timestamp_sec;

    public CookieMonsterG4Meter(Integer meter_bg_mgdl, Integer meter_time, Long sys_timestamp_sec, Long disp_timestamp_sec) {
        this.meter_bg_mgdl = meter_bg_mgdl;
        this.meter_time = meter_time;
        this.sys_timestamp_sec = sys_timestamp_sec;
        this.disp_timestamp_sec = disp_timestamp_sec;
    }

    private CookieMonsterG4Meter(Builder builder) {
        this(builder.meter_bg_mgdl, builder.meter_time, builder.sys_timestamp_sec, builder.disp_timestamp_sec);
        setBuilder(builder);
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) return true;
        if (!(other instanceof CookieMonsterG4Meter)) return false;
        CookieMonsterG4Meter o = (CookieMonsterG4Meter) other;
        return equals(meter_bg_mgdl, o.meter_bg_mgdl)
                && equals(meter_time, o.meter_time)
                && equals(sys_timestamp_sec, o.sys_timestamp_sec)
                && equals(disp_timestamp_sec, o.disp_timestamp_sec);
    }

    @Override
    public int hashCode() {
        int result = hashCode;
        if (result == 0) {
            result = meter_bg_mgdl != null ? meter_bg_mgdl.hashCode() : 0;
            result = result * 37 + (meter_time != null ? meter_time.hashCode() : 0);
            result = result * 37 + (sys_timestamp_sec != null ? sys_timestamp_sec.hashCode() : 0);
            result = result * 37 + (disp_timestamp_sec != null ? disp_timestamp_sec.hashCode() : 0);
            hashCode = result;
        }
        return result;
    }

    public static final class Builder extends Message.Builder<CookieMonsterG4Meter> {

        public Integer meter_bg_mgdl;
        public Integer meter_time;
        public Long sys_timestamp_sec;
        public Long disp_timestamp_sec;

        public Builder() {
        }

        public Builder(CookieMonsterG4Meter message) {
            super(message);
            if (message == null) return;
            this.meter_bg_mgdl = message.meter_bg_mgdl;
            this.meter_time = message.meter_time;
            this.sys_timestamp_sec = message.sys_timestamp_sec;
            this.disp_timestamp_sec = message.disp_timestamp_sec;
        }

        public Builder meter_bg_mgdl(Integer meter_bg_mgdl) {
            this.meter_bg_mgdl = meter_bg_mgdl;
            return this;
        }

        public Builder meter_time(Integer meter_time) {
            this.meter_time = meter_time;
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
        public CookieMonsterG4Meter build() {
            checkRequiredFields();
            return new CookieMonsterG4Meter(this);
        }
    }
}
