
  package gen;
  public class N_Gen13 {
  		@com.google.inject.Inject
  		public N_Gen13(N_Gen14 n_gen14){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen14 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  