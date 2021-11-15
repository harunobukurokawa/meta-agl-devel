SUMMARY = "Igalia Flutter Homescreen"
DESCRIPTION = "Flutter Gallery Application"
AUTHOR = "Igalia"
HOMEPAGE = "https://github.com/felipeerias/flutter_homescreen"
BUGTRACKER = "https://github.com/felipeerias/flutter_homescreen/issues"
SECTION = "graphics"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

SRC_URI = "git://github.com/felipeerias/flutter_homescreen.git;protocol=https;branch=main"

SRCREV = "283f915354dcc81410b30534c1eda063d0e78888"

S = "${WORKDIR}/git"

PUBSPEC_APPNAME = "flutter_homescreen"

inherit flutter-app
