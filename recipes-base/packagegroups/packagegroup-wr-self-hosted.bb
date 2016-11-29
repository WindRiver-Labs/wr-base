#
# Copyright (C) 2016 Wind River Inc.
#

# We need to pull in the oe-core recipe text this way because it
# will not parse if x11 is not a distro feature and we just RDEPEND on it.
#
require recipes-core/packagegroups/packagegroup-self-hosted.bb

SUMMARY = "Self-hosting for WR images"

PACKAGES += "\
    packagegroup-wr-self-hosted \
    "

RDEPENDS_packagegroup-wr-self-hosted = "\
    packagegroup-self-hosted \
    "


# The graphics packages in packagegroup-self-hosted-graphics
# are for Build Appliance usage in oe-core which are not
# needed in our self-hosted feature, so drop the graphics packagegroup.

# We cannot just redefine this here; we have to do a remove.
#
REQUIRED_DISTRO_FEATURES_remove = "x11"

PACKAGES_remove = "packagegroup-self-hosted-graphics"
RDEPENDS_packagegroup-self-hosted_remove = "packagegroup-self-hosted-graphics"

# This is in the wrong group in the recipe and needs x11.
#
RDEPENDS_packagegroup-self-hosted-extended_remove = "settings-daemon"

