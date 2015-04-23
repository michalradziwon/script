
  package gen;
  public class Z_Gen22 {
  		@com.google.inject.Inject
  		public Z_Gen22(Z_Gen23 z_gen23){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen23 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  