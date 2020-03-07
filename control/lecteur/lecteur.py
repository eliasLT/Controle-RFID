from smartcard.System import readers
from smartcard.util import toHexString
from smartcard.ATR import ATR
from smartcard.CardType import AnyCardType
from smartcard.CardRequest import CardRequest
from smartcard.CardConnectionObserver import ConsoleCardConnectionObserver
from smartcard.Exceptions import CardRequestTimeoutException

import sys
import datetime

# if len(sys.argv) < 2:
# 	print "usage: nfcTool.py <command>\nList of available commands: help, mute, unmute, getuid, info, loadkey, read, firmver"
# 	sys.exit()
def method() :
		
	r = readers()
	if len(r) < 1:
		print "error: No readers available!"
		sys.exit()

	print "Available readers: ", r

	reader = r[0]
	print "Using: ", reader


	cardtype = AnyCardType()
	cardrequest = CardRequest( timeout=10, cardType=cardtype )

	cardservice = cardrequest.waitforcard()
	observer=ConsoleCardConnectionObserver()
	cardservice.connection.addObserver( observer )
	cardservice.connection.connect()

	# connection = reader.createConnection()
	# connection.connect()

	#detect command
	# cmd = sys.argv[1]
	cmd = "getuid"

	myFile = open("test.txt", "a+")


	if cmd == "help":
		print "usage: python nfctool.py <command>\nList of available commands: help, mute, unmute, getuid"
		print "Before executing command, make sure that a card is being tagged on the reader."
		print "\thelp\tShow this help page"
		print "\tmute\tDisable beep sound when card is tagged."
		print "\tunmute\tEnable beep sound when card is tagged."
		print "\tgetuid\tPrint UID of the tagged card."
		print "\tinfo\tPrint card type and available protocols."
		print "\tloadkey <key>\tLoad key <key> (6byte hexstring) for auth."
		print "\tread <sector>\tRead sector <sector> with loaded key."
		#print "\tread [-s <sector>] [-h | -a] [-d | -t] \tRead sector <sector> (or all sectors) with loaded key. Print as [hex | ascii]. Print [data only | trailer only]"
		print "\tfirmver\tPrint the firmware version of the reader."
		sys.exit()

	cmdMap = {
		"mute":[0xFF, 0x00, 0x52, 0x00, 0x00],
		"unmute":[0xFF, 0x00, 0x52, 0xFF, 0x00],
		"getuid":[0xFF, 0xCA, 0x00, 0x00, 0x00],
		"firmver":[0xFF, 0x00, 0x48, 0x00, 0x00],
	}

	COMMAND = cmdMap.get(cmd, cmd)
	
	#send command
	if type(COMMAND) == list:
		# data, sw1, sw2 = connection.transmit(COMMAND)
		data, sw1, sw2 = cardservice.connection.transmit(COMMAND)
		# if cmd == "firmver":
		# 	print cmd +": "+ ''.join(chr(i) for i in data)+chr(sw1)+chr(sw2)
		# else:
		current_time = datetime.datetime.now()
		myFile.write(toHexString(data)+"#" +  str(current_time) + "\n")
			# print cmd + ": " + toHexString(data)
			# print "Status words: %02X %02X" % (sw1, sw2)
		if (sw1, sw2) == (0x90, 0x0):
			print "Status: The operation completed successfully."
		elif (sw1, sw2) == (0x63, 0x0):
			print "Status: The operation failed."



while True:
	try :
		method()
	except CardRequestTimeoutException as err:
		print "timeout"