
  package gen;
  public class Z_Gen146 {
  		@com.google.inject.Inject
  		public Z_Gen146(Z_Gen147 z_gen147){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen147 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  