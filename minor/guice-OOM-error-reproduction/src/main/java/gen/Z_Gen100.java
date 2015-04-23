
  package gen;
  public class Z_Gen100 {
  		@com.google.inject.Inject
  		public Z_Gen100(Z_Gen101 z_gen101){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen101 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  