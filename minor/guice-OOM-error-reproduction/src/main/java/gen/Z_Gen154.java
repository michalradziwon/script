
  package gen;
  public class Z_Gen154 {
  		@com.google.inject.Inject
  		public Z_Gen154(Z_Gen155 z_gen155){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen155 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  