sub test1
	
	ctr = ThisComponent.CurrentController
	sheet = ctr.getActiveSheet()
	
	
	A2 = sheet.getCellbyPosition(0,1)
	B2 = sheet.getCellbyPosition(1,1)
	D2 = sheet.getCellbyPosition(3,1)
	E2 = sheet.getCellbyPosition(4,1)
	
   '01.01.2020 - 10.01.2020 1%
	G2 = sheet.getCellbyPosition(6,1)
	H2 = sheet.getCellbyPosition(7,1)
	I2 = sheet.getCellbyPosition(8,1)
	
   '01.02.2020 - 10.02.2020 2%
	G3 = sheet.getCellbyPosition(6,2)
	H3 = sheet.getCellbyPosition(7,2)
	I3 = sheet.getCellbyPosition(8,2)
	
   '01.03.2020 - 10.03.2020 3%
	G4 = sheet.getCellbyPosition(6,3)
	H4 = sheet.getCellbyPosition(7,3)
	I4 = sheet.getCellbyPosition(8,3)
	
   '01.04.2020 - 10.04.2020 4%
	G5 = sheet.getCellbyPosition(6,4)
	H5 = sheet.getCellbyPosition(7,4)
	I5 = sheet.getCellbyPosition(8,4)
	
	
	Dim koplateval as Double
	
	result = D2.Value
	
	For counter = A2.Value To B2.Value
		If (counter >= G2.Value And counter <= H2.Value) Then 
			'msgbox Format(counter, "dd.mm.yyyy") & " - yes!"
			'msgbox G2.Value & " <= " & counter & " <= " & H2.Value & " -- YES" 
			result = result + (D2.Value * I2.Value / 100)
			msgbox Format(counter, "dd.mm.yyyy") & " result: " & result 
		Else 		
		End If
		
		If (counter >= G3.Value And counter <= H3.Value) Then 
			'msgbox Format(counter, "dd.mm.yyyy") & " - yes!"
			'msgbox G3.Value & " <= " & counter & " <= " & H3.Value & " -- YES" 
			result = result + (D2.Value * I3.Value / 100)
			msgbox Format(counter, "dd.mm.yyyy") & " result: " & result 
		Else 		
		End If
		
			
		If (counter >= G4.Value And counter <= H4.Value) Then 
			'msgbox Format(counter, "dd.mm.yyyy") & " - yes!"
			'msgbox G4.Value & " <= " & counter & " <= " & H4.Value & " -- YES" 
			result = result + (D2.Value * I4.Value / 100)
			msgbox Format(counter, "dd.mm.yyyy") & " result: " & result 
		Else 		
		End If
		
				
		If (counter >= G5.Value And counter <= H5.Value) Then 
			'msgbox Format(counter, "dd.mm.yyyy") & " - yes!"
			'msgbox G5.Value & " <= " & counter & " <= " & H5.Value & " -- YES" 
			result = result + (D2.Value * I5.Value / 100)
			msgbox Format(counter, "dd.mm.yyyy") & " result: " & result 
		Else 		
		End If			
		
		
		'msgbox Format(counter, "dd.mm.yyyy")
	Next counter
	
	E2.String = result
		
	G6 = sheet.getCellbyPosition(6,10)
	
		If (G6.Value = 0) Then 
			'msgbox "empty"

		Else 
			'msgbox "not empty"
		End If
		
	'msgbox "завершено"
    
end sub
