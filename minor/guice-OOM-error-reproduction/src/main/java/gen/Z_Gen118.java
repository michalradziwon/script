
  package gen;
  public class Z_Gen118 {
  		@com.google.inject.Inject
  		public Z_Gen118(Z_Gen119 z_gen119){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen119 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  