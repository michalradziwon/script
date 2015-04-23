
  package gen;
  public class Z_Gen80 {
  		@com.google.inject.Inject
  		public Z_Gen80(Z_Gen81 z_gen81){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen81 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  