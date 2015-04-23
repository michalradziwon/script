
  package gen;
  public class N_Gen98 {
  		@com.google.inject.Inject
  		public N_Gen98(N_Gen99 n_gen99){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen99 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  