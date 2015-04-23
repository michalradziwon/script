
  package gen;
  public class W_Gen153 {
  		@com.google.inject.Inject
  		public W_Gen153(W_Gen154 w_gen154){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen154 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  