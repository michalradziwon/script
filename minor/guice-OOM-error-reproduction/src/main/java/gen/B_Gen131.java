
  package gen;
  public class B_Gen131 {
  		@com.google.inject.Inject
  		public B_Gen131(B_Gen132 b_gen132){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen132 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  