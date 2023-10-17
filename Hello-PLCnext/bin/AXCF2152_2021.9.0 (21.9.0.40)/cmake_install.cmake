# Install script for directory: /home/scytheman/Desktop/Proj/Hello-PLCnext

# Set the install prefix
if(NOT DEFINED CMAKE_INSTALL_PREFIX)
  set(CMAKE_INSTALL_PREFIX "/home/scytheman/Desktop/Proj/Hello-PLCnext/deploy")
endif()
string(REGEX REPLACE "/$" "" CMAKE_INSTALL_PREFIX "${CMAKE_INSTALL_PREFIX}")

# Set the install configuration name.
if(NOT DEFINED CMAKE_INSTALL_CONFIG_NAME)
  if(BUILD_TYPE)
    string(REGEX REPLACE "^[^A-Za-z0-9_]+" ""
           CMAKE_INSTALL_CONFIG_NAME "${BUILD_TYPE}")
  else()
    set(CMAKE_INSTALL_CONFIG_NAME "Release")
  endif()
  message(STATUS "Install configuration: \"${CMAKE_INSTALL_CONFIG_NAME}\"")
endif()

# Set the component getting installed.
if(NOT CMAKE_INSTALL_COMPONENT)
  if(COMPONENT)
    message(STATUS "Install component: \"${COMPONENT}\"")
    set(CMAKE_INSTALL_COMPONENT "${COMPONENT}")
  else()
    set(CMAKE_INSTALL_COMPONENT)
  endif()
endif()

# Install shared libraries without execute permission?
if(NOT DEFINED CMAKE_INSTALL_SO_NO_EXE)
  set(CMAKE_INSTALL_SO_NO_EXE "1")
endif()

# Is this installation the result of a crosscompile?
if(NOT DEFINED CMAKE_CROSSCOMPILING)
  set(CMAKE_CROSSCOMPILING "TRUE")
endif()

# Set default install directory permissions.
if(NOT DEFINED CMAKE_OBJDUMP)
  set(CMAKE_OBJDUMP "/opt/pxc/sdk/AXCF2152/2021.9/sysroots/x86_64-pokysdk-linux/usr/bin/arm-pxc-linux-gnueabi/arm-pxc-linux-gnueabi-objdump")
endif()

if("x${CMAKE_INSTALL_COMPONENT}x" STREQUAL "xUnspecifiedx" OR NOT CMAKE_INSTALL_COMPONENT)
  file(INSTALL DESTINATION "${CMAKE_INSTALL_PREFIX}/AXCF2152_21.9.0.40/Release/bin" TYPE EXECUTABLE FILES "/home/scytheman/Desktop/Proj/Hello-PLCnext/bin/AXCF2152_2021.9.0 (21.9.0.40)/hello_PLCnext")
  if(EXISTS "$ENV{DESTDIR}${CMAKE_INSTALL_PREFIX}/AXCF2152_21.9.0.40/Release/bin/hello_PLCnext" AND
     NOT IS_SYMLINK "$ENV{DESTDIR}${CMAKE_INSTALL_PREFIX}/AXCF2152_21.9.0.40/Release/bin/hello_PLCnext")
    if(CMAKE_INSTALL_DO_STRIP)
      execute_process(COMMAND "/opt/pxc/sdk/AXCF2152/2021.9/sysroots/x86_64-pokysdk-linux/usr/bin/arm-pxc-linux-gnueabi/arm-pxc-linux-gnueabi-strip" "$ENV{DESTDIR}${CMAKE_INSTALL_PREFIX}/AXCF2152_21.9.0.40/Release/bin/hello_PLCnext")
    endif()
  endif()
endif()

if(CMAKE_INSTALL_COMPONENT)
  set(CMAKE_INSTALL_MANIFEST "install_manifest_${CMAKE_INSTALL_COMPONENT}.txt")
else()
  set(CMAKE_INSTALL_MANIFEST "install_manifest.txt")
endif()

string(REPLACE ";" "\n" CMAKE_INSTALL_MANIFEST_CONTENT
       "${CMAKE_INSTALL_MANIFEST_FILES}")
file(WRITE "/home/scytheman/Desktop/Proj/Hello-PLCnext/bin/AXCF2152_2021.9.0 (21.9.0.40)/${CMAKE_INSTALL_MANIFEST}"
     "${CMAKE_INSTALL_MANIFEST_CONTENT}")
