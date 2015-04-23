
  package gen;
  public class H_Gen59 {
  		@com.google.inject.Inject
  		public H_Gen59(H_Gen60 h_gen60){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen60 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  