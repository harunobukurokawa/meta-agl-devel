# AGL HMI Framework adaptation of navigation
# This recipe is integrated into navigation_git.bb when the meta-hmi-framework is integrated into meta-agl-demo.
FILESEXTRAPATHS_prepend := "${THISDIR}/navigation:"

SRCREV = "e154ee48f8e317b8e05527fa639144b52b3d5506"
SRC_URI="git://github.com/AGLExport/gpsnavi.git;branch=newwm2 \
         file://download_mapdata_jp.sh \
         file://download_mapdata_uk.sh \
         file://org.agl.naviapi.conf \
"
DEPENDS_append = " af-binder libwindowmanager virtual/libhomescreen "

