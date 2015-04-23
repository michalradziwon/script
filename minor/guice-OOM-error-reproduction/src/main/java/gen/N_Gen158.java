
  package gen;
  public class N_Gen158 {
  		@com.google.inject.Inject
  		public N_Gen158(N_Gen159 n_gen159){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen159 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  