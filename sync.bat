@echo off
echo Syncing static files to root...
copy "src\main\resources\static\*.html" .\
echo Done!
pause
