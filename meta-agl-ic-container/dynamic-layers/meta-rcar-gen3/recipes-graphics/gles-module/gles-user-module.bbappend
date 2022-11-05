FILESEXTRAPATHS:prepend := "${THISDIR}/${BPN}:"

SRC_URI:append = " \
    file://72-pvr-seat.rules \
    "

do_install:append() {
	install -m 644 ${WORKDIR}/72-pvr-seat.rules ${D}${sysconfdir}/udev/rules.d/
}

RDEPENDS:${PN}:remove:aglcontainerguest = "kernel-module-gles"

PACKAGES:prepend = "\
    ${PN}-firmware \
"

FILES:${PN} = " \
    ${libdir}/* \
    ${sysconfdir}/* \
    ${RENESAS_DATADIR}/bin/dlcsrv_REL \
"
SYSTEMD_SERVICE:${PN} = ""

FILES:${PN}-firmware = " \
    ${systemd_system_unitdir}/* \
    ${sysconfdir}/udev/* \
    ${nonarch_base_libdir}/firmware/* \
    ${exec_prefix}/bin/pvrinit \
"
SYSTEMD_SERVICE:${PN}-firmware = "rc.pvr.service"
SYSTEMD_PACKAGES = "${PN}-firmware"
SYSTEMD_AUTO_ENABLE = "enable"
