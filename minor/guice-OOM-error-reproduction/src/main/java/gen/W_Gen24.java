
  package gen;
  public class W_Gen24 {
  		@com.google.inject.Inject
  		public W_Gen24(W_Gen25 w_gen25){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen25 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  