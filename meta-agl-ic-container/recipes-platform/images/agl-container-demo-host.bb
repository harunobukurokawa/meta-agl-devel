SUMMARY = "LXC host demo image"
LICENSE = "MIT"

require recipes-platform/images/agl-image-boot.inc

IMAGE_LINGUAS = " "

NO_RECOMMENDATIONS = "1"

IMAGE_INSTALL += " \
    kernel-image \
    kernel-modules \
    container-manager \
    drm-lease-manager \
    alsa-utils \
    packagegroup-pipewire \
    pipewire-ic-ipc \
    wireplumber-config-agl \
"

# packages required for network bridge settings via lxc-net
IMAGE_INSTALL += " \
    lxc-networking \
    iptables-modules \
    dnsmasq \
    systemd-netif-config \
    kernel-module-xt-addrtype \
    kernel-module-xt-multiport \
"

# network manager to use
VIRTUAL-RUNTIME_net_manager = "systemd"

IMAGE_INSTALL:append:rcar-gen3 = " kernel-module-gles "

# demo guests
IMAGE_INSTALL:append = " \
    cm-config-cluster-demo \
    cm-config-agl-qt-ivi-demo \
    cm-config-agl-flutter-ivi-demo \
    cm-config-agl-html5-ivi-demo \
    "
