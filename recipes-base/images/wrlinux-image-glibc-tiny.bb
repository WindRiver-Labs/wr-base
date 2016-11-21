#
# Copyright (C) 2012 Wind River Systems, Inc.
#
DESCRIPTION = "A foundational tiny image that boots to a console."

LICENSE = "MIT"

# We override what gets set in core-image.bbclass
#
IMAGE_INSTALL = "\
    packagegroup-wr-tiny \
    "

inherit wrlinux-image
