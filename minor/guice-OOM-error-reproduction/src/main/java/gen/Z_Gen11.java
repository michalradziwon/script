
  package gen;
  public class Z_Gen11 {
  		@com.google.inject.Inject
  		public Z_Gen11(Z_Gen12 z_gen12){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen12 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  