
  package gen;
  public class W_Gen162 {
  		@com.google.inject.Inject
  		public W_Gen162(W_Gen163 w_gen163){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen163 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  