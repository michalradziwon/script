
  package gen;
  public class W_Gen23 {
  		@com.google.inject.Inject
  		public W_Gen23(W_Gen24 w_gen24){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen24 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  