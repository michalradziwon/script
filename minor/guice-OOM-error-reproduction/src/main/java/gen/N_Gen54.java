
  package gen;
  public class N_Gen54 {
  		@com.google.inject.Inject
  		public N_Gen54(N_Gen55 n_gen55){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen55 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  