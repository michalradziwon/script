
  package gen;
  public class Z_Gen173 {
  		@com.google.inject.Inject
  		public Z_Gen173(Z_Gen174 z_gen174){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen174 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  