LOCAL_PATH := $(call my-dir)
include $(CLEAR_VARS)
LOCAL_MODULE    := fibb
LOCAL_SRC_FILES := fibb.c
include $(BUILD_SHARED_LIBRARY)

