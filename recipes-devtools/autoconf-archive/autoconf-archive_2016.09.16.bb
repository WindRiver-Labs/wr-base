DEFAULT_PREFERENCE = "-1"

require autoconf-archive.inc


PARALLEL_MAKE = ""

LICENSE = "GPLv2 & GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

SRC_URI[md5sum] = "2cd6ebd4e00c680be10c1d70816b0d2a"
SRC_URI[sha256sum] = "860ee92e1e04f8ea75faa74cc8c47027a9dc168a2f5eb1b96aa4d30ab68883e7"

EXTRA_OECONF += "ac_cv_path_M4=m4"
BBCLASSEXTEND = "native nativesdk"
