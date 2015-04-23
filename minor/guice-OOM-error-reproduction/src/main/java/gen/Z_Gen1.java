
  package gen;
  public class Z_Gen1 {
  		@com.google.inject.Inject
  		public Z_Gen1(Z_Gen2 z_gen2){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen2 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  