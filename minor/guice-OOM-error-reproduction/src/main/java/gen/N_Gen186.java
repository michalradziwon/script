
  package gen;
  public class N_Gen186 {
  		@com.google.inject.Inject
  		public N_Gen186(N_Gen187 n_gen187){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen187 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  