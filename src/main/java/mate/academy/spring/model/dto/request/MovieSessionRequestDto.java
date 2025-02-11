package mate.academy.spring.model.dto.request;

import java.time.LocalDateTime;

public class MovieSessionRequestDto {
    private Long movieId;
    private Long cinemaHallId;
    private LocalDateTime showTime;

    public Long getMovieId() {
        return movieId;
    }

    public void setMovieId(Long movieId) {
        this.movieId = movieId;
    }

    public Long getCinemaHallId() {
        return cinemaHallId;
    }

    public void setCinemaHallId(Long cinemaHallId) {
        this.cinemaHallId = cinemaHallId;
    }

    public LocalDateTime getShowTime() {
        return showTime;
    }

    public void setShowTime(LocalDateTime showTime) {
        this.showTime = showTime;
    }

    @Override
    public String toString() {
        return "MovieSessionRequestDto{"
                + "movieId=" + movieId
                + ", cinemaHallId=" + cinemaHallId
                + ", showTime=" + showTime
                + '}';
    }
}
