
  package gen;
  public class W_Gen189 {
  		@com.google.inject.Inject
  		public W_Gen189(W_Gen190 w_gen190){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen190 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  