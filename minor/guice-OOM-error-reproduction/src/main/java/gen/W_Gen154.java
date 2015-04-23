
  package gen;
  public class W_Gen154 {
  		@com.google.inject.Inject
  		public W_Gen154(W_Gen155 w_gen155){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen155 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  