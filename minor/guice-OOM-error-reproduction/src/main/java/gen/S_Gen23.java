
  package gen;
  public class S_Gen23 {
  		@com.google.inject.Inject
  		public S_Gen23(S_Gen24 s_gen24){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen24 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  