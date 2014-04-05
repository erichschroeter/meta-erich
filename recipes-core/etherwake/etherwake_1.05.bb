SUMMARY = "Generate Wake-On-LAN packets"
DESCRIPTION = "This program generates and transmits a Wake-On-LAN (WOL) \"Magic Packet\", \
used for restarting machines that have been soft-powered-down \
(ACPI D3-warm state).  It currently generates the standard AMD Magic Packet \
format, with an optional password appended."
SECTION = "console/network"
LICENSE = "GPL"
LIC_FILES_CHKSUM = "file://ether-wake.c;beginline=39;endline=41;md5=a5bc9bc81d49fd820bf913dcbf270731"
PR = "r0"

SRCREV = "891553e711d849a3d267cc0f2dd8b46e6f5c4a18"
SRC_URI = "git://gist.github.com/9884006.git;protocol=http"

S = "${WORKDIR}/git"

BBCLASSEXTEND = "native"

do_install() {
	oe_runmake DESTDIR=${D} install
}

