Sub UniqueIds()

    LastRow = Cells(Rows.Count, 2).End(xlUp).Row
    
    ' MsgBox LastRow
    
    Dim X As Integer
        For Counter = 4 To LastRow
            If Not IsEmpty(Range("B" & Counter)) Then
            
                ' MsgBox "not empty, + value"
                
                CYear = CLng(Year(Now))
                CMonth = CLng(Month(Now))
                CDay = CLng(Day(Now))
                CHour = CLng(Hour(Now))
                CMinute = CLng(Minute(Now))
                CSecond = CLng(Second(Now))
                
                UniqueId = 10 * (CYear + CMonth + CDay + CHour + CMinute + CSecond) + Counter
                Range("A" & Counter).Value = UniqueId
            End If

            ' MsgBox Range("B" & counter)
            
        Next Counter
    
End Sub


