
  package gen;
  public class B_Gen132 {
  		@com.google.inject.Inject
  		public B_Gen132(B_Gen133 b_gen133){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen133 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  