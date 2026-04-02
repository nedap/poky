require pseudo.inc

SRC_URI = "git://git.yoctoproject.org/pseudo \
           file://fallback-passwd \
           file://fallback-group \
           "

SRCREV = "750362cc7b9fa58dffccd95d919b435c6d8ac614"
S = "${WORKDIR}/git"
PV = "1.9.3+git${SRCPV}"
