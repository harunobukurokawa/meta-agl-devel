FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

do_install:append() {
	rm -R ${D}/www/pages/*
}
