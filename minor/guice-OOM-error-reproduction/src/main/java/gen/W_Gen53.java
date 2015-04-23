
  package gen;
  public class W_Gen53 {
  		@com.google.inject.Inject
  		public W_Gen53(W_Gen54 w_gen54){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen54 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  