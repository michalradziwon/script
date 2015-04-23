
  package gen;
  public class Z_Gen143 {
  		@com.google.inject.Inject
  		public Z_Gen143(Z_Gen144 z_gen144){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen144 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  