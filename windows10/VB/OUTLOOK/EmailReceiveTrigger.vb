# https://www.youtube.com/watch?v=5qcftHAWnZI
# 

Sub EmailReceiveTrigger()
Dim olApp As Outlook.Application
Dim olNS As Outlook.NameSpace
Set olApp = Outlook.Application
Set olNS = olApp.GetNamespace("MAPI")
Set olItems = olNS.GetDefaultFolder(olFolderInbox).Items
Debug.Print "Application_Startup trigerred " & Now()

End Sub

Private Sub olItems_ItemAdd(ByVal item As Object)
Dim my_olMail As Outlook.MailItem
Dim olAtt As Outlook.Attachment
If TypeName(item) = "MailItem" Then
    Set my_olMail = item
    Debug.Print my_olMail.Subject
    Debug.Print my_olMail.Attachments.Count
    Debug.Print my_olMail.SenderEmailAddres
    For Each olAtt In my_olMail.Attachments
    Set my_olMail = Nothing
End Sub
