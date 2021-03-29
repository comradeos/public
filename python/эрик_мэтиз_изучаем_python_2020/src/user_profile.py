def build_profile(first, last, **user_info):
    """строит словарь с информацией о пользователе"""
    user_info['first name'] = first
    user_info['last name'] = last
    return user_info


io = build_profile('iaroslav', 'os', location='ukraine', field='it')
print(io)