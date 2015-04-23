
  package gen;
  public class Z_Gen8 {
  		@com.google.inject.Inject
  		public Z_Gen8(Z_Gen9 z_gen9){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen9 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  