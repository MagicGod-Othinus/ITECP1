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

    # Move the circle in all four directions, but constrain movement to within the screen
    if keys[pygame.K_RIGHT]:
        circleRect.x += 1
    if keys[pygame.K_LEFT]:
        circleRect.x -= 1
    if keys[pygame.K_UP]:
        circleRect.y -= 1
    if keys[pygame.K_DOWN]:
        circleRect.y += 1

    # Prevent the circle from going out of bounds (800x800 screen)
    if circleRect.left < 0:  # Left edge
        circleRect.left = 0
    if circleRect.right > 800:  # Right edge
        circleRect.right = 800
    if circleRect.top < 0:  # Top edge
        circleRect.top = 0
    if circleRect.bottom > 800:  # Bottom edge
        circleRect.bottom = 800

    # Fill the screen with a background color
    screen.fill((23, 23, 23))

    # Blit (draw) the image at its updated position
    screen.blit(circle, circleRect)

    # Update the display
    pygame.display.update()

# Quit Pygame
pygame.quit()
