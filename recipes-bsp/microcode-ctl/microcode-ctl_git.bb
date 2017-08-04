#
# Copyright (C) 2014 Wind River Systems, Inc.
#
require ${BPN}.inc

SRC_URI += "git://pagure.io/microcode_ctl.git;protocol=https \
	    file://0001-add-the-WRLinux-release-support.patch \
            file://microcode_ctl.service \
            file://0001-fix-the-help-return-code.patch \
            file://fix-No-GNU_HASH-in-the-elf-binary.patch \
	   "

SRCREV = "54d1e40d009a3917bc4351fd359ea756186b9aa2"

PV = "v2.1-9+git${SRCREV}"

S = "${WORKDIR}/git"
