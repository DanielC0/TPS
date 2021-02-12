def load_file():

	
	txt= open('example.txt','r').read()  
	strk = lines = txt.split('\n');
	str_out ="";
	for strln in strk:
		strnew = ""
		strint = strln.split('"')
		for wrds in strint:
			if(wrds != strint[len(strint) - 1]):
				strnew += wrds + "\\\""
			else:
				strnew += wrds
				
		str_out += "\"" + strnew + "\\n\" + \\" + "\n"
		
	obj_outpt_file= open("exampleongutput.txt", "w")
	obj_outpt_file.write(str_out)
	obj_outpt_file.close()

def main():
	load_file();


if __name__ == '__main__':
    main()
	
