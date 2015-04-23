
  package gen;
  public class N_Gen167 {
  		@com.google.inject.Inject
  		public N_Gen167(N_Gen168 n_gen168){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen168 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  