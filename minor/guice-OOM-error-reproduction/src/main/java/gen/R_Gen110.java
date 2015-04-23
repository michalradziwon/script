
  package gen;
  public class R_Gen110 {
  		@com.google.inject.Inject
  		public R_Gen110(R_Gen111 r_gen111){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen111 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  