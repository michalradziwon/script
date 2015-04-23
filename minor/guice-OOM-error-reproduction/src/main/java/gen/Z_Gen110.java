
  package gen;
  public class Z_Gen110 {
  		@com.google.inject.Inject
  		public Z_Gen110(Z_Gen111 z_gen111){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen111 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  