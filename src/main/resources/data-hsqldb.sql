INSERT INTO clients(id, first_name,last_name) VALUES (0,'Alexander','KIRILOV');
INSERT INTO clients(id, first_name,last_name) VALUES (1,'Plamena','DIMITROVA');

INSERT INTO bookings(booking_code, creation_time, from_time, until_time, client_id) VALUES ('BK001','2008-08-08 20:08:08+8:00','2008-08-10 20:08:08+8:00','2008-08-25 20:08:08+8:00',0);
INSERT INTO bookings(booking_code, creation_time, from_time, until_time, client_id) VALUES ('BK002','2012-01-11 20:08:08+2:00','2012-01-16 20:08:08+2:00','2012-01-30 20:08:08+2:00',1);
