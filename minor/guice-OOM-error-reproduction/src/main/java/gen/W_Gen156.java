
  package gen;
  public class W_Gen156 {
  		@com.google.inject.Inject
  		public W_Gen156(W_Gen157 w_gen157){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen157 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  