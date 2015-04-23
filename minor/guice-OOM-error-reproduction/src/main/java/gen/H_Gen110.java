
  package gen;
  public class H_Gen110 {
  		@com.google.inject.Inject
  		public H_Gen110(H_Gen111 h_gen111){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen111 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  