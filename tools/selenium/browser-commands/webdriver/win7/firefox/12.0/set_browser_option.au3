$dir = $CmdLine[1]

WinWait("Welcome", "", 10)
WinActivate("Welcome")
Sleep(2500)
Send("!t")
Sleep(1000)
Send("o")

WinWait("Options", "", 10)
WinActivate("Options")
Sleep(1000)
Send("!v")
Sleep(1000)
Send("!o")
Sleep(1000)

WinWait("Choose Download Folder", "", 10)
WinActivate("Choose Download Folder")
Sleep(1000)
Send("!d")
Sleep(1000)
Send($dir)
Sleep(1000)
Send("{ENTER}")
Sleep(1000)
Send("{TAB}")
Send("{TAB}")
Send("{TAB}")
Send("{TAB}")
Send("{TAB}")
Send("{TAB}")
Sleep(1000)
Send("{ENTER}")
Sleep(1000)
Send("{TAB}")
Send("{TAB}")
Sleep(1000)
Send("{ENTER}")
Sleep(1000)