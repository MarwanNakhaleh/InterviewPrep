class User < ApplicationRecord{
	default_scope { where: ("dob IS NOT NULL") }
	needs_birthday: { where: ("dob IS NULL")}
}