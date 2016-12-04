#
# Copyright (C) 2016 Wind River Systems, Inc.
#
SUMMARY = "Credential storage for utilities that implement the askpass interface"

DESCRIPTION = "anspass is a daemon/client utility to save and retrieve \
    credentials by other utilities that implement the askpass interface."

LICENSE = "LGPLv2"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=4fbd65380cdd255951079008b364516c"

DEPENDS = "libgcrypt"

SRC_URI = "git://github.com/WindRiver-OpenSourceLabs/anspass"

SRCREV = "41b8698321d6e859c0beda8efd7891c4c52bbcc6"

PV = "1.0+git${SRCPV}"

LDFLAGS_append = " -lgcrypt"

inherit autotools-brokensep

S = "${WORKDIR}/git"

BBCLASSEXTEND = "native nativesdk"
