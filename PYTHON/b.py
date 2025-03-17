import pygame

pygame.init()

# Set up the display
screen = pygame.display.set_mode((800, 800))

# Load the circle image with transparency support
circle = pygame.image.load('circle.png').convert_alpha()

# Get the rectangle of the image
circleRect = circle.get_rect()

# Game loop
running = True
while running:
    # Event handling
    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            running = False

    # Get the state of all keys
    keys = pygame.key.get_pressed()

    # Move the circle left when the left arrow key is pressed
    if keys[pygame.K_LEFT]:
        circleRect.x -= 5  # Move the image left by 5 pixels

    # Fill the screen with a background color
    screen.fill((23, 23, 23))

    # Blit (draw) the image at its updated position
    screen.blit(circle, circleRect)  # Use the updated circleRect for positioning

    # Update the display
    pygame.display.update()

# Quit Pygame
pygame.quit()
