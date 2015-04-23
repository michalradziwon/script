
  package gen;
  public class W_Gen152 {
  		@com.google.inject.Inject
  		public W_Gen152(W_Gen153 w_gen153){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen153 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  