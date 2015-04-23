
  package gen;
  public class W_Gen173 {
  		@com.google.inject.Inject
  		public W_Gen173(W_Gen174 w_gen174){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen174 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  