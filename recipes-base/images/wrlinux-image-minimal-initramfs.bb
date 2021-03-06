require ${COREBASE}/meta/recipes-core/images/core-image-minimal-initramfs.bb

export IMAGE_BASENAME = "wrlinux-image-minimal-initramfs"

QB_DEFAULT_FSTYPE = "cpio.gz"

inherit wrlinux-image

# Use PACKAGE_INSTALL as core-image-minimal-initramfs does to only
# install specific packages.
# Install busybox clearly in case no-busybox is enabled.
PACKAGE_INSTALL += "busybox"

# Install mdadm and necessary kernel module to initramfs
# to support boot from raid
PACKAGE_INSTALL_append_intel-x86-64 = " \
		${@bb.utils.contains('DISTRO', 'wrlinux-installer', '', 'mdadm', d)} \
		${@bb.utils.contains('DISTRO', 'wrlinux-installer', '', 'kernel-module-nvme', d)} \
		${@bb.utils.contains('DISTRO', 'wrlinux-installer', '', 'kernel-module-nvme-core', d)} \
		${@bb.utils.contains('DISTRO', 'wrlinux-installer', '', 'kernel-module-efivars', d)} \
"
