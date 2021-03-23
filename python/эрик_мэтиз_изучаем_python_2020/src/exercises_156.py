print("8.6")


def city_country(city, country):
    return f"{city}, {country}".title()


kiev = city_country('kiev', 'ukraine')
vancouver = city_country('vancouver', 'canada')
barcelona = city_country('barcelona', 'spain')

print(f"{kiev}\n{vancouver}\n{barcelona}")


print("8.6")


def make_album(artist, album, number_of_tracks=None):
    album = {'artist': artist, 'album': album}
    if number_of_tracks:
        album['number of tracks'] = number_of_tracks
    return album


album_0 = make_album('new artist', 'new album', 27)
for key, value in album_0.items():
    print(f"{key.title()}: {str(value).title()}")


print("8.6")
print("_____________________________")
print("Making album (enter 'a' to break)")

albums = []


while True:
    prompt_artist = input("Enter an artist: \n\t > ")
    if prompt_artist == 'q':
        break
    prompt_album = input("Enter an album: \n\t > ")
    if prompt_album == 'q':
        break
    albums.append(make_album(prompt_artist, prompt_album))

for album in albums:
    for key, value in album.items():
        print(f"{key.title()}: {value.title()}")
    print()
