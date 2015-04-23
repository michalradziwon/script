
  package gen;
  public class Z_Gen19 {
  		@com.google.inject.Inject
  		public Z_Gen19(Z_Gen20 z_gen20){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen20 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  