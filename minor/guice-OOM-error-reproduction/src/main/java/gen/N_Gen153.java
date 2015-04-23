
  package gen;
  public class N_Gen153 {
  		@com.google.inject.Inject
  		public N_Gen153(N_Gen154 n_gen154){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen154 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  