
  package gen;
  public class Z_Gen199 {
  		@com.google.inject.Inject
  		public Z_Gen199(Z_Gen200 z_gen200){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen200 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  