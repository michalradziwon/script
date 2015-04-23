
  package gen;
  public class S_Gen110 {
  		@com.google.inject.Inject
  		public S_Gen110(S_Gen111 s_gen111){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen111 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  