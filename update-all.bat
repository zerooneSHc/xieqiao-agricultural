@echo off
chcp 65001 >nul
title 斜桥农产品供销系统 - 完整更新脚本
color 0E

echo ╔══════════════════════════════════════════════════════════╗
echo ║     斜桥农产品供销系统 - GitHub Pages 自动更新工具        ║
echo ╚══════════════════════════════════════════════════════════╝
echo.

cd /d D:\xiaogu\xieqiao-agricultural

:: 显示当前目录
echo [√] 工作目录: %cd%
echo.

:: 1. 同步 HTML 文件
echo [1/5] 同步 HTML 文件...
if exist "src\main\resources\static" (
    copy /Y "src\main\resources\static\*.html" .\ 2>nul
    echo       √ HTML 文件同步完成
) else (
    echo       ! 警告: static 目录不存在
)
echo.

:: 2. 同步 images 文件夹
echo [2/5] 同步图片文件...
if exist "src\main\resources\static\images" (
    if not exist "images" mkdir images
    xcopy /Y /E /Q "src\main\resources\static\images\*" "images\" >nul
    echo       √ 图片文件同步完成
) else (
    echo       ! 警告: images 目录不存在
)
echo.

:: 3. 同步 CSS/JS 文件（如果有）
echo [3/5] 同步其他静态资源...
if exist "src\main\resources\static\css" (
    if not exist "css" mkdir css
    xcopy /Y /E /Q "src\main\resources\static\css\*" "css\" >nul
    echo       √ CSS 文件同步完成
)
if exist "src\main\resources\static\js" (
    if not exist "js" mkdir js
    xcopy /Y /E /Q "src\main\resources\static\js\*" "js\" >nul
    echo       √ JS 文件同步完成
)
echo.

:: 4. Git 添加和提交
echo [4/5] 提交到 Git...
git add .
git commit -m "Auto update: %date% %time% - Sync all static files"
echo       √ 提交完成
echo.

:: 5. 推送到 GitHub
echo [5/5] 推送到 GitHub...
git push origin master
echo       √ 推送完成
echo.

echo ╔══════════════════════════════════════════════════════════╗
echo ║                      更新成功！                          ║
echo ║                                                          ║
echo ║  网站地址: https://zerooneSHc.github.io/xieqiao-agricultural/ ║
echo ║  生效时间: 1-2 分钟                                      ║
echo ╚══════════════════════════════════════════════════════════╝
echo.
pause