
  package gen;
  public class N_Gen178 {
  		@com.google.inject.Inject
  		public N_Gen178(N_Gen179 n_gen179){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen179 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  