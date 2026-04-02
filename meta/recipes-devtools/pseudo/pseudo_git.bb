require pseudo.inc

SRC_URI = "git://git.yoctoproject.org/pseudo \
           file://fallback-passwd \
           file://fallback-group \
           "

SRCREV = "cc1f6167cb5065daba1462056e2dce8ff72aa855"
S = "${WORKDIR}/git"
PV = "1.9.3+git${SRCPV}"
