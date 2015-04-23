
  package gen;
  public class Z_Gen147 {
  		@com.google.inject.Inject
  		public Z_Gen147(Z_Gen148 z_gen148){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen148 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  