
  package gen;
  public class Z_Gen115 {
  		@com.google.inject.Inject
  		public Z_Gen115(Z_Gen116 z_gen116){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen116 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  