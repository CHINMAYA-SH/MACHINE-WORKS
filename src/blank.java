/*
 
 
 try
 
				{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/machine_works", "root", "");
					Statement stmt = con.createStatement();
					String username;
					String password;
					PreparedStatement insert;
					String sql = "insert into login values (username,password) values (?,?);";
					insert = con.prepareStatement("insert into login values (username,password) values (?,?);");
					insert.setString(1, username);
					insert.setString(2, password);		
					ResultSet rs = stmt.executeQuery(sql);
					if(rs.next())
					{
						JOptionPane.showMessageDialog(null,"login successful" );
						adminproducts prd = new adminproducts();
						prd.adminPrd();
						frame.dispose();
					}
					else
					{
						JOptionPane.showMessageDialog(null,"login unsuccessful" );
					}
				}
			catch(Exception E)
			{
				E.printStackTrace();
			
			}
		}
		
		
		
		
		signup sg = new signup();
		sg.signupStart();
		frame.dispose();
		
		
		about ab = new about();
		ab.aboutprj();
		frame.dispose();
		
		appointment ap = new appointment();
		ap.appointmentList();
		frame.dispose();
*/