#
# Copyright (C) 2016 Wind River Systems, Inc.
#
SUMMARY = "Credential storage for utilities that implement the askpass interface"

DESCRIPTION = "anspass is a daemon/client utility to save and retrieve \
    credentials by other utilities that implement the askpass interface."

LICENSE = "LGPLv2"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=4fbd65380cdd255951079008b364516c"

DEPENDS = "libgcrypt"

SRC_URI = "git://github.com/WindRiver-OpenSourceLabs/anspass \
           file://Makefile-Update-for-cross-compiling.patch \
"

SRCREV = "99babf0f42b80147ef35564e698bde5635e5d531"

inherit autotools-brokensep

S = "${WORKDIR}/git"

BBCLASSEXTEND = "native nativesdk"
