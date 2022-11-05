DESCRIPTION = "AGL simple IVI demo container LXC config"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/BSD-3-Clause;md5=550794465ba0ec5312d6919e203a55f9"

inherit lxc-config

LXC_AUTO_START ??= "0"

do_install() {
	install -m 0755 -d ${D}/var/lib/machines/agl-qt-ivi
}

FILES:${PN} += " \
    /var/lib/machines/agl-qt-ivi\
    "
