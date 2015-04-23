
  package gen;
  public class W_Gen170 {
  		@com.google.inject.Inject
  		public W_Gen170(W_Gen171 w_gen171){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen171 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  