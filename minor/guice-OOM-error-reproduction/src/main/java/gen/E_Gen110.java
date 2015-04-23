
  package gen;
  public class E_Gen110 {
  		@com.google.inject.Inject
  		public E_Gen110(E_Gen111 e_gen111){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen111 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  