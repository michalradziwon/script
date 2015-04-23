
  package gen;
  public class N_Gen24 {
  		@com.google.inject.Inject
  		public N_Gen24(N_Gen25 n_gen25){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen25 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  