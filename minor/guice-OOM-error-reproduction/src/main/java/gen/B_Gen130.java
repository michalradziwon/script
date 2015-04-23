
  package gen;
  public class B_Gen130 {
  		@com.google.inject.Inject
  		public B_Gen130(B_Gen131 b_gen131){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen131 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  