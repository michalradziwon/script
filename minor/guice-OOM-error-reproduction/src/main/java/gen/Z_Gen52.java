
  package gen;
  public class Z_Gen52 {
  		@com.google.inject.Inject
  		public Z_Gen52(Z_Gen53 z_gen53){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen53 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  