
  package gen;
  public class Z_Gen171 {
  		@com.google.inject.Inject
  		public Z_Gen171(Z_Gen172 z_gen172){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen172 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  