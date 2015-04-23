
  package gen;
  public class N_Gen91 {
  		@com.google.inject.Inject
  		public N_Gen91(N_Gen92 n_gen92){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen92 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  