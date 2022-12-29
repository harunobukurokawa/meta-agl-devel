PACKAGECONFIG:remove = "templates"

FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

SRC_URI += " \
   file://0001-Remove-container-automatic-rebooting.patch \
    file://lxc-net.service \
    "

do_install:append () {
    for service in lxc-net.service; do
        install -D -m 0644 ${WORKDIR}/$service ${D}${systemd_system_unitdir}/$service
        sed -i -e 's,@LIBEXECDIR@,${libexecdir},g' ${D}${systemd_system_unitdir}/$service
    done
}

# NOTE:
# This needs to be replaced with a rework of the upstream packaging
# to do a proper split of core from the template support.
RDEPENDS:${PN} = ""
