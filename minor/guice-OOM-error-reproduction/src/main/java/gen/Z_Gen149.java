
  package gen;
  public class Z_Gen149 {
  		@com.google.inject.Inject
  		public Z_Gen149(Z_Gen150 z_gen150){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen150 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  