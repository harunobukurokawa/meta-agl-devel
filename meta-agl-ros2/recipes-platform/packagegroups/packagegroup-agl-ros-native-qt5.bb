SUMMARY = "Qt5 for native GUI framework of AGL IVI profile"
DESCRIPTION = "A set of Qt5 packages which required by Native App Fw Subsystem"

LICENSE = "MIT"

inherit packagegroup

PACKAGES = "\
    packagegroup-agl-ros-native-qt5 \
    "

RDEPENDS:${PN} += "\
    qtbase \
    qtbase-dev \
    qtbase-plugins \
    qtbase-staticdev \
    qtbase-tools \
    qtdeclarative \
    qtdeclarative-qmlplugins \
    qtdeclarative-tools \
    qtcharts \
    qtwayland \
    qtwayland-plugins \
    qtwayland-tools \
    qtgraphicaleffects-qmlplugins \
    qtvirtualkeyboard \
    "