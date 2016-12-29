#
# Copyright (C) 2014 Wind River Systems, Inc.
#
require ${BPN}.inc

SRC_URI += "git://git.fedorahosted.org/git/microcode_ctl;protocol=git \
	    file://0001-add-the-WRLinux-release-support.patch \
            file://microcode_ctl.service \
            file://0001-fix-the-help-return-code.patch \
            file://fix-No-GNU_HASH-in-the-elf-binary.patch \
	   "

SRCREV = "7164e0e34c547c01b4178af38d5f42e530325211"

PV = "v2.1-9+git${SRCREV}"

S = "${WORKDIR}/git"
