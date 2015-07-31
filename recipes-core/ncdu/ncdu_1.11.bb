DESCRIPTION = "NCurses Disk Usage"
DEPENDS = "ncurses"
PR = "r1"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING;md5=45cf269f348fec7812275be0a0509645"

SRC_URI = "http://dev.yorhel.nl/download/ncdu-${PV}.tar.gz"

inherit autotools

SRC_URI[md5sum] = "9e44240a5356b029f05f0e70a63c4d12"
SRC_URI[sha256sum] = "d0aea772e47463c281007f279a9041252155a2b2349b18adb9055075e141bb7b"
