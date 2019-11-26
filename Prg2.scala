
object Prg2
{
	def main(args:Array[String])
	{
		var occ:Int=0
		println("Enter String:");
		var str1=Console.readLine();
	
		println("Enter String:");
		var str2:Char =Console.readChar;
			
		for(i<-0 until str1.length)
		{
			if(str1(i)==str2)
			{
				if(str1(i).isLower)
				{
					var c=Character.toUpperCase(str1(i))
				}
					else
					{
						str1(i).toUpper
					}
				occ+=1
			}
		}		
		println("occurence: "+occ)
		
	}
}
	
