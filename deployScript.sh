#!/bin/zsh

REMOTE_SERVER="alyang-ld3.linkedin.biz"
REMOTE_JETTY_BASE_WEBAPPS="~/opt/jetty/base/webapps"
RELATIVE_LOCAL_WAR_PATH="./server/build/libs/server.war"

echo "------Starting Deploy Script--------"

echo "------Building War-------"
gradle build

echo "------Copying War to remote server-------"
scp $RELATIVE_LOCAL_WAR_PATH ${REMOTE_SERVER}:${REMOTE_JETTY_BASE_WEBAPPS}


## Setup
#
# Start jetty on tower
# Run the script here.
#
# Can think about stopping remote jetty first, then starting it after war copied.  
#
