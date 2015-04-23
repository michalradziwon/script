
  package gen;
  public class W_Gen13 {
  		@com.google.inject.Inject
  		public W_Gen13(W_Gen14 w_gen14){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen14 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  