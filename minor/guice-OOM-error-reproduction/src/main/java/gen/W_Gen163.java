
  package gen;
  public class W_Gen163 {
  		@com.google.inject.Inject
  		public W_Gen163(W_Gen164 w_gen164){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen164 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  