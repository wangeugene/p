Set-PSReadLineOption -EditMode Emacs
$Profile
@@ echo generate autostart script
vim $($Profile)
@@ append this line run as administrator
Set-ExecutionPolicy Unrestricted
