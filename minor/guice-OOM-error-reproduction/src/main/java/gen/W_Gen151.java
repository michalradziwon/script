
  package gen;
  public class W_Gen151 {
  		@com.google.inject.Inject
  		public W_Gen151(W_Gen152 w_gen152){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen152 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  