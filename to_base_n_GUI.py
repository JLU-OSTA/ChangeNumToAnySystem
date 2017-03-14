from tkinter import *
import os

class to_base_n():
	def __init__(self):
		windows = Tk()
		windows.title("To_Base_n")
		frame = Frame(windows)
		text = Label(windows, text = "Please enter base number and system number below: ")
		text.pack()
		self.base = IntVar()
		entry1 = Entry(frame, textvariable = self.base)
		self.system = IntVar()
		entry2 = Entry(frame, textvariable = self.system)
		label1 = Label(frame, text = "Base:")
		label2 = Label(frame, text = "System:")
		self.result = StringVar()
		button = Button(frame, text = "Go!", command = self.go)
		label1.grid(row = 1, column = 1)
		entry1.grid(row = 1, column = 2)
		label2.grid(row = 1, column = 3)
		entry2.grid(row = 1, column = 4)
		button.grid(row = 1, column = 5)
		frame.pack()
		frame2 = Frame(windows)
		result0 = Label(frame2, text = "The result is:")
		result1 = Label(frame2, textvariable = self.result)
		result0.grid(row = 1, column = 1)
		result1.grid(row = 1, column = 2)
		frame2.pack()

		windows.mainloop()

	def go(self):
		self.restr = []
		if self.system.get() != 0:
			self.n_go_base(self.base.get(),self.system.get())
			self.result.set(self.restr)
		else:
			self.result.set("The system is Zero!!!")

	def n_go_base(self, x, y):
		if y >= 36:
			self.result.set("The system number is too large!!!")
			os._exit(0)
		temp = x % y
		self.restr = []
		if x >= y:
			x = x // y
			self.n_go_base(x,y)
		if y <= 10:
			self.restr.append(chr(temp + ord('0')))
		elif temp <= 10:
			self.restr.append(chr(temp + ord('0')))
		else:
			self.restr.append(chr(temp + ord('7')))

to_base_n()
