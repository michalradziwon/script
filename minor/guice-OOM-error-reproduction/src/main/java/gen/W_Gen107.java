
  package gen;
  public class W_Gen107 {
  		@com.google.inject.Inject
  		public W_Gen107(W_Gen108 w_gen108){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen108 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  