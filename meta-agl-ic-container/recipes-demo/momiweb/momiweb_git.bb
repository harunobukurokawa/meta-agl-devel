SUMMARY     = "Momiyama Web UI for CES2023"
DESCRIPTION = "Momiyama Web UI for CES2023."
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1ebbd3e34237af26da5dc08a4e440464"

PV = "0.0.0"

SRC_URI = "git://github.com/agl-ic-eg/momiweb.git;protocol=https;branch=main \
          "
SRCREV = "305bd2bad508eaa8e65b11fb5421a880c9846c9b"

S = "${WORKDIR}/git"

inherit allarch

do_install:append() {
	install -d ${D}/www/pages
	cp -R ${S}/webui/* ${D}/www/pages/

	install -d ${D}/www/cgi-bin
	cp -R ${S}/cgi/* ${D}/www/cgi-bin/
}

FILES:${PN} += " \
    /www/pages/* \
    /www/pages/*/* \
    /www/cgi-bin/* \
    "
RDEPENDS:${PN} = " \
    lighttpd \
    lighttpd-module-cgi \
    lighttpd-module-alias \
    lighttpd-module-access \
    "
