def main()
	begin
		f = 1
		puts "Please enter base number:"
		x = gets
		puts "Please enter system number:"
		y = gets
		x = x.to_i
		y = y.to_i
		if (x<0||y<=0||y>=36) then
			f = 0
		end
		if f==0 then
			puts "You have input the wrong number, please try again:"
		end
	end while f==0
	print "The result is:"
	to_base_n(x,y)
	puts ""
	puts "Press any key to exit..."
	x = gets
end

def to_base_n(base,n)
	temp = 0
	temp = base % n
	if base>=n then
		base = (base/n).floor.to_i
		to_base_n(base,n)
	end
	if temp<10 then
		putc (48+temp.to_i).chr
	else
		putc (55+temp.to_i).chr
	end
	return;
end

main()