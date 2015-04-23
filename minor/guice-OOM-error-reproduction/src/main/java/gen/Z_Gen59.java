
  package gen;
  public class Z_Gen59 {
  		@com.google.inject.Inject
  		public Z_Gen59(Z_Gen60 z_gen60){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen60 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  