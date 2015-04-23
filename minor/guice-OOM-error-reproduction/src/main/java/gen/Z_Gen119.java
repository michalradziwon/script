
  package gen;
  public class Z_Gen119 {
  		@com.google.inject.Inject
  		public Z_Gen119(Z_Gen120 z_gen120){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen120 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  