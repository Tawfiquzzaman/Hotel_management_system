class NotAvailable extends Exception
{
    @Override
    public String toString()
    {
        return "Not Available !";//If a room is not available(Booked by others)
    }
}