
  package gen;
  public class J_Gen110 {
  		@com.google.inject.Inject
  		public J_Gen110(J_Gen111 j_gen111){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen111 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  