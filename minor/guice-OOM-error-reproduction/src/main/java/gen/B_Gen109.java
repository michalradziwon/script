
  package gen;
  public class B_Gen109 {
  		@com.google.inject.Inject
  		public B_Gen109(B_Gen110 b_gen110){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen110 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  