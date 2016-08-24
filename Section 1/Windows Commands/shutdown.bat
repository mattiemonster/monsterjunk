@echo 

:shutdown
echo Shutting down!
echo Type stop to abort the shutdown or c to continue!
set /p ip=
if %ip% == stop goto abort
if %ip% == c goto shutdown2

:abort
echo Aborting shutdown...
exit

:shutdown2
shutdown -c "Shutting downn computer..." -s -t 60

goto shutdown


