
  package gen;
  public class Z_Gen3 {
  		@com.google.inject.Inject
  		public Z_Gen3(Z_Gen4 z_gen4){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen4 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  