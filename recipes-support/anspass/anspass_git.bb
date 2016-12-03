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

SRCREV = "2060077626efafeda41b2f1c678dd5bb89708d0c"

inherit autotools-brokensep

S = "${WORKDIR}/git"

BBCLASSEXTEND = "native nativesdk"
