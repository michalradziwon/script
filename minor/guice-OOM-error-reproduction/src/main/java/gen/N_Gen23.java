
  package gen;
  public class N_Gen23 {
  		@com.google.inject.Inject
  		public N_Gen23(N_Gen24 n_gen24){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen24 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  