
  package gen;
  public class Z_Gen17 {
  		@com.google.inject.Inject
  		public Z_Gen17(Z_Gen18 z_gen18){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen18 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  