
  package gen;
  public class P_Gen110 {
  		@com.google.inject.Inject
  		public P_Gen110(P_Gen111 p_gen111){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen111 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  