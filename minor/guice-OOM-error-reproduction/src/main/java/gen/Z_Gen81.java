
  package gen;
  public class Z_Gen81 {
  		@com.google.inject.Inject
  		public Z_Gen81(Z_Gen82 z_gen82){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen82 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  