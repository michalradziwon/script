
  package gen;
  public class Z_Gen194 {
  		@com.google.inject.Inject
  		public Z_Gen194(Z_Gen195 z_gen195){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen195 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  