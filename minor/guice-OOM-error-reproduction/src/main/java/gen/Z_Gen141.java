
  package gen;
  public class Z_Gen141 {
  		@com.google.inject.Inject
  		public Z_Gen141(Z_Gen142 z_gen142){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen142 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  