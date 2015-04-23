
  package gen;
  public class Z_Gen2 {
  		@com.google.inject.Inject
  		public Z_Gen2(Z_Gen3 z_gen3){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen3 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  