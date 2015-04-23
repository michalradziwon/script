
  package gen;
  public class Z_Gen20 {
  		@com.google.inject.Inject
  		public Z_Gen20(Z_Gen21 z_gen21){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen21 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  