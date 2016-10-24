IMAGE_INSTALL += "kernel-image"
IMAGE_INSTALL += "grub"
IMAGE_INSTALL += "grubby"
IMAGE_INSTALL += "shadow"
IMAGE_INSTALL += "efibootmgr"

# Need run depmod on the target
IMAGE_INSTALL += "kmod"

# Busybox's mount doesn't support some options,
# that caused fs mount failed on glibc-small image,
# use util-linux-mount to instead.
IMAGE_INSTALL += "util-linux-mount"

IMAGE_INSTALL += "init-ifupdown"

IMAGE_INSTALL += "libuser"

IMAGE_INSTALL += "dracut"

IMAGE_INSTALL += "cryptsetup"

# Conditionally to build grub-efi for target image.
# And anaconda installer decides to install it or not.
EXTRA_IMAGEDEPENDS += "${@bb.utils.contains('INCOMPATIBLE_LICENSE', 'GPLv3', '', 'grub-efi', d)}"

EXTRA_IMAGEDEPENDS += "glibc-locale"

EXTRA_IMAGEDEPENDS += "btrfs-tools"