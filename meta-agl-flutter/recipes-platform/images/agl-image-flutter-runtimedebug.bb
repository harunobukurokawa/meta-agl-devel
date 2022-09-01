SUMMARY = "Baseline Flutter Image for Development"

LICENSE = "MIT"

require agl-image-flutter.inc

IMAGE_INSTALL:append = "\
    weston-ini-conf-landscape \
    \
    flutter-auto-runtimedebug \
    \
    flutter-engine-runtimedebug-sdk-dev \
    \
    flutter-gallery-runtimedebug \
    flutter-gallery-runtimedebug-init \
    flutter-test-texture-egl-runtimedebug \
    flutter-test-secure-storage-runtimedebug \
    flutter-test-localization-runtimedebug \
    "