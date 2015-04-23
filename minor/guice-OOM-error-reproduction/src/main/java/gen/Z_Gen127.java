
  package gen;
  public class Z_Gen127 {
  		@com.google.inject.Inject
  		public Z_Gen127(Z_Gen128 z_gen128){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen128 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  