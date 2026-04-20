@echo off
cd D:\xiaogu\xieqiao-agricultural

echo Copying images from static to root...
if exist "src\main\resources\static\images" (
    xcopy "src\main\resources\static\images" "images\" /E /I /Y
    echo Images copied successfully!
) else (
    echo Creating images directory...
    mkdir images
    echo Please add your image files to images folder
)

echo.
echo Adding images to git...
git add images/

echo.
echo Committing images...
git commit -m "Add images folder for website"

echo.
echo Pushing to GitHub...
git push origin master

echo.
echo Done!
pause