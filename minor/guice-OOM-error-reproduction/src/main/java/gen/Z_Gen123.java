
  package gen;
  public class Z_Gen123 {
  		@com.google.inject.Inject
  		public Z_Gen123(Z_Gen124 z_gen124){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen124 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  