#!/bin/bash
mysqld_safe &
sleep 5
mysql -u root -e "source /init.sql;"
tail -f /var/log/mysql/error.log