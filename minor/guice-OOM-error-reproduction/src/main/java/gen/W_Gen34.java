
  package gen;
  public class W_Gen34 {
  		@com.google.inject.Inject
  		public W_Gen34(W_Gen35 w_gen35){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen35 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  