package com.expense.model;

import java.util.List;

public class RevUser {
	
	//Fields that match PostgreSQL columns
			private int id;
			private String username;
			private String firstName;
			private String lastName;
			public String email;
			private String password;
			private String role;
					
	
	public RevUser( ) {
		super();
	}
		public RevUser(int id, String username, String firstName, String lastName, String email, String password,
				String role) {
			super();
			this.id = id;
			this.username = username;
			this.firstName = firstName;
			this.lastName = lastName;
			this.email = email;
			this.password = password;
			this.role = role;
		}
		
		//Getters and Setters
		public int getId() {
				return id;
			}
		public void setId(int id) {
				this.id = id;
			}
		public String getUsername() {
							return username;
						}
		public void setUsername(String username) {
							this.username = username;
						}
						
		public String getPassword() {
						return password;
					}
		public void setPassword(String password) {
						this.password = password;
					}
					
		public String getRole() {
							return role;
						}
		public void setRole(String role) {
							this.role = role;
						}
	
		public String getFirstName() {
				return firstName;
			}
		public void setFirstName(String firstName) {
				this.firstName = firstName;
			}
			
			
		public String getLastName() {
					return lastName;
				}
		public void setLastName(String lastName) {
					this.lastName = lastName;
				}
				
			
		public String getEmail() {
				return email;
			}
		public void setEmail(String email) {
				this.email = email;
			}
		
		/*
		 * hashCode is supposed to return the same integer value within the execution 
		 * of a program unless the Object used within the equals method changes
		 */
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((email == null) ? 0 : email.hashCode());
			result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
			result = prime * result + id;
			result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
			result = prime * result + ((password == null) ? 0 : password.hashCode());
			result = prime * result + ((role == null) ? 0 : role.hashCode());
			result = prime * result + ((username == null) ? 0 : username.hashCode());
			return result;
		}
		//equals method implements an equivalence relation on non-null objects
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			RevUser other = (RevUser) obj;
			if (email == null) {
				if (other.email != null)
					return false;
			} else if (!email.equals(other.email))
				return false;
			if (firstName == null) {
				if (other.firstName != null)
					return false;
			} else if (!firstName.equals(other.firstName))
				return false;
			if (id != other.id)
				return false;
			if (lastName == null) {
				if (other.lastName != null)
					return false;
			} else if (!lastName.equals(other.lastName))
				return false;
			if (password == null) {
				if (other.password != null)
					return false;
			} else if (!password.equals(other.password))
				return false;
			if (role == null) {
				if (other.role != null)
					return false;
			} else if (!role.equals(other.role))
				return false;
			if (username == null) {
				if (other.username != null)
					return false;
			} else if (!username.equals(other.username))
				return false;
			return true;
		}
		//returns a string consisting of the name of the class of which the object is an instance
		@Override
		public String toString() {
			return "RevUser [id=" + id + ", username=" + username + ", firstName=" + firstName + ", lastName="
					+ lastName + ", email=" + email + ", password=" + password + ", role=" + role + "]";
		}
		public void add(RevUser revuser) {
			// TODO Auto-generated method stub
			
		}
		//ordered collection
		public static List<RevUser> findAllRevUsers() {
			// TODO Auto-generated method stub
			return null;
		}
}

