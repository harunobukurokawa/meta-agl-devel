SUMMARY = "AGL Container Manager"
DESCRIPTION = " AGL Container Manager for AGL Cluster "
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=89aea4e17d99a7cacdbeed46a0096b10"

PV = "0.1.0+rev${SRCPV}"

DEPENDS = "systemd libmnl cjson lxc util-linux"

SRCREV = "45e102f2ffe0015bd7b79935e99f75ffca996061"
SRC_URI = " \
    git://github.com/AGLExport/container-manager.git;branch=staging2;protocol=https \
    file://container-manager.service \
    file://container-manager.json \
    "

S = "${WORKDIR}/git"

inherit autotools pkgconfig systemd

EXTRA_OECONF:append = " --enable-printfdebug"

SYSTEMD_PACKAGES = "${PN}"
SYSTEMD_SERVICE:${PN} = "container-manager.service"
SYSTEMD_AUTO_ENABLE:${PN} = "enable"

do_install:append() {
    install -d ${D}/opt/container/conf/
    install -d ${D}/opt/container/guests/

    install -d ${D}${systemd_system_unitdir}
    install -m 0644 ${WORKDIR}/container-manager.service ${D}${systemd_system_unitdir}/

    install -d ${D}${sysconfdir}
    install -m 0644 ${WORKDIR}/container-manager.json ${D}${sysconfdir}/
}

FILES:${PN} += " \
    ${systemd_system_unitdir}/* \
    ${sysconfdir}/* \
    /opt/container/conf \
    /opt/container/guests \
    "

