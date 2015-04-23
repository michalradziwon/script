
  package gen;
  public class Z_Gen174 {
  		@com.google.inject.Inject
  		public Z_Gen174(Z_Gen175 z_gen175){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen175 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  