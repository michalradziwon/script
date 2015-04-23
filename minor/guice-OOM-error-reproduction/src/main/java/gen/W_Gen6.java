
  package gen;
  public class W_Gen6 {
  		@com.google.inject.Inject
  		public W_Gen6(W_Gen7 w_gen7){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen7 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  