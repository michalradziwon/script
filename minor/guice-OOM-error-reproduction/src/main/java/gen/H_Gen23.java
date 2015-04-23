
  package gen;
  public class H_Gen23 {
  		@com.google.inject.Inject
  		public H_Gen23(H_Gen24 h_gen24){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen24 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  