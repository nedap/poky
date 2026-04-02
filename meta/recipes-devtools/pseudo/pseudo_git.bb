require pseudo.inc

SRC_URI = "git://git.yoctoproject.org/pseudo \
           file://fallback-passwd \
           file://fallback-group \
           "

SRCREV = "43cbd8fb4914328094ccdb4bb827d74b1bac2046"
S = "${WORKDIR}/git"
PV = "1.9.3+git${SRCPV}"
