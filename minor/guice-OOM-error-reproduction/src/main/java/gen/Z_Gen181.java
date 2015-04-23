
  package gen;
  public class Z_Gen181 {
  		@com.google.inject.Inject
  		public Z_Gen181(Z_Gen182 z_gen182){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen182 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  