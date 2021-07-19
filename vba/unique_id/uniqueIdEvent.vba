Private Sub Worksheet_Change(ByVal Target As Range)

    Dim KeyCells As Range
    Set KeyCells = Range("B:B")
    
    If Not Application.Intersect(KeyCells, Range(Target.Address)) _
    Is Nothing Then
    
    ActiveColumn = ActiveCell.Column
    ActiveRow = ActiveCell.Row

        If Trim(Cells(ActiveRow - 1, ActiveColumn)) = "" Then
            MsgBox "empty"
        Else
        
            If Not IsEmpty(Cells(ActiveRow - 1, ActiveColumn - 1)) Then
   
            End If
            
            CYear = CLng(Year(Now))
            CMonth = CLng(Month(Now))
            CDay = CLng(Day(Now))
            CHour = CLng(Hour(Now))
            CMinute = CLng(Minute(Now))
            CSecond = CLng(Second(Now))
            UniqueId = 100 * (CYear + CMonth + CDay + CHour + CMinute + CSecond) + (ActiveRow - 1)
            
            If IsEmpty(Cells(ActiveRow - 1, ActiveColumn - 1)) Then
                Cells(ActiveRow - 1, 1) = UniqueId
            End If
              
        End If

    End If

End Sub

