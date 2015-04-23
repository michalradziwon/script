
  package gen;
  public class W_Gen150 {
  		@com.google.inject.Inject
  		public W_Gen150(W_Gen151 w_gen151){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen151 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  