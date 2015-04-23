
  package gen;
  public class B_Gen110 {
  		@com.google.inject.Inject
  		public B_Gen110(B_Gen111 b_gen111){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen111 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  