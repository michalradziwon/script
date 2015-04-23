
  package gen;
  public class W_Gen25 {
  		@com.google.inject.Inject
  		public W_Gen25(W_Gen26 w_gen26){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen26 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  