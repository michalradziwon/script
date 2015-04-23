
  package gen;
  public class N_Gen5 {
  		@com.google.inject.Inject
  		public N_Gen5(N_Gen6 n_gen6){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen6 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  