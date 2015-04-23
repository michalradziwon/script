
  package gen;
  public class L_Gen110 {
  		@com.google.inject.Inject
  		public L_Gen110(L_Gen111 l_gen111){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen111 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  