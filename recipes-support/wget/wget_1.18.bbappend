FILESEXTRAPATHS_append := "${THISDIR}/files:"

wgetpatch=""
wgetpatch_class-native = "file://0001-wget-Add-ssh-askpass-support.patch"
wgetpatch_class-nativesdk = "file://0001-wget-Add-ssh-askpass-support.patch"
SRC_URI_append += "${wgetpatch}"
