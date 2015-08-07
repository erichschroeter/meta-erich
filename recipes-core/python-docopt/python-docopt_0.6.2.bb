SUMMARY = "Python command-line parsing library"
SECTION = "devel/python"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE-MIT;md5=09b77fb74986791a3d4a0e746a37d88f"
SRCNAME = "docopt"
PR = "r0"
#RDEPENDS_${PN} += "python-codecs python-textutils"

SRC_URI = "https://github.com/docopt/docopt/archive/${PV}.tar.gz"
SRC_URI[md5sum] = "a6c44155426fd0f7def8b2551d02fef6"
SRC_URI[sha256sum] = "2113eed1e7fbbcd43fb7ee6a977fb02d0b482753586c9dc1a8e3b7d541426e99"

S = "${WORKDIR}/${SRCNAME}-${PV}"

inherit setuptools

BBCLASSEXTEND = "native"
